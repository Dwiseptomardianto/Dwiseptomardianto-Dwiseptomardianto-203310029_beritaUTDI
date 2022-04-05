package com.example.dwiseptomardianto_203310029.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dwiseptomardianto_203310029.R
import com.example.dwiseptomardianto_203310029.model.Affirmation


// dwi septo mardianto 203310029 : untuk menampilkan data afirmasi
class ItemAdapter (private val context: Context,
                   private val dataset: List<Affirmation>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // dwi septo mardianto 203310029 : untuk  menampilkan lebih dari 1 item untuk akses ke semua  item data
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    // dwi septo mardianto 203310029 : membuat teemplate list ite baru untu ditampilkan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return  ItemViewHolder(adapterLayout)
    }

   // dwi septo mardianto 203310029 : mengganti isi tampilan
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    // dwi septo mardianto 203310029 : mengembalikan data
    override fun getItemCount(): Int {
        return dataset.size
    }
}