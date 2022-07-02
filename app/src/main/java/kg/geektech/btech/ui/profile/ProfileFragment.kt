package kg.geektech.btech.ui.profile

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import kg.geektech.btech.base.BaseFragment
import kg.geektech.btech.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment<FragmentProfileBinding, ProfileViewModel, NavController>() {
    override val viewModel: ProfileViewModel by viewModels()

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(inflater)
    }

}