ProductListActivity.kt
package com.example.shop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProductListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)

        val recyclerView: RecyclerView = findViewById(R.id.productRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Pass the onAddToCart lambda
        val adapter = ProductAdapter(ProductData.productList) { product ->
            ProductCart.cartList.add(product)
        }

        recyclerView.adapter = adapter

        val viewCartButton: Button = findViewById(R.id.viewCartButton)
        viewCartButton.setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }
    }
}
