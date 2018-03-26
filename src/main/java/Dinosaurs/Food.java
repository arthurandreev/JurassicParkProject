package Dinosaurs;

import java.util.ArrayList;

public class Food {

    private int foodIntake;
    private ArrayList<FoodType> foodType;

    public Food(int foodIntake) {
        this.foodIntake = foodIntake;
        this.foodType = new ArrayList<>();
    }


    public int getFoodIntake() {
        return foodIntake;
    }

    public void setFoodIntake(int foodIntake) {
        this.foodIntake = foodIntake;
    }

}
