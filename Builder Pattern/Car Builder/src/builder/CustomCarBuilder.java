package builder;

import carconfig.Car;

public class CustomCarBuilder extends CarBuilder{
    private String modelName;
    private String engineType;
    private String color;
    private String transmission;
    private boolean sunRoof;
    private boolean infotainment;

    public CustomCarBuilder(String modelName, String engineType, String color, String transmission, boolean sunRoof, boolean infotainment) {
        this.modelName = modelName;
        this.engineType = engineType;
        this.color = color;
        this.transmission = transmission;
        this.sunRoof = sunRoof;
        this.infotainment = infotainment;
    }

    @Override
    public Car makeCar() {
        Car customCar = new Car();
        customCar.setColor(color);
        customCar.setEngineType(engineType);
        customCar.setSunroof(sunRoof);
        customCar.setTransmission(transmission);
        customCar.setModelName(modelName);
        customCar.setInfotainmentSystem(infotainment);

        return customCar;
    }
}
