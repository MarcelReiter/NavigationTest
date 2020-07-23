package com.example.navigationtest.ui.overflow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationtest.R
import com.example.navigationtest.databinding.FragmentOverflowTestBinding

class OverflowTestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) =

        FragmentOverflowTestBinding.inflate(layoutInflater).apply {
            setHasOptionsMenu(true)
        }.root

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.overflow_nav_menu, menu)
    }
}
