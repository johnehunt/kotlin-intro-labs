package com.bookshop

class Game(
    _title: String,
    _price: Double,
    val author: Author,
    val manufacturer: String
) : Product(_title, _price) {

    override fun toString()=
        "Game(${super.toString()}, author=$author, manufacturer=$manufacturer)"

}