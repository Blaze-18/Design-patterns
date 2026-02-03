package colddrink;

public class Coke implements ColdDrink{

    private String name = "Coke";
    private double price = 50.0;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
