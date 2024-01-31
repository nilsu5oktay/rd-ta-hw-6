package org.example.hw11;

public class Pizza {
    private String dough;
    private String sauce;
    private String toppings;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

     @Override
     public String toString() {
         return "Pizza { Dough: " + dough + ", Sauce: " + sauce + ", Toppings: " + toppings + " }";
     }

 }

