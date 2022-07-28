package kg.geektech.btech.ui.profile

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kg.geektech.btech.R
import kg.geektech.btech.base.BaseFragment
import kg.geektech.btech.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment<FragmentProfileBinding, ProfileViewModel, NavController>() {
    override val viewModel: ProfileViewModel by viewModels()

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(inflater)
    }

    override fun initListener() {
        binding.btnFavorite.setOnClickListener {
            navController = Navigation.findNavController(
                requireActivity(),
                R.id.nav_host_fragment_activity_main
            )
            navController.navigate(R.id.navigation_favorite)
        }
    }

}