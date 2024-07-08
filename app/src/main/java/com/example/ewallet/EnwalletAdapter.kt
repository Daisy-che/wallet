package com.example.ewallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class EnwalletAdapter (var enwallet: List<Enwallet>):RecyclerView.Adapter<walletViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): walletViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.enwallet,parent,false)
        return walletViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return  enwallet.size
    }

    override fun onBindViewHolder(holder: walletViewHolder, position: Int) {
       val expense =enwallet[position]
        holder.tvOne.text=expense.salary
        holder.tvTwo.text=expense.amount
        holder.tvThree.text=expense.date
    }
}
class  walletViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvOne=itemView.findViewById<TextView>(R.id.tvA)
    var tvTwo=itemView.findViewById<TextView>(R.id.tvB)
    var tvThree=itemView.findViewById<TextView>(R.id.tvc)




}