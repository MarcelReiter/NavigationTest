package com.example.navigationtest.ui.drawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationtest.R
import com.example.navigationtest.databinding.FragmentDrawerDBinding

class DrawerDFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) =

        FragmentDrawerDBinding.inflate(layoutInflater).root
}
