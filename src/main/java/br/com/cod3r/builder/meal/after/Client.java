package br.com.cod3r.builder.meal.after;

import br.com.cod3r.builder.meal.after.builder.*;
import br.com.cod3r.builder.meal.after.director.MealDirector;

public class Client {

    public static void order(String name, FastFoodMealBuilder builder) {
        System.out.println("Ordering a " + name);
        MealDirector director = new MealDirector(builder);
        director.constructCombo();
        System.out.println(director.getCombo());
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("------------------");
        order("Heart Attack", new FatMealBuilder());
        order("Just Fries", new JustFriesBuilder());
        order("Burguer", new Menu1Builder());
        order("Veggie Burguer", new Menu2Builder());
    }

}