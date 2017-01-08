package abstractFactory.products;


import abstractFactory.Door;

public class MercedesDoor implements Door {
    @Override
    public void print() {
        System.out.println("Created door Mercedes");
    }
}
