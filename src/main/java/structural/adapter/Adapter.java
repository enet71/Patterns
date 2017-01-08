package structural.adapter;

public class Adapter extends Track implements Playable{
    @Override
    public void play() {
        start();
    }
}
