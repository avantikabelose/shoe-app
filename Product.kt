Product.kt
package com.example.shop

data class Product(
    val name: String,
    val price: Double,
    val imageResId: Int,
    var quantity: Int = 1 // Default quantity is 1
)
