package Dinosaurs;

import java.util.ArrayList;

public abstract class Dinosaur {

    private String name;
    private TypeOfDinosaur type;
    private ArrayList<Food> belly;
    private FoodType foodType;
    private int bellyCapacity;

    public Dinosaur(String name, TypeOfDinosaur type, int bellyCapacity, FoodType foodType){
        this.name = name;
        this.belly = new ArrayList<>();
        this.type = type;
        this.bellyCapacity = bellyCapacity;
        this.foodType = foodType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfDinosaur getType() {
        return this.type;
    }

    public int getFoodItemsInBelly(){
        return belly.size();
    }

    public int getBellyCapacity(){
        return this.bellyCapacity;
    }

    public boolean bellyIsFull() {
        return this.belly.size() == this.bellyCapacity;
    }

    public void feedDinosaur(Food food) {
        if (!bellyIsFull()) {
            this.belly.add(food);
        }
    }
}
