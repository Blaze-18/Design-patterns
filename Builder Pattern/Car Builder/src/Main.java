import builder.CustomCarBuilder;
import builder.DefaultCarBuilder;
import carconfig.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car defaultCar = new DefaultCarBuilder().makeCar();
        defaultCar.showDetails();

        Car customCar = new CustomCarBuilder(
                "Tesla Model 3",
                "Electric",
                "Red",
                "Automatic",
                true,
                true
        ).makeCar();

        customCar.showDetails();
    }
}