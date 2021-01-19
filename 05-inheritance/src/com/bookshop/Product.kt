package com.bookshop

/**
 * Super class of all types of products in the shop
 */
open class Product(val title: String,
                   val price: Double) {

    var salesDiscount = 0.0

    var numberHeld = 0
        get() = field
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    open fun calculateSalePrice(): Double {
        var price = 0.0
        val discountAmount = this.price * salesDiscount
        price = this.price - discountAmount
        return price
    }

    override fun toString(): String {
        return "title='$title', price=$price, salesDiscount=$salesDiscount"
    }

}