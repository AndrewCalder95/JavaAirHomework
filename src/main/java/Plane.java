public class Plane {

    private PlaneType planeType;
    private int capacity;
    private int weight;

    public Plane(PlaneType planeType, int capacity, int weight){
        this.planeType = planeType;
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
