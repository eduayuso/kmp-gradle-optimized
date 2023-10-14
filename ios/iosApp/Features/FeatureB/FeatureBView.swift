import SwiftUI
import shared

struct FeatureBView: View {
    
    var body: some View {
        
        let data = FeatureB().presentData()
        Text(data)
    }
}
