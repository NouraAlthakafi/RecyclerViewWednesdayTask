package com.example.recyclerviewofwednesday
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewofwednesday.RVSaudiCity.*
import kotlinx.android.synthetic.main.itemsaudicity.view.*
class RVSaudiCity(private val cities: List <String>): RecyclerView.Adapter<ItemViewHolder>() {
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.itemsaudicity, parent, false
            )
        )
    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val saudiCity = cities[position]
        holder.itemView.apply{
            tvSaudi.text = saudiCity
        }
    }
    override fun getItemCount()= cities.size
}