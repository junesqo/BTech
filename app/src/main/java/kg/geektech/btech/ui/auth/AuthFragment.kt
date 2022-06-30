package kg.geektech.btech.ui.auth

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kg.geektech.btech.R
import kg.geektech.btech.base.BaseFragment
import kg.geektech.btech.databinding.FragmentAuthBinding

class AuthFragment : BaseFragment<FragmentAuthBinding, AuthViewModel, NavController>() {

    override val viewModel: AuthViewModel by viewModels()

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentAuthBinding {
        return FragmentAuthBinding.inflate(inflater)
    }

    override fun initView() {
        TODO("Not yet implemented")
    }

    override fun initListener() {
        binding.btnSignUp.setOnClickListener {
            navController = Navigation.findNavController(
                requireActivity(),
                R.id.nav_host_fragment_activity_main
            )
            navController.navigate(R.id.navigation_sign_up)
        }
        binding.btnSignIn.setOnClickListener {
            navController = Navigation.findNavController(
                requireActivity(),
                R.id.nav_host_fragment_activity_main
            )
            navController.navigate(R.id.navigation_sign_in)
        }    }

    override fun initViewModel() {
        TODO("Not yet implemented")
    }

    override fun checkInternet() {
        TODO("Not yet implemented")
    }

}