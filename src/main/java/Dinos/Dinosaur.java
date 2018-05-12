package Dinos;

import java.util.ArrayList;

public abstract class Dinosaur {

    private String name;
    private TypeOfDinosaur type;
    private ArrayList<Food> belly;
    private int bellyCapacity;
    private int healthPoints;
    private int energyLevel;
    private Food food;
    private FoodType foodType;
    private DinoList dinoKind;

    public Dinosaur(String name, TypeOfDinosaur type, int bellyCapacity, int healthPoints, int energyLevel, DinoList dinoKind) {
        this.name = name;
        this.belly = new ArrayList<>();
        this.type = type;
        this.bellyCapacity = bellyCapacity;
        this.healthPoints = healthPoints;
        this.energyLevel = energyLevel;
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

    public int getEnergyLevel(){
        return this.energyLevel;
    }

    public void setEnergyLevel(){
        this.energyLevel = energyLevel;
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

    public DinoList getDinoKind(){
        return this.dinoKind;
    }

    //checks if the belly array is full
    public boolean bellyIsFull() {
        return this.belly.size() == this.bellyCapacity;
    }

    //gets type of dinosaur(herbivore or carnivore) from an Enum, then prints a message to the console
    public void printFoodEaten(Food food) {
        switch (getType()) {

            case Herbivore:
                System.out.println("I have just been fed with " + foodType.PLANTS.getDiet());

            case Carnivore:
                System.out.println("I have just been fed with " + foodType.ANIMALS.getDiet());
        }
    }

    //calls printFoodEaten method, adds food to belly and increases energy level of dinosaur
        public void feedDinosaur (Food food){
            if (!bellyIsFull()) {
                printFoodEaten(food);
                this.belly.add(food);
                this.energyLevel = this.energyLevel + food.getEnergy();
            }
        }
}