package dev.eduayuso.kmpgradleoptimized.shared.features.featurea

interface FeatureA {

    val value: String
}

expect fun getFeatureA(): FeatureA