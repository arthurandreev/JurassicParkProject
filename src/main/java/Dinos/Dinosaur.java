package Dinos;

import java.util.ArrayList;

public abstract class Dinosaur {

    private String name;
    private TypeOfDinosaur type;
    private ArrayList<Food> belly;
    private int bellyCapacity;
    private int healthPoints;
    private String dinoKind;

    public Dinosaur(String name, TypeOfDinosaur type, int bellyCapacity, int healthPoints, String dinoKind) {
        this.name = name;
        this.belly = new ArrayList<>();
        this.type = type;
        this.bellyCapacity = bellyCapacity;
        this.healthPoints = healthPoints;
        this.dinoKind = dinoKind;
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

    public String getDinoKind(){
        return dinoKind;
    }

    public boolean bellyIsFull() {
        return this.belly.size() == this.bellyCapacity;
    }

    public void printFoodEaten(Food food) {
        switch (getType()) {

            case Herbivore:
                System.out.println("I have just been fed with plants");

            case Carnivore:
                System.out.println("I have just been fed with animals");
        }
    }

        public void feedDinosaur (Food food){
            if (!bellyIsFull()) {
                printFoodEaten(food);
                this.belly.add(food);
            }
        }
}