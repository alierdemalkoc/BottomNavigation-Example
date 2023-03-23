package com.alierdemalkoc.bottomnavigationexample.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alierdemalkoc.bottomnavigationexample.R
import com.alierdemalkoc.bottomnavigationexample.databinding.FragmentHomeBinding
import com.alierdemalkoc.bottomnavigationexample.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.detailButton.setOnClickListener {
            findNavController().navigate(R.id.actionProfileToDetails)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}