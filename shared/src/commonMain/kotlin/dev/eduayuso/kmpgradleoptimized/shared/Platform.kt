package dev.eduayuso.kmpgradleoptimized.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform