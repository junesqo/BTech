package kg.geektech.btech.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB: ViewBinding, VM: BaseViewModel, NC:NavController>: Fragment() {
    protected lateinit var binding: VB
    protected abstract val viewModel: VM
    protected lateinit var navController: NC
    protected abstract fun inflateViewBinding(inflater: LayoutInflater): VB

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = inflateViewBinding(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        checkInternet()
        initView()
        initViewModel()
        initListener()
    }

    open fun initView() {} //вьюшки
    open fun initListener() {} //логика кликов
    open fun initViewModel() {} //обзерверы
    open fun checkInternet() {}
}