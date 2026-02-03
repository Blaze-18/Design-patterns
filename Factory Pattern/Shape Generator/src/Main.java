import shapefactory.ShapeFactory;
import shapes.Circle;
import shapes.Shape;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShapeFactory rectangleFactory = new ShapeFactory();
        ShapeFactory triangleFactory = new ShapeFactory();
        ShapeFactory circleFactory = new ShapeFactory();

        System.out.println("Default Circle");
        Shape defaultCircle = circleFactory.makeShape("Circle");
        defaultCircle.showDetails();
        System.out.println("Custom Circle");
        Shape customCircle = circleFactory.makeShape("Circle", 4);
        customCircle.showDetails();
        System.out.println("Wrong circle");
        Shape wrongCircle = circleFactory.makeShape("Circle", 5,6,7);
        wrongCircle.showDetails();

    }
}