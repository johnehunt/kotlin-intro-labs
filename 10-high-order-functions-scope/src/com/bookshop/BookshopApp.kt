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
    println("Sale price of book: %.2f".format(Bookshop.book.calculateSalePrice()))

    Bookshop.book.numberHeld = 5
    println("Number of copies held: ${Bookshop.book.numberHeld}")

    println()

    prettyPrint(Bookshop.book)

    println("-----------")

    println("Filter example:")
    val technicalBooks = Bookshop.books[Technical]

    println("Pretty Printing all books in the Technical genre")
    technicalBooks?.forEach { book -> prettyPrint(book) }

    println("Printing all books below 15.0 in price")
    technicalBooks
        ?.filter { book -> book.price < 15.0 }
        ?.forEach { book -> prettyPrint(book) }

    println("-------")

    val b: Book? = Bookshop.books[Technical]?.get(0)
    b?.run { prettyPrint(this) }

    with(b) {
        prettyPrint(this!!)  // book could be null
    }

    val music = Music("Ticket to Ride", 15.95).apply {
        println("Please enter the sales discount for the game: ")
        val discount = readLine()?.toDouble()
        salesDiscount = discount ?: 0.0
    }

    println(music)


}