package com.example.navigationtest.ui.drawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationtest.databinding.FragmentDrawerBBinding

class DrawerBFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) =

        FragmentDrawerBBinding.inflate(layoutInflater).root
}
