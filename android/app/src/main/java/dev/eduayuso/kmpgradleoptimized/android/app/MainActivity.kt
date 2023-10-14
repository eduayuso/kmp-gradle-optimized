package dev.eduayuso.kmpgradleoptimized.android.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.eduayuso.kmpgradleoptimized.android.features.featurea.FeatureAView
import dev.eduayuso.kmpgradleoptimized.android.features.featureb.FeatureBView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MainView()
            }
        }
    }
}

@Composable
fun MainView() {

    val navController = rememberNavController()
    val featureaNav = "featurea"
    val featurebNav = "featureb"
    Scaffold { padding ->
        NavHost(
            navController = navController,
            startDestination = featureaNav,
            Modifier.padding(padding)
        ) {
            composable(route = featureaNav) {
                FeatureAView(
                    onButtonClick = {
                        navController.navigate(featurebNav)
                    }
                )
            }
            composable(route = featurebNav) {
                FeatureBView(
                    onButtonClick = {
                        navController.navigate(featureaNav)
                    }
                )
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {

    MaterialTheme {
        MainView()
    }
}
