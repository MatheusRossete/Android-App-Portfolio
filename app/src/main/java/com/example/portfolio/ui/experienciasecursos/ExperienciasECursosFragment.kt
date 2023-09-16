package com.example.portfolio.ui.experienciasecursos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.portfolio.databinding.FragmentExperienciasCursosBinding

class ExperienciasECursosFragment : Fragment() {

    private var _binding: FragmentExperienciasCursosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(ExperienciasECursosViewModel::class.java)

        _binding = FragmentExperienciasCursosBinding.inflate(inflater, container, false)
        val root: View = binding.root


        dashboardViewModel.text.observe(viewLifecycleOwner) {

        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}