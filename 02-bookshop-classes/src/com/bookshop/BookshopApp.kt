package com.bookshop

fun main() {
    println("Welcome to the Bookshop!")

    val author = Author("Pete Smith")
    val address = Address(10, "High Street", "Salisbury", "Wiltshire", "SL10 34D")
    val publisher = Publisher("Tech Books Publishing Ltd.", address)
    val book = Book("Kotlin Unleashed", 15.95, author, publisher)
    println("Book: $book")

    println("\nCalculating the Sales Discount price")
    book.salesDiscount = 0.10
    println("Sale price of book: ${book.calculateSalePrice()}")

    // To pretty print the number use string.format
    println("Sale price of book: %.2f".format(book.calculateSalePrice()))

}