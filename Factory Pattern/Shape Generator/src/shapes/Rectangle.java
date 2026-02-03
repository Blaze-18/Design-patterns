package shapes;

public class Rectangle implements Shape{
    private double height;
    private double width;
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void showDetails() {
        System.out.println("Shape Type: Rectangle\nHeight = " + height +"\nWidth = " + width + "\nArea = " + getArea());
    }
}
