import Dinosaurs.Dinosaur;
import Paddocks.Paddock;
import Paddocks.CarnivorePaddock;
import Paddocks.HerbivorePaddock;


import java.util.ArrayList;

public class Park {

    private int counter;
    private String name;
//    private ArrayList<Paddock> paddocks;
    private ArrayList<Visitor> visitors;
    private HerbivorePaddock herbivorePaddock;
    private HerbivorePaddock herbivorePaddock2;
    private CarnivorePaddock carnivorePaddock;


    public Park(String name) {
        this.name = name;
//        paddocks = new ArrayList<Paddock>();
        visitors = new ArrayList<Visitor>();
        herbivorePaddock = new HerbivorePaddock("HerbPaddock", 10);
        carnivorePaddock = new CarnivorePaddock("CarnPaddock", 15);
    }

    public String getName() {
        return name;
    }

    public HerbivorePaddock getHerbivorePaddock() {
        return herbivorePaddock;
    }

    public CarnivorePaddock getCarnivorePaddock(){
        return carnivorePaddock;
    }

    public void addDinosaurToPaddock(Dinosaur dinosaur) {
        switch (dinosaur.getType()) {
            case HERBIVORE:
                herbivorePaddock.addDinoToPaddock(dinosaur);

            case CARNIVORE:
                carnivorePaddock.addDinoToPaddock(dinosaur);
        }
    }

    public void transferDinosaur(Dinosaur dinoToMove, Paddock paddockToMoveFrom, Paddock paddockToMoveTo){
        paddockToMoveFrom.removeDinoFromPaddock(dinoToMove);
        paddockToMoveTo.addDinoToPaddock(dinoToMove);
    }

}
