package com.bookshop

class Publisher(var name: String,
                var address: Address) {
    override fun toString(): String {
        return "Publisher(name='$name', address=$address)"
    }
}