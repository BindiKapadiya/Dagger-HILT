package com.example.daggerdemo.dagger_mvvm

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.daggerdemo.dagger_mvvm.model.Product
import com.example.daggerdemo.dagger_mvvm.viewmodels.MainViewModel
import com.example.daggerhilt.MyApplication
import com.example.daggerhilt.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FakerActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel


    private val textView: TextView
        get() = findViewById(R.id.textView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_faker)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        try {

            mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

            mainViewModel.productLiveData.observe(this, Observer {
                textView.text = it.joinToString { data: Product -> data.title + "\n\n" }
            })
        } catch (e: Exception) {
            Log.e("BINDI_TAG", "${e.message}" )
        }
    }
}