package planes;

public class Jet extends Plane {
    private double maxSpeed;

    public Jet(double weight, int capacity, double maxSpeed) {
        super(weight, capacity);
        this.maxSpeed = maxSpeed;
    } 

    public String flyQuick() {
        System.out.println("flying");
        return "Fliegen"; 
    }
    
}
