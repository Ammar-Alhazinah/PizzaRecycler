package edu.cs.birzeit.a1172482.pizzarecycler;

public class Pizza {
    private String name;
    private int imageID;

    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.pizza_1),
            new Pizza("Funghi", R.drawable.pizza_2),
            new Pizza("Diavolo1", R.drawable.pizza_2),
            new Pizza("Funghi1", R.drawable.pizza_1),
            new Pizza("Diavolo2", R.drawable.pizza_1), 
            new Pizza("Funghi2", R.drawable.pizza_2),
            new Pizza("Diavolo3", R.drawable.pizza_1),
            new Pizza("Funghi3", R.drawable.pizza_2),
            new Pizza("Diavolo4", R.drawable.pizza_1),
            new Pizza("Funghi4", R.drawable.pizza_2),

    };

    public Pizza(String name, int imageID) {
        this.name = name;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public static Pizza[] getPizzas() {
        return pizzas;
    }
}
