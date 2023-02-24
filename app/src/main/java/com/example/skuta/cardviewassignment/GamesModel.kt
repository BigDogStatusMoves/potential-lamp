package com.example.skuta.cardviewassignment

class GamesModel {
    var gameImage: Int?
    var gameTitle: String?
    var gamePrice: Double?

    constructor(gameImage: Int?, gameTitle: String?, gamePrice: Double?){
        this.gameImage = gameImage
        this.gameTitle = gameTitle
        this.gamePrice = gamePrice
    }
}