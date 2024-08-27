package com.example.dailyquotesapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {
    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quoteTextView: TextView = findViewById(R.id.quote_text_view)
        val newQuoteButton: Button = findViewById(R.id.new_quote_button)
        val shareQuoteButton: Button = findViewById(R.id.share_quote_button)
        val addFavoriteButton: Button = findViewById(R.id.add_favorite_button)
        val favoriteQuotesTextView: TextView = findViewById(R.id.favorite_quotes_text_view)


        // Observe the current quote from the ViewModel
        quoteViewModel.currentQuote.observe(this) { quote ->
            quoteTextView.text = quote
        }

        // Update quote on button click
        newQuoteButton.setOnClickListener {
            quoteViewModel.updateQuote()
        }

        // Share quote
        shareQuoteButton.setOnClickListener {
            val quote = quoteViewModel.currentQuote.value ?: return@setOnClickListener
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, quote)
                type = "text/plain"
            }
            val shareIntent = Intent.createChooser(sendIntent, null)
            ContextCompat.startActivity(this, shareIntent, null)
        }

        // Add to favorites
        addFavoriteButton.setOnClickListener {
            quoteViewModel.addFavoriteQuote()
            favoriteQuotesTextView.text = quoteViewModel.favoriteQuotes.joinToString("\n")
        }
    }
}
