package com.anggitprayogo.alchemist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


/**
 * Created by Anggit Prayogo on 14,November,2020
 * GitHub : https://github.com/anggit97
 */
class ListAdapter : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    private var list = mutableListOf<DataExample>()

    fun setItems(list: MutableList<DataExample>) {
        this.list = list
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItem(dataExample: DataExample) {
            with(itemView) {
                val tvList = findViewById<TextView>(R.id.tvList)
                tvList.text = dataExample.namaUnsur
            }
        }
    }

    //Menentukan berapa banyak item yang ditampilkan
    override fun getItemCount(): Int = list.size

    //Untuk menempilkan data ke view item (row_item_list)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list[position])
    }

    //Untuk menentukan item mana yang ingin digunakan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.row_item_list, parent, false)
        return ViewHolder(view)
    }
}