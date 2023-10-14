package dev.eduayuso.kmpgradleoptimized.features.featurea

import dev.eduayuso.kmpgradleoptimized.shared.features.featurea.getFeatureA
import kotlin.test.Test
import kotlin.test.assertTrue

class FeatureATest {

    @Test
    fun testExample() {

        assertTrue(getFeatureA().value.contains("Android"))
    }
}