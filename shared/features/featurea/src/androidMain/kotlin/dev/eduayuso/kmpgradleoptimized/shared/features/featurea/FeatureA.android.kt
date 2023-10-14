package dev.eduayuso.kmpgradleoptimized.shared.features.featurea

class AndroidFeatureA : FeatureA {

    override val value: String = "FeatureA from Android"
}

actual fun getFeatureA(): FeatureA = AndroidFeatureA()