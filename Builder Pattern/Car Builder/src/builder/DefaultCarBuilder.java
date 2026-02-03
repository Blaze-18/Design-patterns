package builder;

import carconfig.Car;

public class DefaultCarBuilder extends CarBuilder {

    private String modelName = "Default";
    private String engineType = "Petrol";
    private String color = "White";
    private String transmission = "Manual";
    private boolean sunRoof = false;
    private boolean infotainment = false;

    @Override
    public Car makeCar() {
        Car defaultCar = new Car();
        defaultCar.setColor(color);
        defaultCar.setEngineType(engineType);
        defaultCar.setSunroof(sunRoof);
        defaultCar.setTransmission(transmission);
        defaultCar.setModelName(modelName);
        defaultCar.setInfotainmentSystem(infotainment);

        return defaultCar;
    }
}
