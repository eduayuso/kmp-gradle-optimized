package dev.eduayuso.kmpgradleoptimized.features.featureb

import dev.eduayuso.kmpgradleoptimized.shared.features.featureb.FeatureB
import kotlin.test.Test
import kotlin.test.assertTrue

class FeatureBTest {

    @Test
    fun testExample() {

        assertTrue(FeatureB.presentData().contains("entity"))
    }
}