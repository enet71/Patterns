package structural.bridge;


public class PickUp extends Car {
    private  int height;
    private  int width;

    public PickUp(Door door, Wheel wheel, int height, int width) {
        super(door, wheel);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "PickUp{" +
                "door=" + door +
                ", wheel=" + wheel +
                ",height=" + height +
                ", width=" + width +
                '}';
    }
}
