import SwiftUI
import shared

struct FeatureAView: View {
    
    var body: some View {
        
        let data = FeatureA_iosKt.getFeatureA().value
        Text(data)
    }
}
