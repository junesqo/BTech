package kg.geektech.btech.ui.signIn

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kg.geektech.btech.R
import kg.geektech.btech.base.BaseFragment
import kg.geektech.btech.databinding.FragmentSignInBinding

class SignInFragment : BaseFragment<FragmentSignInBinding, SignInViewModel, NavController>() {
    override val viewModel: SignInViewModel by viewModels()

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentSignInBinding {
        return FragmentSignInBinding.inflate(inflater)
    }

    override fun initView() {
        navController = NavController(requireContext())
    }

    override fun initListener() {
        binding.tvCreateAccount.setOnClickListener {
            navController = Navigation.findNavController(
                requireActivity(),
                R.id.nav_host_fragment_activity_main
            )
            navController.popBackStack()
            navController.navigate(R.id.navigation_sign_up)
        }
    }
}