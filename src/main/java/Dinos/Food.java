package Dinos;

public class Food {

    private FoodType foodtype;

    public Food(FoodType foodType){
        this.foodtype = foodType;
    }

    public String getDiet(){
        return this.foodtype.getDiet();
    }

    public int getEnergy(){
        return this.foodtype.getEnergy();
    }
}
