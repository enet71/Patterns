package structural.adapter;


public class AdapterComposition implements Playable{
    private Track track = new Track();

    @Override
    public void play() {
        track.start();
    }
}
