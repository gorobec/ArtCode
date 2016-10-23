package week3.builder;

/**
 * Created by gorobec on 23.10.16.
 */
public class TestBuilder {
    public static void main(String[] args) {
        Milk.Builder builder = new Milk.Builder().setName("Agusha").setColor(333);


        Milk milk = builder.setE(235).setCarbohydrates(15)
                .setFats(50).setProteins(13).setVitamins(1).setVolume(900).build();



    }
}
