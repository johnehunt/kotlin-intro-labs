package com.bookshop

interface Sales {

    val price: Double
    var salesDiscount: Double

    fun calculateSalePrice(): Double {
        var price = 0.0
        val discountAmount = this.price * salesDiscount
        price = this.price - discountAmount
        return price
    }

}