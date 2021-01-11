package com.bookshop

object Bookshop {

    val name = "John's Bookshop"
    val address = Address(26,
            "Main Street",
            "Bath",
            "BANES",
            "BA1 3ZZ")

    val book: Book
    val game: Game

    init {
        val author = Author("Pete Smith")
        val address = Address(10, "High Street", "Salisbury", "Wiltshire", "SL10 34D")
        val publisher = Publisher("Tech Books Publishing Ltd.", address)
        book = Book("Kotlin Unleashed", 15.95, author, publisher)

        val gameAuthor = Author("A Moon")
        game = Game("Space Ride", 50.55, gameAuthor, "Games Co")
    }

    fun printDetails() {
        println("Name: $name")
        println("Address: $address")
        println("Books: $book")
    }

}