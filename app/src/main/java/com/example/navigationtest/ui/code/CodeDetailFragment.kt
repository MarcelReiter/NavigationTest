package com.example.navigationtest.ui.code

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navigationtest.databinding.FragmentCodeDetailBinding
import com.example.navigationtest.ui.MainActivity


class CodeDetailFragment : Fragment() {

    private val navArgs: CodeDetailFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
        FragmentCodeDetailBinding.inflate(inflater).apply {

        // title
        (activity as MainActivity).title = navArgs.header

        // setting content
        webView.loadUrl(navArgs.pathToContent)

    }.root
}
