package com.bookshop

class Author(_name: String): Entity(_name) {
    override fun toString(): String {
        return "Author(name='$name')"
    }
}