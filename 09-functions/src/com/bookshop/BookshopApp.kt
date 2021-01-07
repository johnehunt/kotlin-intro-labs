package com.bookshop

fun prettyPrint(book: Book) {
    println(book.title)
    println("\tby ${book.author}")
    println("\t\t at a cost of ${book.price}")
}

fun main() {
    println("Welcome to the Bookshop!")

    Bookshop.printDetails()

    println("\nCalculating the Sales Discount price")
    Bookshop.book.salesDiscount = 0.10
    println("Sale price of book: ${Bookshop.book.calculateSalePrice()}")

    Bookshop.book.numberHeld = 5
    println(Bookshop.book.numberHeld)

    Bookshop.book.numberHeld = -1
    println(Bookshop.book.numberHeld)

    println()

    prettyPrint(Bookshop.book)

    val b: Book? = Bookshop.books[Technical]?.get(0)
    b?.apply{prettyPrint(this)}
}