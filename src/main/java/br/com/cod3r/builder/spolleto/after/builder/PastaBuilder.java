package br.com.cod3r.builder.spolleto.after.builder;

import br.com.cod3r.builder.spolleto.after.model.Pasta;

public class PastaBuilder extends DefaultMealBuilder {

    public Pasta getResult() {
        return new Pasta(toppings, sauces, size, cheese, pepper);
    }

}