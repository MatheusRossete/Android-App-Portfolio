package com.example.portfolio.ui.sobre_mim

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.portfolio.databinding.FragmentSobreMimBinding

class SobreMimFragment : Fragment() {

    private var _binding: FragmentSobreMimBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(SobreMimViewModel::class.java)

        _binding = FragmentSobreMimBinding.inflate(inflater, container, false)
        val root: View = binding.root


        homeViewModel.text.observe(viewLifecycleOwner) {

        }
        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}