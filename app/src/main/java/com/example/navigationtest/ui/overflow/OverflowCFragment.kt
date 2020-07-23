package com.example.navigationtest.ui.overflow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationtest.databinding.FragmentOverflowCBinding

class OverflowCFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) =

        FragmentOverflowCBinding.inflate(layoutInflater).root
}
