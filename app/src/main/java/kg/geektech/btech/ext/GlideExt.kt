package kg.geektech.btech.ext

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadWithGlide(url: String) {
    Glide.with(this).load(url).into(this)
}