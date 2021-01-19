package com.bookshop

interface Sales {

    val price: Double
    var salesDiscount: Double

    fun calculateSalePrice(): Double {
        println("Sales.calculateSalePrice()")
        var discountedPrice = 0.0
        val discountAmount = this.price * salesDiscount
        discountedPrice = this.price - discountAmount
        return discountedPrice
    }

}