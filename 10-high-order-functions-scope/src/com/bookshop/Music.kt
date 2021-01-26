package com.bookshop

class Music(_title: String, _price: Double): Product(_title, _price) {

    override fun toString()=
        "Music(${super.toString()})"

}