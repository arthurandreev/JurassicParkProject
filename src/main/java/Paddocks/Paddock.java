package Paddocks;

import Dinosaurs.Dinosaur;

import java.util.ArrayList;

public abstract class Paddock {

    private String name;
    private ArrayList<Dinosaur> dinosaurs;
    private int capacity;

    public Paddock(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.dinosaurs = new ArrayList<>();
    }

    public int getPaddockCount(){
        return dinosaurs.size();
    }

    public void addDinoToPaddock(Dinosaur dinosaur){
        this.dinosaurs.add(dinosaur);
    }

    public void removeDinoFromPaddock(Dinosaur dinosaur){
        this.dinosaurs.remove(dinosaur);
    }

}
