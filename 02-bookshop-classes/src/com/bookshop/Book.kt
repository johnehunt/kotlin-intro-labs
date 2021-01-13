package com.bookshop

class Book(val title: String,
           var price: Double,
           val author: Author,
           val publisher: Publisher) {

    var salesDiscount = 0.0

    fun calculateSalePrice(): Double {
        var price = 0.0
        val discountAmount = this.price * salesDiscount
        price = this.price - discountAmount
        return price
    }

    override fun toString(): String {
        return "Book(title='$title', price=$price, author=$author, publisher=$publisher)"
    }

}