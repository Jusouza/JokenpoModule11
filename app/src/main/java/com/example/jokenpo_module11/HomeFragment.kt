package com.example.jokenpo_module11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jokenpo_module11.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)

       binding.btnStartActivity.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToGameNav2()
           findNavController().navigate(action)
        }

        return binding.root
    }

}