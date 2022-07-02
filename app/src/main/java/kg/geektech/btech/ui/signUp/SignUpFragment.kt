package kg.geektech.btech.ui.signUp

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import kg.geektech.btech.base.BaseFragment
import kg.geektech.btech.databinding.FragmentSignUpBinding

class SignUpFragment : BaseFragment<FragmentSignUpBinding, SignUpViewModel, NavController>() {
    override val viewModel: SignUpViewModel by viewModels()

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentSignUpBinding {
        return FragmentSignUpBinding.inflate(inflater)
    }
}