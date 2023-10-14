import SwiftUI

struct ContentView: View {
    
    var body: some View {

        NavigationView {
            VStack {
                NavigationLink("Show me Feature A") {
                    FeatureAView()
                }
                Spacer().frame(height: 10)
                NavigationLink("Show me Feature B") {
                    FeatureBView()
                }
            }
        }
        .navigationViewStyle(.stack)
     }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
