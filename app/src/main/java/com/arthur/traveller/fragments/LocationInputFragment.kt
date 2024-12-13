package com.arthur.traveller.fragments

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arthur.traveller.R
import com.arthur.traveller.viewModel.LocationInputViewModel

class LocationInputFragment : Fragment() {

    companion object {
        fun newInstance() = LocationInputFragment()
    }

    private val viewModel: LocationInputViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_location_input, container, false)
    }
}