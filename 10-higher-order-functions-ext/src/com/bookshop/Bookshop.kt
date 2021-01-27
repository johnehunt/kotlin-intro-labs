package com.bookshop

object Bookshop {

    val name = "John's Bookshop"
    val address = Address(26,
            "Main Street",
            "Bath",
            "BANES",
            "BA1 3ZZ")

    val book: Book

    val books: Map<Genre, List<Book>>

    init {
        val author = Author("Pete Smith")
        val address = Address(10, "High Street", "Salisbury", "Wiltshire", "SL10 34D")
        val publisher = Publisher("Tech Books Publishing Ltd.", address)
        book = Book("Kotlin Unleashed", 15.95, author, publisher, Technical)

        books = mapOf(
                Technical to listOf(
                        Book("Kotlin Unleashed", 15.95, author, publisher, Technical),
                        Book("Kotlin and Android", 12.95, author, publisher, Technical),
                        Book("Kotlin with Spring", 15.99, author, publisher, Technical)
                ),
                History to listOf(
                        Book("The Wars of the Roses Retold",
                                12.35,
                                Author("Adam Jones"),
                                publisher,
                                History)),
                Fiction to listOf(
                        Book("It was a Dark Night",
                                23.55,
                                Author("Gryff Cooke"),
                                Publisher("Adriana Books ",
                                        Address(340, "Long Mile Road", "Swindon", "Wiltshire", "SN12 6ER")),
                                Fiction)
                )
        )
    }

    fun printDetails() {
        println("Name: $name")
        println("Address: $address")
        println("Books: $books")
    }

    // Extension Point HoF
    fun applyToGenre(genre: Genre,
                     func: (List<Book>) -> Unit) {
        val genreBooks = books[genre]
        if (genreBooks != null) {
            func(genreBooks)
        }
    }

}