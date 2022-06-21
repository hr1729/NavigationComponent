package com.example.navigationcomponent.ui

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentSpecifyAmountBinding

class specifyamntFragment:Fragment(R.layout.fragment_specify_amount) {
    lateinit var navController: NavController
    lateinit var binding: FragmentSpecifyAmountBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentSpecifyAmountBinding.bind(view)
        navController= Navigation.findNavController(view)
            val txt=requireArguments().getString("nme")
            val msg="the Recepient is $txt"
          binding.recipient.text=msg

        binding.apply {
            sendBtn.setOnClickListener {
                val bundle= bundleOf("nme" to txt,"money" to inputAmount.text.toString().toInt())
                navController.navigate(R.id.action_specifyamntFragment_to_confirmFragment,bundle)
            }
            cancelBtn.setOnClickListener {
                activity?.let {
                    it.onBackPressed()
                }
            }
        }
    }
}