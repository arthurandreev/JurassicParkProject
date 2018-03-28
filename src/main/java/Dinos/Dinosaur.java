package Dinos;

import java.util.ArrayList;

public abstract class Dinosaur {

    private String name;
    private TypeOfDinosaur type;
    private ArrayList<Food> belly;
    private int bellyCapacity;
    private int healthPoints;

    public Dinosaur(String name, TypeOfDinosaur type, int bellyCapacity, int healthPoints) {
        this.name = name;
        this.belly = new ArrayList<>();
        this.type = type;
        this.bellyCapacity = bellyCapacity;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public TypeOfDinosaur getType() {
        return this.type;
    }

    public int getFoodItemsInBelly() {
        return belly.size();
    }

    public int getBellyCapacity() {
        return this.bellyCapacity;
    }

    public boolean bellyIsFull() {
        return this.belly.size() == this.bellyCapacity;
    }

    public void printFoodEaten(Food food) {
        switch (getType()) {

            case HERBIVORE:
                System.out.println("I have just been fed with plants");

            case CARNIVORE:
                System.out.println("I have just been fed with animals");
        }
    }

        public void feedDinosaur (Food food){
            if (!bellyIsFull()) {
                this.belly.add(food);
                printFoodEaten(food);
            }
        }
}