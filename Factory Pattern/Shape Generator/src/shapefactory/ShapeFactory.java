package shapefactory;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;

public class ShapeFactory {
    public Shape makeShape(String shapeType, double... dimensions){
        if(shapeType.equalsIgnoreCase("Rectangle")){
            if(dimensions.length == 0){
                return new Rectangle(1.5,2);
            } else if (dimensions.length == 2) {
                return new Rectangle(dimensions[0], dimensions[1]);
            }
            else {
                System.out.println("Wrong dimensions for rectangle");
                throw new IllegalArgumentException("Rectangle has only two dimensions");
            }
        }
        else if(shapeType.equalsIgnoreCase("Circle")){
            if(dimensions.length == 0){
                return new Circle(1);
            } else if (dimensions.length == 1) {
                return new Circle(dimensions[0]);
            }
            else {
                System.out.println("Wrong dimensions for Circle");
                throw new IllegalArgumentException("Circle has only one dimensions");
            }
        }
        else if(shapeType.equalsIgnoreCase("Triangle")){
            if(dimensions.length == 0){
                return new Triangle(3,3,3);
            } else if (dimensions.length == 3) {
                if(isTriangle(dimensions[0],dimensions[1], dimensions[2])) {
                    return new Rectangle(dimensions[0], dimensions[1]);
                }
                else{
                    System.out.println("Invalid Sides for triangle");
                    throw new IllegalArgumentException("Sum of two dies must be greater than the other");
                }
            }
            else {
                System.out.println("Wrong dimensions for Triangle");
                throw new IllegalArgumentException("Triangle has only three dimensions");
            }
        }else{
            System.out.println("Shape type does not match");
            throw new IllegalArgumentException("Shapes can only be circle, triangle or rectangle");
        }
    }

    public boolean isTriangle(double a, double b, double c){
        return a+b>c && a+c>b && b+c>a;
    }
}
