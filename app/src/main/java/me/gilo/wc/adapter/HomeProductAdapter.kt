package me.gilo.wc.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import me.gilo.wc.R
import me.gilo.wc.adapter.viewholder.ProductViewHolder
import me.gilo.woodroid.models.Product

class HomeProductAdapter(private val products: List<Product>) : RecyclerView.Adapter<ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            parent.context,
            LayoutInflater.from(parent.context).inflate(R.layout.single_home_product_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.renderView(products[position])
    }


    override fun getItemCount(): Int {
        return if (products.isEmpty()) 0 else products.size
    }
}
