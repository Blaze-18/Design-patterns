package Burger;

public class ChickenBurger implements Burger{

    private double price = 200.0;
    private String name = "Chicken Burger";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
