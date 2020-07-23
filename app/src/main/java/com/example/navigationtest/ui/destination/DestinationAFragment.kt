package com.example.navigationtest.ui.destination

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.navigationtest.R
import com.example.navigationtest.databinding.FragmentDestinationABinding

class DestinationAFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) =

        FragmentDestinationABinding.inflate(layoutInflater).apply {

            val options = navOptions {
                anim {
                    enter = R.anim.slide_in_right
                    exit = R.anim.slide_out_left
                    popEnter = R.anim.slide_in_left
                    popExit = R.anim.slide_out_right
                }
            }

            continueButton.setOnClickListener {
                findNavController().navigate(R.id.DestinationBDest, null, options)
            }
        }.root
}
