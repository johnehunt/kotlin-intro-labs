package com.bookshop

sealed class Genre

object Fiction: Genre() {
    override fun toString()= "Fiction"
}
object Technical: Genre() {
    override fun toString()= "Technical"
}
object History: Genre() {
    override fun toString()= "History"
}
object Detective: Genre(){
    override fun toString()= "Detective"
}
object Biography: Genre(){
    override fun toString()= "Biography"
}