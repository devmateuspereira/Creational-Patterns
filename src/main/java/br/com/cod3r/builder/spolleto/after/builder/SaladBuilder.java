package br.com.cod3r.builder.spolleto.after.builder;

import br.com.cod3r.builder.spolleto.after.model.Salad;

public class SaladBuilder extends DefaultMealBuilder {

    public Salad getResult() {
        return new Salad(toppings, sauces, size, cheese, pepper);
    }

}