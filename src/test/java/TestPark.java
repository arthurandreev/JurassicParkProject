import Dinos.*;
import FlyingDinos.Pterodactylus;
import Paddocks.CarnivorePaddock;
import Paddocks.HerbivorePaddock;
import Paddocks.Paddock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestPark {
    Park park;
    Dinosaur dinosaur;
    TypeOfDinosaur typeOfDinosaur;
    Spinosaurus spinosaurus;
    Visitor visitor;
    Paddock paddocks;
    Visitor visitors;
    HerbivorePaddock herbivorePaddock;
    HerbivorePaddock herbivorePaddock2;
    CarnivorePaddock carnivorePaddock;
    Pterodactylus pterodactylus;
    Stegosaurus stegosaurus;
    Tyrannosaurus tyrannosaurus;
    Food food;


    @Before
    public void before(){
        park = new Park(100);
        spinosaurus = new Spinosaurus("Steve", TypeOfDinosaur.Herbivore, 10, 15, "Spinosaurus");
        visitor = new Visitor("Dave", "Bountry hunter");
        }

    @Test
    public void canGetName(){
        assertEquals("Ace Ventura", park.getName());
    }

    @Test
    public void canAddDinoToPaddock(){
        park.addDinosaurToPaddock(spinosaurus);
        assertEquals(1, park.getHerbivorePaddock().getPaddockCount());
    }

    @Test
    public void canTransferToPaddock(){
        herbivorePaddock = new HerbivorePaddock("HerbPad1", 10);
        herbivorePaddock2 = new HerbivorePaddock("HerbPad2", 15);
        park.transferDinosaur(spinosaurus, herbivorePaddock, herbivorePaddock2);
        assertEquals(1, herbivorePaddock2.getPaddockCount());
    }

    @Test
    public void canFeedDinosaur() {
        spinosaurus.feedDinosaur(food);
        assertEquals(1, spinosaurus.getFoodItemsInBelly());
    }

    @Test
    public void flyingDinoCanAttackDino() {
        stegosaurus = new Stegosaurus("Luigi", typeOfDinosaur.Carnivore, 15, 20, "Stegosaurus");
        pterodactylus = new Pterodactylus("Pedro", 50, 10, 50, "Pterodactylus");
        pterodactylus.attack(stegosaurus);
        assertEquals(10, stegosaurus.getHealthPoints());
    }

    @Test
    public void canCheckInVisitorToPark(){
        park.checkInVisitorToPark(visitor);
        assertEquals(1, park.getNumberOfVisitors());
    }
}
