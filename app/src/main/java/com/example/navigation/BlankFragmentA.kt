package com.example.mynavigationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigation.R
import com.example.navigation.databinding.FragmentBlankABinding


class AFragment : Fragment() {
    lateinit var binding: FragmentBlankABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankABinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonB.setOnClickListener { v ->
            val action = AFragmentDirections.actionAFragmentToBFragment("Hello World")
            Navigation.findNavController(v).navigate(action)

        }

        binding.buttonC.setOnClickListener { v ->
            Navigation.findNavController(v).navigate(R.id.action_AFragment_to_CFragment)
        }
    }


}