package colddrink;

public class Pepsi implements ColdDrink{
    private String name = "Pepsi";
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
