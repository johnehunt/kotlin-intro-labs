package com.bookshop

class Game(
    _title: String,
    _price: Double,
    override val author: Author,
    val manufacturer: String
) : Product(_title, _price), Authors {

    override fun toString()=
        "Game(${super.toString()}, author=$author, manufacturer=$manufacturer)"

}