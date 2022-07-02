package kg.geektech.btech.ui.signUp

import android.graphics.Color
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.ViewTreeObserver
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kg.geektech.btech.R
import kg.geektech.btech.base.BaseFragment
import kg.geektech.btech.databinding.FragmentSignUpBinding
import kg.geektech.btech.ext.isKeyboardVisible

class SignUpFragment : BaseFragment<FragmentSignUpBinding, SignUpViewModel, NavController>() {
    override val viewModel: SignUpViewModel by viewModels()

    private lateinit var onGlobalTreeListener: ViewTreeObserver.OnGlobalLayoutListener
    override fun inflateViewBinding(inflater: LayoutInflater): FragmentSignUpBinding {
        binding = FragmentSignUpBinding.inflate(inflater)
        return binding
    }

    override fun initView() {
        navController = NavController(requireContext())
    }

    override fun initListener() {
        onGlobalTreeListener = ViewTreeObserver.OnGlobalLayoutListener {
            hideWarningWhenSoftKeyboardIsOpenedOrNot(
                actionWhenKeyboardIsOpened = {
                    binding.warning.isVisible = false
                },
                actionWhenKeyboardIsClosed = {
                    binding.warning.isVisible = true

                })
        }
        binding.tvSignIn.setOnClickListener {
            navController = Navigation.findNavController(
                requireActivity(),
                R.id.nav_host_fragment_activity_main
            )
            navController.popBackStack()
            navController.navigate(R.id.navigation_sign_in)
        }
        binding.etPassword.setOnKeyListener OnKeyListener@{ v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                return@OnKeyListener true
            }
            false
        }
    }

    private fun hideWarningWhenSoftKeyboardIsOpenedOrNot(
        actionWhenKeyboardIsClosed: (() -> Unit)? = null,
        actionWhenKeyboardIsOpened: (() -> Unit)? = null,
    ) {
        when (isKeyboardVisible) {
            true -> actionWhenKeyboardIsOpened?.invoke()
            else -> actionWhenKeyboardIsClosed?.invoke()
        }
    }

    override fun onResume() {
        super.onResume()
        requireView().viewTreeObserver.addOnGlobalLayoutListener(onGlobalTreeListener)
    }

    override fun onPause() {
        super.onPause()
        requireView().viewTreeObserver.removeOnGlobalLayoutListener(onGlobalTreeListener)
    }
}