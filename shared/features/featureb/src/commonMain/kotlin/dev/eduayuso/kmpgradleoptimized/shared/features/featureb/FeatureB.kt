package dev.eduayuso.kmpgradleoptimized.shared.features.featureb

import dev.eduayuso.kmpgradleoptimized.shared.domain.EntityExample

object FeatureB {

    private val entity = EntityExample("I'm an entity presented by FeatureB")

    fun presentData() = entity.data
}