package com.bookshop

object Bookshop {

    val name = "John's Bookshop"
    val address = Address(26,
            "Main Street",
            "Bath",
            "BANES",
            "BA1 3ZZ")

    val book: Book

    init {
        val author = Author("Pete Smith")
        val address = Address(10, "High Street", "Salisbury", "Wiltshire", "SL10 34D")
        val publisher = Publisher("Tech Books Publishing Ltd.", address)
        book = Book("Kotlin Unleashed", 15.95, author, publisher)
    }

    fun printDetails() {
        println("Name: $name")
        println("Address: $address")
        println("Books: $book")
    }

}