package com.example.navigationtest.ui.code

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationtest.databinding.FragmentCodeBinding
import com.example.navigationtest.databinding.FragmentCodeItemBinding


class CodeListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentCodeBinding.inflate(inflater).apply {

        val headerContentList = listOf(
            /** title, path to content **/
            Pair("NavigationGraph", "file:///android_asset/GraphTotal.html"),
            Pair("MainLayout", "file:///android_asset/MainLayout.html"),
            Pair("MainActivity", "file:///android_asset/MainActivity.html"),
            Pair("Menus", "file:///android_asset/Menus.html"),
            Pair("FragmentLayout", "file:///android_asset/FragmentLayout.html"),
            Pair("FragmentClasses", "file:///android_asset/FragmentClasses.html"),
            Pair(
                "Destination/Action/DeepLink",
                "file:///android_asset/Destination_Action_DeepLink.html"
            ),
            Pair("SafeArgs", "file:///android_asset/SafeArgsTotal.html")
        )

        headerContentList.forEach { headerContentPair ->
            FragmentCodeItemBinding
                .inflate(layoutInflater, this.linearLayout, true)
                .apply {
                    textView.text = headerContentPair.first

                    root.setOnClickListener {

                        //navigate to
                        findNavController().navigate(

                            // a generated directionsObject
                            CodeListFragmentDirections

                                //which has an action associated with it
                                .actionCodeListFragmentDestToCodeDetailDest(

                                    // which takes arguments defined in the nav_graph
                                    headerContentPair.first,
                                    headerContentPair.second
                                )
                        )
                    }
                }
        }
    }.root
}
