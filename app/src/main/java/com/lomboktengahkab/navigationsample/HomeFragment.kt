package com.lomboktengahkab.navigationsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.lomboktengahkab.navigationsample.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {


    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {

            val name = "Hello World"
            val umur = 30

            //membuat instance bundle
            // val bundle = Bundle()
            // menambahkan value pada bundle
            // bundle.putString(EXTRA_NAME, name)
            // aksi navigasi ke halaman login sengan membawa bundle
            // findNavController().navigate(R.id.action_home_to_login, bundle)
            

            val action = HomeFragmentDirections.actionHomeToLogin(name, umur)
            view.findNavController().navigate(action)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}