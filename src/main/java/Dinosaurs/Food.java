package Dinosaurs;

import java.util.ArrayList;
import java.util.HashMap;

public class Food {

    private int foodIntake;
    private HashMap<TypeOfDinosaur, String> foodType;
    public Food(int foodIntake) {
        this.foodIntake = foodIntake;
        this.foodType = createHashmap();
    }


    public int getFoodIntake() {
        return foodIntake;
    }

    public void setFoodIntake(int foodIntake) {
        this.foodIntake = foodIntake;
    }

    public HashMap<TypeOfDinosaur, String> createHashmap() {
        HashMap<TypeOfDinosaur, String> diet = new HashMap<>();
        diet.put(TypeOfDinosaur.HERBIVORE, "Plants");
        diet.put(TypeOfDinosaur.CARNIVORE, "Animals");
                return diet;
    }
}
