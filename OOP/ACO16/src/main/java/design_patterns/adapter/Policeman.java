package design_patterns.adapter;

/**
 * Created by gorobec on 06.11.16.
 */
public class Policeman {
    private String name;
    private String rank;

    public Policeman() {
    }

    public Policeman(String name, String rank) {

        this.name = name;
        this.rank = rank;
    }
    public void serve(){
        System.out.println("I'm good policeman");
    }

    @Override
    public String toString() {
        return "Policeman{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
