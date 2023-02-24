package com.example.skuta.cardviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var grid: GridLayoutManager
    lateinit var myGameList: ArrayList<GamesModel>
    lateinit var myAdapter: GameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.games_recyclerview)
        grid = GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = grid
        recyclerView.setHasFixedSize(true)

        myGameList = insertData()

        myAdapter = GameAdapter(applicationContext, myGameList)
        recyclerView.adapter = myAdapter
    }


    private fun insertData(): java.util.ArrayList<GamesModel> {
        var list = java.util.ArrayList<GamesModel>()

        val gameNames = arrayOf(
            "Call of Duty: Modern Warfare II",
            "Counter-Strike: Global Offensive",
            "Dead By Daylight",
            "Guilty Gear -STRIVE-",
            "Guilty Gear Xrd REV 2",
            "League of Legends",
            "Minecraft",
            "Overwatch 2",
            "Street Fighter V",
            "Valorant"
        )

        val gamePrices =
            doubleArrayOf(69.99, 0.00, 24.99, 39.99, 29.99, 0.00, 19.99, 0.00, 29.99, 0.00)

        val gameImages = intArrayOf(
            R.drawable.mw2ghost,
            R.drawable.csgo,
            R.drawable.dbd,
            R.drawable.ggs,
            R.drawable.ggxrd,
            R.drawable.lol,
            R.drawable.mc,
            R.drawable.ow2,
            R.drawable.sfv,
            R.drawable.`val`
        )

        for (i in gameNames.indices)
            list.add(GamesModel(gameImages[i], gameNames[i], gamePrices[i]))




        return list
    }

}