package com.example.portfolio.ui.contato

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.portfolio.databinding.FragmentContatoBinding

class ContatoFragment : Fragment() {

    private var _binding: FragmentContatoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this)[ContatoViewModel::class.java]

        _binding = FragmentContatoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.email.setOnClickListener {
            val recipientEmail = "matheusrossete7@outlook.com"

            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:$recipientEmail")
            }

            startActivity(Intent.createChooser(intent, "Send Email"))
        }



        notificationsViewModel.text.observe(viewLifecycleOwner) {

        }
        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}