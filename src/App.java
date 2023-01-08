import planes.Jet;
import planes.Plane;

public class App {
    
    public static void main(String[] args) throws Exception {
        Plane boeing = new Plane(100, 400);
        boeing.height();
        Plane ryanairJet = new Plane(200, 50);
        ryanairJet.height();

        Jet fighterJet = new Jet(20, 4, 1000);
        fighterJet.height();
        fighterJet.flyQuick();
    }
}
