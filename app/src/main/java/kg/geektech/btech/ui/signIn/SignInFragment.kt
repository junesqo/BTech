package kg.geektech.btech.ui.signIn

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import kg.geektech.btech.base.BaseFragment
import kg.geektech.btech.databinding.FragmentSignInBinding

class SignInFragment : BaseFragment<FragmentSignInBinding, SignInViewModel, NavController>() {
    override val viewModel: SignInViewModel by viewModels()

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentSignInBinding {
        return FragmentSignInBinding.inflate(inflater)
    }


}