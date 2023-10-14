package dev.eduayuso.kmpgradleoptimized.shared.features.featurea

class IOSFeatureA: FeatureA {

    override val value: String = "FeatureA from iOS"
}

actual fun getFeatureA(): FeatureA = IOSFeatureA()