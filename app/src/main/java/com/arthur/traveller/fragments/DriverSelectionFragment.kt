package com.arthur.traveller.fragments

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arthur.traveller.R
import com.arthur.traveller.viewModel.DriverSelectionViewModel

class DriverSelectionFragment : Fragment() {

    companion object {
        fun newInstance() = DriverSelectionFragment()
    }

    private val viewModel: DriverSelectionViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_driver_selection, container, false)
    }
}