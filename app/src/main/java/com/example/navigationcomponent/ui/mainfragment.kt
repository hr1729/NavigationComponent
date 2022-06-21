package com.example.navigationcomponent.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentMainBinding

class mainfragment: Fragment(R.layout.fragment_main) {
    lateinit var navController: NavController
    lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)
        binding=FragmentMainBinding.bind(view)
        navController=Navigation.findNavController(view)
        binding.apply {
            viewTransactionsBtn.setOnClickListener {
                navController.navigate(R.id.action_mainfragment_to_viewTrascFragment)
            }
            viewBalanceBtn.setOnClickListener {
                navController.navigate(R.id.action_mainfragment_to_viewBalancedFragment)
            }
            sendMoneyBtn.setOnClickListener {
                navController.navigate(R.id.action_mainfragment_to_chooseRecieptFragment2)
            }
        }

    }
}