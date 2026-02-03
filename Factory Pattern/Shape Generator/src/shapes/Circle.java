package shapes;

public class Circle implements Shape{

    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void showDetails() {
        System.out.println("Shape Type: Circle\nRadius = " + radius + "\nArea = " + getArea());
    }
}
