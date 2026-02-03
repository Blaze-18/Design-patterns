import meal.Meal;
import mealdirector.MealDirector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MealDirector vegMealDirector = new MealDirector("Veg", 3, 3);
        MealDirector nonVegMealDirector = new MealDirector("Non-Veg", 2, 3);
        System.out.println("First Order");
        Meal vegMeal = vegMealDirector.makeMeal();
        vegMeal.showMealDescription();

        System.out.println("\nSecond Order");
        Meal nonvegMeal = nonVegMealDirector.makeMeal();
        nonvegMeal.showMealDescription();
    }
}