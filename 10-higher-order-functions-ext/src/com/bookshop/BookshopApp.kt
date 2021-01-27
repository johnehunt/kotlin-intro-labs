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

    val b: Book? = Bookshop.books[Technical]?.get(0)
    b?.apply { prettyPrint(this) }

    println("-----------------")

    println("Filter example:")
    val technicalBooks = Bookshop.books[Technical]
    println(technicalBooks?.filter { book -> book.price < 15.0 })

    println("Pretty Printing all books in the Technical genre")
    technicalBooks?.forEach(::prettyPrint)
    technicalBooks?.forEach { book -> prettyPrint(book) }
    technicalBooks?.forEach { prettyPrint(it) }

    println("Printing all books below 15.0 in price")
    // Long hand in two steps
    val cheapBooks = technicalBooks?.filter { book -> book.price < 15.0 }
    cheapBooks?.forEach { book -> prettyPrint(book)}

    // Or can chain HoF functions
    technicalBooks
        ?.filter { book -> book.price < 15.0 }
        ?.forEach { book -> prettyPrint(book) }

    // Calling the custom HoF on Bookshop
    Bookshop.applyToGenre(Technical) { list -> println(list) }
    Bookshop.applyToGenre(Technical) { list ->
        list.filter { it.price > 10.00 }
            .forEach { println(it) }
    }
}
