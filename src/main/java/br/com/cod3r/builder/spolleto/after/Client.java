package br.com.cod3r.builder.spolleto.after;

import br.com.cod3r.builder.spolleto.after.builder.PastaBuilder;
import br.com.cod3r.builder.spolleto.after.builder.SaladBuilder;
import br.com.cod3r.builder.spolleto.after.model.Pasta;
import br.com.cod3r.builder.spolleto.after.model.Salad;
import br.com.cod3r.builder.spolleto.after.model.Size;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        System.out.println();

        PastaBuilder pastaBuilder = new PastaBuilder();
        pastaBuilder.setSize(Size.LARGE);
        Pasta p1 = pastaBuilder.getResult();
        System.out.println(p1);

        SaladBuilder saladBuilder = new SaladBuilder();
        saladBuilder.setSize(Size.SMALL);
        saladBuilder.setToppings(Arrays.asList("Bacon", "Broccoli"));
        saladBuilder.setSauce(Arrays.asList("Caesar"));
        saladBuilder.setCheese(true);
        Salad p2 = saladBuilder.getResult();
        System.out.println(p2);

        PastaBuilder pastaBuilder2 = new PastaBuilder();
        pastaBuilder2.setToppings(Arrays.asList("Garlic"));
        pastaBuilder2.setSauce(Arrays.asList("Fungi", "Cheese"));
        pastaBuilder2.setSize(Size.STANDARD);
        pastaBuilder2.setCheese(true);
        pastaBuilder2.setPepper(true);
        Pasta p3 = pastaBuilder2.getResult();
        System.out.println(p3);
    }

}