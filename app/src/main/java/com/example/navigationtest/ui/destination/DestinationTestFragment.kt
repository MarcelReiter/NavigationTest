package com.example.navigationtest.ui.destination

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationtest.R
import com.example.navigationtest.databinding.FragmentDestinationTestBinding

class DestinationTestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) =

        FragmentDestinationTestBinding.inflate(layoutInflater).apply {

            /* Traditionelle Alternative:
            continueButton.setOnClickListener { view ->
                view.findNavController().navigate(R.id.navigation_item_destination_a)
            }
             */

            continueButton.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.DestinationADest)
            )

        }.root
}
