package builder;

import Burger.Burger;
import Burger.ChickenBurger;
import colddrink.Coke;
import colddrink.ColdDrink;
import meal.Meal;
import packaging.Bottle;
import packaging.Wrapper;

import java.util.ArrayList;

public class NonVegBuilder extends MealBuilder{

    private int burgerAmmount;
    private int coldDrinkAmmount;

    public NonVegBuilder(int burgerAmmount, int coldDrinkAmmount) {
        this.burgerAmmount = burgerAmmount;
        this.coldDrinkAmmount = coldDrinkAmmount;
    }

    @Override
    public Meal buildMeal() {
        Meal nonVegMeal = new Meal();
        nonVegMeal.setMealType("Non Veg");
        nonVegMeal.addBurgers(addBurgersSelectedAmmount());
        nonVegMeal.addColdDrinks(addColdDrinksSelectedAmmount());
        nonVegMeal.setPackingBurger(new Wrapper());
        nonVegMeal.setPackingDrinks(new Bottle());
        return nonVegMeal;
    }
    private ArrayList<Burger> addBurgersSelectedAmmount(){

        ArrayList<Burger> chickenBurgers = new ArrayList<>();
        for(int i = 0; i < burgerAmmount; i++ ) {
            chickenBurgers.add(new ChickenBurger());
        }
        return chickenBurgers;
    }
    private ArrayList<ColdDrink> addColdDrinksSelectedAmmount(){

        ArrayList<ColdDrink> coldDrinks = new ArrayList<>();
        for(int i = 0; i < coldDrinkAmmount; i++ ) {
            coldDrinks.add(new Coke());
        }
        return coldDrinks;
    }
}
