package com.example.navigationtest.ui.destination

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationtest.R
import com.example.navigationtest.databinding.FragmentDestinationCBinding

class DestinationCFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) =

        FragmentDestinationCBinding.inflate(layoutInflater).apply {
            continueButton.setOnClickListener {
                findNavController()
                    .createDeepLink()
                    .setGraph(R.navigation.navigation_graph)
                    .setDestination(R.id.CodeListFragmentDest)
                    .createTaskStackBuilder()
                    .startActivities()
            }
        }.root
}
