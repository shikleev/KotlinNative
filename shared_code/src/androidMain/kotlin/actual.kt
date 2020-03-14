package com.kotlinnative

actual fun platformName(): String {
    return "Android"
}

actual fun testPlatform(): Int {
    return 1
}