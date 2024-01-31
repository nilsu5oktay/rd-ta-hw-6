package org.example.hw11;

public class MargheritaPizzaBuilder implements  PizzaBuilder{

    private Pizza pizza;

    public MargheritaPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("Thin Crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Tomato");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings("Mozzarella");
    }

    @Override
    public Pizza getResult() {
        return pizza;
    }
}
