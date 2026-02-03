package carconfig;

public class Car {
    // Required parameters
    private String modelName;
    private String engineType;
    private String color;
    private String transmission;

    // Optional parameters
    private boolean sunroof;
    private boolean infotainmentSystem;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public void setInfotainmentSystem(boolean infotainmentSystem) {
        this.infotainmentSystem = infotainmentSystem;
    }

    // Getters
    public String getModelName() {
        return modelName;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

    public boolean hasSunroof() {
        return sunroof;
    }

    public boolean hasInfotainmentSystem() {
        return infotainmentSystem;
    }

    // Display car details
    public void showDetails() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("CAR CONFIGURATION");
        System.out.println("=".repeat(40));
        System.out.println("Model Name: " + modelName);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmission);
        System.out.println("Sunroof: " + (sunroof ? "Yes" : "No"));
        System.out.println("Infotainment System: " + (infotainmentSystem ? "Yes" : "No"));
        System.out.println("=".repeat(40) + "\n");
    }
}
