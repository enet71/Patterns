package structural.bridge;

public abstract class Car {
    Door door;
    Wheel wheel;

    public Car(Door door, Wheel wheel) {
        this.door = door;
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "door=" + door +
                ", wheel=" + wheel +
                '}';
    }
}
