package meal;

import Burger.Burger;
import colddrink.ColdDrink;
import packaging.Packaging;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Burger> burgers = new ArrayList<>();
    private ArrayList<ColdDrink> coldDrinks = new ArrayList<>();
    private String mealType;
    private Packaging packingBurger;
    private Packaging packingDrinks;
    private double totalPrice;

    public double getTotalPrice(){
        double burgerPrice = 0.0;
        double coldDrinkPrice = 0.0;
        for(Burger burger: burgers){
            burgerPrice+= burger.getPrice();
        }
        for(ColdDrink coldDrink: coldDrinks){
            coldDrinkPrice += coldDrink.getPrice();
        }
        return burgerPrice + coldDrinkPrice;
    }
    public void setMealType(String mealType){
        this.mealType = mealType;
    }
    public String getMealType(){
        return mealType;
    }

    public void addBurgers(ArrayList<Burger> burgers) {
        this.burgers = burgers;
    }
    public void addColdDrinks(ArrayList<ColdDrink> coldDrinks) {
        this.coldDrinks = coldDrinks;
    }
    public void setPackingBurger(Packaging wrapper){
        packingBurger = wrapper;
    }
    public void setPackingDrinks(Packaging bottle){
        packingDrinks = bottle;
    }
    public void showMealDescription(){
        StringBuilder burgerNames = new StringBuilder();
        for(Burger burger: burgers){
            burgerNames.append(" ").append(burger.getName()).append("\tPrice: ").append(burger.getPrice()).append("\n");
        }
        StringBuilder coldDrinkNames = new StringBuilder();
        for(ColdDrink coldDrink: coldDrinks){
            coldDrinkNames.append(" ").append(coldDrink.getName()).append("\tPrice: ").append(coldDrink.getPrice()).append("\n");
        }

        System.out.println("Meal Type: " + mealType
                + "\nBurgers: " + burgerNames + "\nCold Drinks: " + coldDrinkNames
                + "\nPacking Methods: Burger: " + packingBurger.getPackingMethod() + " Cold Drinks: " + packingDrinks.getPackingMethod()
                + "\nTotal Price: " + getTotalPrice()
        );
    }




}
