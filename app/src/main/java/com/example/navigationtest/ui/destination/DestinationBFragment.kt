package com.example.navigationtest.ui.destination

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationtest.R
import com.example.navigationtest.databinding.FragmentDestinationBBinding

class DestinationBFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) =

        FragmentDestinationBBinding.inflate(layoutInflater).apply {

            continueButton.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_DestinationBDest_to_DestinationCDest)
            )

        }.root
}
