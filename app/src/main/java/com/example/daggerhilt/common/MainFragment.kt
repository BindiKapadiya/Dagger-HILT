package com.example.daggerhilt.common

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.daggerdemo.dagger_mvvm.FakerActivity
import com.example.daggerhilt.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

//    @Inject
//    lateinit var userRepository: UserRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        userRepository.saveUser("abc.@gmail.com", "123")

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnMVVM = view.findViewById<Button>(R.id.btnMVVM)
        btnMVVM.setOnClickListener(View.OnClickListener {
            context?.startActivity(Intent(requireContext(), FakerActivity::class.java))
        })
    }
}