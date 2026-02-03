package Burger;

public class VegBurger implements Burger{
    private double price = 100.0;
    private String name = "Vegetable Burger";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
