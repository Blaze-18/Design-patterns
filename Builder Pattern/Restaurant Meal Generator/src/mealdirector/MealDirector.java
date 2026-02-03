package mealdirector;

import builder.NonVegBuilder;
import builder.VegBuilder;
import meal.Meal;

public class MealDirector{

    private String mealType;
    private int burgerAmmount;
    private int coldDSrinkAmmount;

    public MealDirector(String mealType, int burgerAmmount, int coldDSrinkAmmount) {
        this.mealType = mealType;
        this.burgerAmmount = burgerAmmount;
        this.coldDSrinkAmmount = coldDSrinkAmmount;
    }



    public MealDirector(String mealType){
        this.mealType = mealType;
    }

    public Meal makeMeal(){
        if(mealType.equalsIgnoreCase("Non-veg")){
            NonVegBuilder nonVegBuilder = new NonVegBuilder(burgerAmmount, coldDSrinkAmmount);
            return nonVegBuilder.buildMeal();
        } else if (mealType.equalsIgnoreCase("Veg")) {
            VegBuilder vegBuilder = new VegBuilder(burgerAmmount, coldDSrinkAmmount);
            return vegBuilder.buildMeal();
        }
        else{
            System.out.println("Wrong Meal type");
            throw new IllegalArgumentException("Meal can be either veg or non veg");
        }
    }

}
