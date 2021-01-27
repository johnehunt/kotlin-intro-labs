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

    // Traditional approach
    try {
        Bookshop.book.numberHeld = -5
    } catch (exp: BookshopException) {
        println(exp.message)
        println("Negative number held value will be ignored")
    }

    // Functional Style
    runCatching {
        Bookshop.book.numberHeld = 5
    }.onFailure {
        when (it) {
            is BookshopException -> {
                println(it.message)
                println("Negative number held value will be ignored")
            }
            else -> throw it
        }
    }.onSuccess {
        println("All went well - updated the book number held")
    }


    println()

    prettyPrint(Bookshop.book)

    val b: Book? = Bookshop.books[Technical]?.get(0)
    b?.apply{prettyPrint(this)}

    println()

    println("Filter example:")
    val technicalBooks = Bookshop.books[Technical]

    println("Pretty Printing all books in the Technical genre")
    technicalBooks?.forEach { book -> prettyPrint(book) }

    println("Printing all books below 15.0 in price")
    technicalBooks
        ?.filter{book -> book.price < 15.0}
        ?.forEach{book -> prettyPrint(book) }

}