package com.bookshop

class Game(
    _title: String,
    _price: Double,
    override val author: Author,
    val manufacter: String
) : Product(_title, _price), Authors {

    override fun toString(): String {
        return "Game(${super.toString()}, author=$author, manufacter=$manufacter)"
    }

}