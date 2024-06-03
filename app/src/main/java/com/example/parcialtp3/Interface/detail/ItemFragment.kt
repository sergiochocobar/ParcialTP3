package com.example.probandovista2.Interface.detail

import androidx.fragment.app.viewModels
import androidx.fragment.app.Fragment
import android.view.View

class ItemFragment : Fragment() {

    lateinit var vista: View

    companion object {
        fun newInstance() = ItemFragment()
    }

    private val viewModel: ItemResultsViewModel by viewModels()


