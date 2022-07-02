package kg.geektech.btech.ext

import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment


fun Fragment.checkWhetherSoftKeyboardIsOpenedOrNot(

): Boolean? {
    val inputMethodManager =
        context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?

    return inputMethodManager?.let { it.isActive }

}

val Fragment.isKeyboardVisible: Boolean?
    get() = ViewCompat.getRootWindowInsets(requireView())?.isVisible(WindowInsetsCompat.Type.ime())

