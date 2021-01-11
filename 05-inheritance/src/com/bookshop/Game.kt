package com.bookshop

class Game(
    _title: String,
    _price: Double,
    val author: Author,
    val manufacter: String
) : Product(_title, _price) {

    override fun toString()=
        "Game(${super.toString()}, author=$author, manufacter=$manufacter)"

}