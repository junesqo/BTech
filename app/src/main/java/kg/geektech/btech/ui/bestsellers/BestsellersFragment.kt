package kg.geektech.btech.ui.bestsellers

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import kg.geektech.btech.base.BaseFragment
import kg.geektech.btech.databinding.FragmentBestsellersBinding

class BestsellersFragment : BaseFragment<FragmentBestsellersBinding, BestsellersViewModel, NavController>() {
    override val viewModel: BestsellersViewModel by viewModels()

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentBestsellersBinding {
        return FragmentBestsellersBinding.inflate(inflater)
    }
}