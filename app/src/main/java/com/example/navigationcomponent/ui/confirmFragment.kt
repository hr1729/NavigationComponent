package com.example.navigationcomponent.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentChooseRecipientBinding
import com.example.navigationcomponent.databinding.FragmentConfirmationBinding
import com.example.navigationcomponent.databinding.FragmentSpecifyAmountBinding

class confirmFragment:Fragment(R.layout.fragment_confirmation) {
lateinit var binding:FragmentConfirmationBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentConfirmationBinding.bind(view)
        val receipent=requireArguments().getString("nme")
        val money=requireArguments().getInt("money")
        binding.confirmationMessage.text="$ $money was send to $receipent"
    }
}