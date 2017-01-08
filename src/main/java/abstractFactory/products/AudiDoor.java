package abstractFactory.products;


import abstractFactory.Door;

public class AudiDoor implements Door {
    @Override
    public void print() {
        System.out.println("Created door Audi");
    }
}
