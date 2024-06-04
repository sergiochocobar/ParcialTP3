package com.example.parcialtp3.Interface.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels


class ItemFragment : Fragment() {

    lateinit var vista: View

    companion object {
        fun newInstance() = ItemFragment()
    }

    private val viewModel: ItemResultsViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


}
