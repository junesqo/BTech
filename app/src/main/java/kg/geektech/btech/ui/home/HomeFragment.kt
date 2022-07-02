package kg.geektech.btech.ui.home

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import kg.geektech.btech.base.BaseFragment
import kg.geektech.btech.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel, NavController>(){
    override val viewModel: HomeViewModel by viewModels()

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater)
    }
}