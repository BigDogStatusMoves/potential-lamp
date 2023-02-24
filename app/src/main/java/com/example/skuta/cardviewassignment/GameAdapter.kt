package com.example.skuta.cardviewassignment

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GameAdapter (var context: Context, var gamesList: ArrayList<GamesModel>): RecyclerView.Adapter<GameAdapter.GameCardViewHolder>() {

    class GameCardViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        var gameImage = itemView.findViewById<ImageView>(R.id.games_image)
        var gameTitle = itemView.findViewById<TextView>(R.id.game_title)
        var gamePrice = itemView.findViewById<TextView>(R.id.game_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameCardViewHolder {
        val newView = LayoutInflater.from(parent.context).inflate(R.layout.games_item_card,parent,false)
        return GameCardViewHolder(newView)
    }

    override fun getItemCount(): Int {
        return gamesList.size
    }

    override fun onBindViewHolder(holder: GameCardViewHolder, position: Int) {
        var myGameCard: GamesModel = gamesList.get(position)
        holder.gameImage.setImageResource(myGameCard.gameImage!!)
        holder.gameTitle.text = myGameCard.gameTitle
        holder.gamePrice.text = "$" + myGameCard.gamePrice.toString()

        holder.gameImage.setOnClickListener{
            Toast.makeText(context,"You selected: " + myGameCard.gameTitle, Toast.LENGTH_LONG).show()
        }
    }
}