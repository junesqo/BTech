package kg.geektech.btech.ui.basket

import android.view.LayoutInflater
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import kg.geektech.btech.base.BaseFragment
import kg.geektech.btech.databinding.FragmentBasketBinding

class BasketFragment : BaseFragment<FragmentBasketBinding, BasketViewModel, NavController>() {
    override val viewModel: BasketViewModel by viewModels()

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentBasketBinding {
        return FragmentBasketBinding.inflate(inflater)
    }
}