package com.lomboktengahkab.navigationsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.lomboktengahkab.navigationsample.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

//    companion object {
//        const val EXTRA_NAME = "extra_name"
//        const val EXTRA_UMUR = "extra_umur"
//    }


    private var _binding: FragmentLoginBinding? = null
    private val args: LoginFragmentArgs by navArgs()
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //get data from bundle
        // val name = arguments?.getString(EXTRA_NAME)
        //val umur = arguments?.getInt(EXTRA_UMUR)
            //Aksi UI


        //val name = LoginFragmentArgs.fromBundle(arguments as Bundle).argsName
        //val umur = LoginFragmentArgs.fromBundle(arguments as Bundle).argsUmur
            //Aksi UI

        //menggunakan delegasi navargs

        args.let {
            binding.name.text = args.argsName
            binding.umur.text = args.argsUmur.toString()
        }


    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}