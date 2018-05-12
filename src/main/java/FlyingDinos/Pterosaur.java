package FlyingDinos;

import Dinos.Dinosaur;

public abstract class Pterosaur {
    private String name;
    private int speed;
    private int attackValue;
    private int wingSpan;
    private String kind;

    public Pterosaur(String name, int speed, int attackValue, int wingSpan, String kind) {
        this.name = name;
        this.speed = speed;
        this.attackValue = attackValue;
        this.wingSpan = wingSpan;
        this.kind = kind;
    }

    public String getName() {
        System.out.println("I am " + this.name + ", a flying reptile of type " + this.kind + " and I am here to kick some Dino ass!");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind(){
        return kind;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAttackValue() {
        System.out.println("I am packing heat and my attack value is " + attackValue + " health points that my enemies lose when I strike!");
        return attackValue;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    //checks if dinosaur has more than 0 health points, if yes, deducts health points by attack value points and prints a message to the console
    public void attack(Dinosaur dinosaur) {
        if (dinosaur.getHealthPoints() > 0) {
            dinosaur.setHealthPoints(dinosaur.getHealthPoints() - attackValue);
            System.out.println("Taking care of business: attacking " + dinosaur.getName() + " who has " + dinosaur.getHealthPoints() + " health points left!");
//            If health points are equal to zero, prints a message to the console
            if (dinosaur.getHealthPoints() == 0) {
                System.out.println(dinosaur.getName() + " took the hit and kicked the bucket!");
            }
//            Else, prints a message to the console
        } else {
            System.out.println("Stop attacking " + dinosaur.getName() + ", you can't kill a ghost! He is already dead you doughnut!");
            System.out.println("---------------------------------------------------------------------------------------------------");
        }
    }
}
