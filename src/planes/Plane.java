package planes;

public class Plane {
    private double weight;
    private int capacity;
    
    public Plane(double weight, int capacity) {
        this.weight = weight;
        this.capacity = capacity;
    }

    public double height() {
        double flyingHeight = this.weight/1.1;
        System.out.println("Hey! I can fly on " + flyingHeight + " meters in the air");
        return flyingHeight;
    }

    public double getWeight() {
        return this.weight;
    }
    
    public void setWeight(double weight) {
        System.out.println("Weight changed");
        this.weight = weight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "{" +
            " weight='" + this.weight + "'" +
            ", capacity='" + this.capacity + "'" +
            "}";
    }

}
