package creational.abstractFactory.products;


import creational.abstractFactory.Door;

public class AudiDoor implements Door {
    @Override
    public void print() {
        System.out.println("Created door Audi");
    }
}
