package com.example.odysseynavigationsample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform