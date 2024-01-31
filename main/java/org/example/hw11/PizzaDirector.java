package org.example.hw11;

public class PizzaDirector {
    private PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildDough();
        builder.buildSauce();
        builder.buildToppings();
    }
}
