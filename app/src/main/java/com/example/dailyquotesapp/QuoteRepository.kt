package com.example.dailyquotesapp

import java.util.*

object QuoteRepository {

    private val quotes = listOf(
        "The best way to predict the future is to create it.",
        "Life is what happens when you’re busy making other plans.",
        "You only live once, but if you do it right, once is enough.",
        "The only limit to our realization of tomorrow is our doubts of today.",
        "The purpose of our lives is to be happy.",
        "Life is short, and it is up to you to make it sweet.",
        "In the end, we will remember not the words of our enemies, but the silence of our friends.",
        "To live is the rarest thing in the world. Most people exist, that is all.",
        "The greatest glory in living lies not in never falling, but in rising every time we fall.",
        "The future belongs to those who believe in the beauty of their dreams.",
        "The only impossible journey is the one you never begin.",
        "Life is what happens when you’re busy making other plans.",
        "The best revenge is massive success.",
        "Life is really simple, but we insist on making it complicated.",
        "You must be the change you wish to see in the world.",
        "The only way to do great work is to love what you do.",
        "Success is not final, failure is not fatal: It is the courage to continue that counts.",
        "Believe you can and you're halfway there.",
        "The journey of a thousand miles begins with one step.",
        "You only live once, but if you do it right, once is enough.",
        "Life isn't about finding yourself. Life is about creating yourself.",
        "You have within you right now, everything you need to deal with whatever the world can throw at you.",
        "Do not wait to strike till the iron is hot, but make it hot by striking.",
        "The best way to find yourself is to lose yourself in the service of others.",
        "Success usually comes to those who are too busy to be looking for it.",
        "Opportunities don't happen. You create them.",
        "Don't watch the clock; do what it does. Keep going.",
        "Hardships often prepare ordinary people for an extraordinary destiny.",
        "You don’t have to be great to start, but you have to start to be great.",
        "I am not a product of my circumstances. I am a product of my decisions.",
        "Everything you've ever wanted is on the other side of fear.",
        "We may encounter many defeats but we must not be defeated.",
        "The only way to achieve the impossible is to believe it is possible.",
        "Your time is limited, don’t waste it living someone else’s life.",
        "The only limit to our realization of tomorrow is our doubts of today.",
        "Success is not how high you have climbed, but how you make a positive difference to the world.",
        "The only impossible journey is the one you never begin.",
        "You do not find the happy life. You make it.",
        "The only person you are destined to become is the person you decide to be.",
        "In the end, we will remember not the words of our enemies, but the silence of our friends.",
        "You miss 100% of the shots you don’t take.",
        "We are what we repeatedly do. Excellence, then, is not an act, but a habit.",
        "The only way to do great work is to love what you do.",
        "Success is not in what you have, but who you are.",
        "In three words I can sum up everything I've learned about life: it goes on.",
        "The greatest wealth is to live content with little.",
        "Life is either a daring adventure or nothing at all.",
        "The best way to cheer yourself is to try to cheer someone else up.",
        "Life is 10% what happens to us and 90% how we react to it.",
        "Happiness is not something ready-made. It comes from your own actions.",
        "The best time to plant a tree was 20 years ago. The second-best time is now.",
        "Your life does not get better by chance, it gets better by change.",
        "You must do the things you think you cannot do.",
        "In order to succeed, we must first believe that we can.",
        "Happiness is not by chance, but by choice.",
        "The only person you are destined to become is the person you decide to be.",
        "Change your thoughts and you change your world.",
        "The only way to do great work is to love what you do.",
        "The best way to predict the future is to invent it.",
        "It does not matter how slowly you go as long as you do not stop.",
        "The secret of getting ahead is getting started.",
        "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.",
        "Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle.",
        "Everything you’ve ever wanted is on the other side of fear.",
        "Your life does not get better by chance, it gets better by change.",
        "Success is not the key to happiness. Happiness is the key to success.",
        "The only limit to our realization of tomorrow is our doubts of today.",
        "The way to get started is to quit talking and begin doing.",
        "You don’t have to be great to start, but you have to start to be great.",
        "Act as if what you do makes a difference. It does.",
        "You can’t go back and change the beginning, but you can start where you are and change the ending.",
        "If you want to lift yourself up, lift up someone else.",
        "What lies behind us and what lies before us are tiny matters compared to what lies within us.",
        "The only person you are destined to become is the person you decide to be.",
        "Your time is limited, don’t waste it living someone else’s life.",
        "You are never too old to set another goal or to dream a new dream.",
        "Everything you’ve ever wanted is on the other side of fear.",
        "Life is what happens when you’re busy making other plans.",
        "If you want to live a happy life, tie it to a goal, not to people or things.",
        "Success usually comes to those who are too busy to be looking for it.",
        "Opportunities don't happen. You create them.",
        "Don’t watch the clock; do what it does. Keep going.",
        "Hardships often prepare ordinary people for an extraordinary destiny.",
        "You don’t have to be great to start, but you have to start to be great.",
        "I am not a product of my circumstances. I am a product of my decisions.",
        "Everything you've ever wanted is on the other side of fear.",
        "We may encounter many defeats but we must not be defeated.",
        "The only way to achieve the impossible is to believe it is possible.",
        "Your time is limited, don’t waste it living someone else’s life.",
        "The only limit to our realization of tomorrow is our doubts of today.",
        "Success is not how high you have climbed, but how you make a positive difference to the world.",
        "The only impossible journey is the one you never begin.",
        "You do not find the happy life. You make it.",
        "The only person you are destined to become is the person you decide to be.",
        "In the end, we will remember not the words of our enemies, but the silence of our friends.",
        "You miss 100% of the shots you don’t take.",
        "We are what we repeatedly do. Excellence, then, is not an act, but a habit.",
        "The only way to do great work is to love what you do.",
        "Success is not in what you have, but who you are.",
        "In three words I can sum up everything I've learned about life: it goes on.",
        "The greatest wealth is to live content with little.",
        "Life is either a daring adventure or nothing at all.",
        "The best way to cheer yourself is to try to cheer someone else up.",
        "Life is 10% what happens to us and 90% how we react to it.",
        "Happiness is not something ready-made. It comes from your own actions.",
        "The best time to plant a tree was 20 years ago. The second-best time is now.",
        "Your life does not get better by chance, it gets better by change.",
        "You must do the things you think you cannot do.",
        "In order to succeed, we must first believe that we can.",
        "Happiness is not by chance, but by choice.",
        "The only person you are destined to become is the person you decide to be.",
        "Change your thoughts and you change your world.",
        "The only way to do great work is to love what you do.",
        "The best way to predict the future is to invent it.",
        "It does not matter how slowly you go as long as you do not stop.",
        "The secret of getting ahead is getting started.",
        "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.",
        "Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle.",
        "Everything you’ve ever wanted is on the other side of fear.",
        "Your life does not get better by chance, it gets better by change.",
        "Success is not the key to happiness. Happiness is the key to success.",
        "The only limit to our realization of tomorrow is our doubts of today.",
        "The way to get started is to quit talking and begin doing.",
        "You don’t have to be great to start, but you have to start to be great.",
        "Act as if what you do makes a difference. It does.",
        "You can’t go back and change the beginning, but you can start where you are and change the ending.",
        "If you want to lift yourself up, lift up someone else.",
        "What lies behind us and what lies before us are tiny matters compared to what lies within us.",
        "The only person you are destined to become is the person you decide to be.",
        "Your time is limited, don’t waste it living someone else’s life.",
        "You are never too old to set another goal or to dream a new dream.",
        "Everything you’ve ever wanted is on the other side of fear.",
        "Life is what happens when you’re busy making other plans.",
        "If you want to live a happy life, tie it to a goal, not to people or things."
    )

    fun getRandomQuote(): String {
        return quotes[Random().nextInt(quotes.size)]
    }
}
