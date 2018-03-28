package FlyingDinos;

import Dinos.Dinosaur;

public abstract class Pterosaur {
    private String name;
    private int speed;
    private int attackValue;
    private int wingSpan;

    public Pterosaur(String name, int speed, int attackValue, int wingSpan){
        this.name = name;
        this.speed = speed;
        this.attackValue = attackValue;
        this.wingSpan = wingSpan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void attack(Dinosaur dinosaur){
        dinosaur.setHealthPoints(dinosaur.getHealthPoints() - attackValue);
        System.out.println("Taking care of business: attacking " + dinosaur.getName() + " who has " + dinosaur.getHealthPoints() + " health points left!");
    }
}
