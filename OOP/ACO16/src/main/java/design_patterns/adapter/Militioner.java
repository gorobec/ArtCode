package design_patterns.adapter;

/**
 * Created by gorobec on 06.11.16.
 */
public class Militioner {
    private String name;
    private String rank;

    public Militioner(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    public Militioner() {
    }

    public void takeBribes(){
        System.out.println("I'm bad militioner");
    }

    @Override
    public String toString() {
        return "Militioner{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
