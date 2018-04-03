package Dinos;

public enum FoodType {

    ANIMALS("animals", 10),
    PLANTS("plants", 5);

    private String diet;
    private int energy;

    FoodType(String diet, int energy){
        this.diet = diet;
        this.energy = energy;
    }

    public String getDiet(){
        return this.diet;
    }

    public int getEnergy(){
        return this.energy;
    }
}
