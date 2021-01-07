package com.bookshop

val Book.pages get() = 100

fun Book.hasLength(len: Int) = this.pages == len

