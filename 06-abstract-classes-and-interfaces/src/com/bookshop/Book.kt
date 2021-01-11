package com.bookshop

class Book(_title: String,
           _price: Double,
           override val author: Author,
           val publisher: Publisher): Product(_title, _price), Authors {

    override fun toString(): String {
        return "Book(${super.toString()}, author=$author, publisher=$publisher)"
    }

}