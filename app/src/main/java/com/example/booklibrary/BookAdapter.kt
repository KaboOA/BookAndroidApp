package com.example.booklibrary

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.booklibrary.databinding.BookItemBinding


class BookAdapter(val data: List<BookModel>) :
    ListAdapter<BookModel, BookAdapter.MyViewHolder>(UserItemDiffCallback()) {

    class MyViewHolder(val bookItemBinding: BookItemBinding) :
        RecyclerView.ViewHolder(bookItemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            BookItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bookItemBinding.book = data[position]

    }
}

class UserItemDiffCallback : DiffUtil.ItemCallback<BookModel>() {
    override fun areItemsTheSame(oldItem: BookModel, newItem: BookModel): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: BookModel, newItem: BookModel): Boolean {
        return oldItem == newItem
    }

}