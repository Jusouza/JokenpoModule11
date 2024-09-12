package com.example.jokenpo_module11

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import com.example.jokenpo_module11.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("Lifecycle", "onCreate")
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        editText = binding.editTextText2

        if(savedInstanceState?.containsKey("editTextValue")== true){
            val value = savedInstanceState.getString("editTextValue")
            editText.setText(value)
        }

        Log.d("Lifecycle", "onCreateView")

       binding.btnStartActivity.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToGameNav2()
           findNavController().navigate(action)
        }

        lifecycle.addObserver(CustomObserver())

        return binding.root
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString("editTextValue", editText.text.toString())
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "OnResume")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Lifecycle", "onDetach")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Lifecycle", "onAttach")

    }

}