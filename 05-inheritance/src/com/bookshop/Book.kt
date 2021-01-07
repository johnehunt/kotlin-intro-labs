package com.bookshop

class Book(_title: String,
           _price: Double,
           val author: Author,
           val publisher: Publisher): Product(_title, _price) {

    override fun toString(): String {
        return "Book(${super.toString()}, author=$author, publisher=$publisher)"
    }

}