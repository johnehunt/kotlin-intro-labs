package com.bookshop

class Publisher(var name: String,
                val address: Address) {
    override fun toString(): String {
        return "Publisher(name='$name', address=$address)"
    }
}