package com.bookshop

class Address(val number: Int,
              val street: String,
              val city: String,
              val county: String,
              val postcode: String) {

    override fun toString(): String {
        return "Address(number=$number, street='$street', city='$city', county='$county', postcode='$postcode')"
    }
}