package com.example.navigationcomponent.ui

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentChooseRecipientBinding

class chooseRecieptFragment:Fragment(R.layout.fragment_choose_recipient) {
    lateinit var navController: NavController
    lateinit var binding: FragmentChooseRecipientBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentChooseRecipientBinding.bind(view)
        navController=Navigation.findNavController(view)
        val txt=binding.inputRecipient.text.toString()
        binding.apply {
            nextBtn.setOnClickListener {
                if(!TextUtils.isEmpty(inputRecipient.text.toString())){
                    val bundle= bundleOf("nme" to inputRecipient.text.toString())
                    navController.navigate(R.id.action_chooseRecieptFragment2_to_specifyamntFragment,bundle)
                }
            }
            cancelBtn.setOnClickListener {
                activity?.let {
                    it.onBackPressed()
                }
            }
        }
    }
}