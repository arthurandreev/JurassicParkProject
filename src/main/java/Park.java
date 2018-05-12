import Dinos.Dinosaur;
import Paddocks.Paddock;
import Paddocks.CarnivorePaddock;
import Paddocks.HerbivorePaddock;


import java.util.ArrayList;

public class Park {

    private int parkCapacity;
    private String name;
    private ArrayList<Paddock> paddocks;
    private ArrayList<Visitor> visitors;
    private HerbivorePaddock herbivorePaddock;
    private HerbivorePaddock herbivorePaddock2;
    private CarnivorePaddock carnivorePaddock;
    private Park park;
    private Visitor visitor;


    public Park(int parkCapacity) {
        this.parkCapacity = parkCapacity;
        this.name = "Ace Ventura";
        paddocks = new ArrayList<Paddock>();
        visitors = new ArrayList<Visitor>();
        herbivorePaddock = new HerbivorePaddock("HerbPaddock", 10);
        carnivorePaddock = new CarnivorePaddock("CarnPaddock", 15);
    }

    public void getWelcomeMessage(){
        System.out.println("Please REFRAIN from petting the Dinos!");
        System.out.println("Do NOT throw used beer cans at the flying reptiles!");
        System.out.println("Have a can but don't be a can't!");
    }

    public void getGoodbyeMessage(){
        System.out.println("THE end.");
    }

    public String getName() {
        return name;
    }

    public int getPaddockCount(){
        System.out.println("This park contains " + paddocks.size() + " paddocks");
      return paddocks.size();
    }

    public HerbivorePaddock getHerbivorePaddock() {
        return herbivorePaddock;
    }

    public CarnivorePaddock getCarnivorePaddock(){
        return carnivorePaddock;
    }

    public void addDinosaurToPaddock(Dinosaur dinosaur) {
//        switch case statement that calls getType method on dinosaur object to access TypeOfDinosaur Enum
        switch (dinosaur.getType()) {
            case Herbivore:
                herbivorePaddock.addDinoToPaddock(dinosaur);

            case Carnivore:
                carnivorePaddock.addDinoToPaddock(dinosaur);
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println(dinosaur.getName() + " has just been added to a paddock in " + this.name + " Jurassic Park!");
        System.out.println("Steve is a " + dinosaur.getType() + " of type " + dinosaur.getDinoKind() + "!");
        System.out.println("Steve is surrounded by predators who can attack at any time!");
        System.out.println("Steve has " + dinosaur.getHealthPoints() + " health points remaining!");
        System.out.println("Every time a predator attacks, Steve looses health points!");
        System.out.println("Let's see how long Steve can last against our flying predator of the day - Luigi the Dino Shredder!");
        System.out.println("---------------------------------------------------------------------------------------------------");
    }

    //transfers a dinosaur from one herbivore paddock to another herbivore paddock
    public void transferDinosaur(Dinosaur dinoToMove, Paddock paddockToMoveFrom, Paddock paddockToMoveTo){
        paddockToMoveFrom.removeDinoFromPaddock(dinoToMove);
        paddockToMoveTo.addDinoToPaddock(dinoToMove);
        System.out.println("Dino has been transferred to a new paddock!");
    }

    public int getNumberOfVisitors(){
        return visitors.size();
    }

    public boolean parkIsFull(){
         return visitors.size() == parkCapacity;
    }

    //checks in a visitor into the park, if park is NOT full, and prints a message to the console
    public void checkInVisitorToPark(Visitor visitor){
        if (!parkIsFull()){
            visitors.add(visitor);
        }
        System.out.println("Dear " + visitor.getName() + ", thanks for checking in to " + name + "!");
    }

}
