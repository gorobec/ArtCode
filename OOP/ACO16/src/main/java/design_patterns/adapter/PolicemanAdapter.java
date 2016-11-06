package design_patterns.adapter;

/**
 * Created by gorobec on 06.11.16.
 */
public class PolicemanAdapter extends Policeman{

    private Militioner militioner;

    public PolicemanAdapter(Militioner militioner) {
        this.militioner = militioner;
    }

    public PolicemanAdapter(String name, String rank, Militioner militioner) {
        super(name, rank);
        this.militioner = militioner;
    }

    @Override
    public void serve() {
        militioner.takeBribes();

    }
}
