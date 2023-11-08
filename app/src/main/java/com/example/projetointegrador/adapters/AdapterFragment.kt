package com.example.projetointegrador.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.projetointegrador.FeedGeral
import com.example.projetointegrador.R
import com.example.projetointegrador.models.ImageItem

class AdapterFragment(private val context: Context, private val listaImagens: List<ImageItem>) : RecyclerView.Adapter<AdapterFragment.MeuViewHolder> () {

    class MeuViewHolder(itemView: View, val contexto: Context) : RecyclerView.ViewHolder(itemView) {

        val estiloImagem: ImageView = itemView.findViewById(R.id.estiloImagem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolder {
        var inflater: LayoutInflater = LayoutInflater.from(context)
        var view = inflater.inflate(R.layout.style_imagens, parent, false)

        return MeuViewHolder(view, context)
    }

    override fun onBindViewHolder(holder: MeuViewHolder, position: Int) {
        val imageItem = listaImagens[position]

        Glide.with(context)
            .load(imageItem.imageUrl)
            .into(holder.estiloImagem)
    }

    override fun getItemCount(): Int {
        return this.listaImagens.size
    }





}