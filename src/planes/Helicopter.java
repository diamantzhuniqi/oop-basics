package planes;

public class Helicopter extends Plane {
    private double rotatorSize;

    public Helicopter(double weight, int capacity, double rotatorSize) {
        super(weight, capacity);
        this.rotatorSize = rotatorSize;
    }
    
}
