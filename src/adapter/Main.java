package adapter;


public class Main {
    public static void main(String[] args) {
        Playable playable = new Adapter();
        playable.play();

        Playable playable2 = new AdapterComposition();
        playable2.play();
    }
}
