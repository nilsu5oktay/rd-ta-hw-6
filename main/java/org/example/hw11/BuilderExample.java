package org.example.hw11;

public class BuilderExample {
    public static void main(String[] args) {
        PizzaBuilder builder = new MargheritaPizzaBuilder();
        PizzaDirector director = new PizzaDirector(builder);

        director.construct();
        Pizza margheritaPizza = builder.getResult();

        System.out.println(margheritaPizza);
    }
}
