package br.com.cod3r.builder.spolleto.after.builder;

import br.com.cod3r.builder.spolleto.after.model.Size;

import java.util.List;

public interface MealBuilder {

    void setSize(Size size);

    void setSauce(List<String> sauces);

    void setToppings(List<String> toppings);

    void setCheese(boolean cheese);

    void setPepper(boolean pepper);

}