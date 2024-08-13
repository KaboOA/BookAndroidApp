package com.example.booklibrary

import android.widget.TextView
import androidx.databinding.BindingAdapter

class BookBindingAdapter {

    companion object{
        @BindingAdapter("customAuthor")
        @JvmStatic
        fun TextView.setCustomAuthor(item: String) {
            text = "by $item"
        }
    }

}