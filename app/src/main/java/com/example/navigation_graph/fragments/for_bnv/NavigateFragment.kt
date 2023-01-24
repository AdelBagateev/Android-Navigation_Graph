package com.example.navigation_graph.fragments.for_bnv

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.navigation_graph.R
import com.example.navigation_graph.databinding.FragmentNavigateBinding

class NavigateFragment:Fragment(R.layout.fragment_navigate) {
    var binding : FragmentNavigateBinding ?= null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNavigateBinding.bind(view)
        val controller =
            findNavController()
        binding?.run {
            btnDanil.setOnClickListener {
                controller.navigate(R.id.action_navigateFragment2_to_danilFragment)
            }
            btnIlia.setOnClickListener {
                controller.navigate(R.id.action_navigateFragment2_to_iliaFragment)
            }
            btnKolya.setOnClickListener {
                controller.navigate(R.id.action_navigateFragment2_to_kolyaFragment)
            }
            btnMasha.setOnClickListener {
                controller.navigate(R.id.action_navigateFragment2_to_mashaFragment)
            }
        }
    }
}