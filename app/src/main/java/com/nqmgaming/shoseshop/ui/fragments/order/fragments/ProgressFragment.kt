package com.nqmgaming.shoseshop.ui.fragments.order.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nqmgaming.shoseshop.R
import com.nqmgaming.shoseshop.databinding.FragmentProgressBinding

private const val ARG_PARAM1 = "param1"

class ProgressFragment : Fragment() {
    private var param1: String? = null
    private var _binding: FragmentProgressBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProgressBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.progress.text = param1
    }
    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            ProgressFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }
}