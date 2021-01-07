package com.bookshop

class Publisher(val name: String,
                val address: Address) {
    override fun toString(): String {
        return "Publisher(name='$name', address=$address)"
    }
}