package com.bookshop

/**
 * Super class of all types of products in the shop
 */
abstract class Product(val title: String,
                       override val price: Double): Sales {

    override var salesDiscount: Double = 0.0

    override fun toString(): String {
        return "title='$title', price=$price, salesDiscount=$salesDiscount"
    }

}