package builder;

import Burger.VegBurger;
import Burger.Burger;

import colddrink.ColdDrink;
import colddrink.Pepsi;
import meal.Meal;
import packaging.Bottle;
import packaging.Wrapper;

import java.util.ArrayList;

public class VegBuilder extends MealBuilder{
    private int burgerAmmount;
    private int coldDrinkAmmount;

    public VegBuilder(int coldDrinkAmmount, int burgerAmmount) {
        this.coldDrinkAmmount = coldDrinkAmmount;
        this.burgerAmmount = burgerAmmount;
    }

    @Override
    public Meal buildMeal() {
        Meal nonVegMeal = new Meal();
        nonVegMeal.setMealType("Veg");
        nonVegMeal.addBurgers(addBurgersSelectedAmmount());
        nonVegMeal.addColdDrinks(addColdDrinksSelectedAmmount());
        nonVegMeal.setPackingBurger(new Wrapper());
        nonVegMeal.setPackingDrinks(new Bottle());
        return nonVegMeal;
    }
    private ArrayList<Burger> addBurgersSelectedAmmount(){

        ArrayList<Burger> vegBurgers = new ArrayList<>();
        for(int i = 0; i < burgerAmmount; i++ ) {
            vegBurgers.add(new VegBurger());
        }
        return vegBurgers;
    }
    private ArrayList<ColdDrink> addColdDrinksSelectedAmmount(){

        ArrayList<ColdDrink> pepsies = new ArrayList<>();
        for(int i = 0; i < coldDrinkAmmount; i++ ) {
            pepsies.add(new Pepsi());
        }
        return pepsies;
    }
}
