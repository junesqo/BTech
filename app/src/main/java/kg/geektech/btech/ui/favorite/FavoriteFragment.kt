package kg.geektech.btech.ui.favorite

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import kg.geektech.btech.base.BaseFragment
import kg.geektech.btech.databinding.FragmentFavoriteBinding

class FavoriteFragment : BaseFragment<FragmentFavoriteBinding, FavoriteViewModel, NavController>() {

    override val viewModel: FavoriteViewModel by viewModels()

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentFavoriteBinding {
        return FragmentFavoriteBinding.inflate(inflater)
    }
}