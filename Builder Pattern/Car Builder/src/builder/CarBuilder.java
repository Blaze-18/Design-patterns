package builder;

import carconfig.Car;

public abstract class CarBuilder {
    protected String modelName;
    protected String engineType;
    protected String color;
    protected String transmission;
    protected boolean sunRoof ;
    protected boolean infotainment;

    public abstract Car makeCar();

}
