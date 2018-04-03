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
    HerbieDino herbieDino;
    HerbivorePaddock herbivorePaddock;
    HerbivorePaddock herbivorePaddock2;
    Visitor visitor;
    Paddock paddocks;
    Visitor visitors;
    CarnieDino carnieDino;
    CarnivorePaddock carnivorePaddock;
    Pterodactylus pterodactylus;
    Food food;
    FoodType foodType;
    DinoList dinoKind;


    @Before
    public void before(){
        park = new Park(100);
        herbieDino = new HerbieDino("Steve", TypeOfDinosaur.Herbivore, 10, 15, 10, dinoKind.Tyrannosaurus);
        visitor = new Visitor("Dave", "Bountry hunter");
        food = new Food(foodType.ANIMALS);
        }

    @Test
    public void canGetName(){
        assertEquals("Ace Ventura", park.getName());
    }

    @Test
    public void canAddDinoToPaddock(){
        park.addDinosaurToPaddock(herbieDino);
        assertEquals(1, park.getHerbivorePaddock().getPaddockCount());
    }

    @Test
    public void canTransferToPaddock(){
        herbivorePaddock = new HerbivorePaddock("HerbPad1", 10);
        herbivorePaddock2 = new HerbivorePaddock("HerbPad2", 15);
        park.transferDinosaur(herbieDino, herbivorePaddock, herbivorePaddock2);
        assertEquals(1, herbivorePaddock2.getPaddockCount());
    }

    @Test
    public void canFeedDinosaur() {
        herbieDino.feedDinosaur(food);
        assertEquals(1, herbieDino.getFoodItemsInBelly());
        assertEquals(20, herbieDino.getEnergyLevel());
    }

    @Test
    public void flyingDinoCanAttackDino() {
        carnieDino = new CarnieDino("Luigi", typeOfDinosaur.Carnivore, 15, 20, 10, dinoKind.Stegosaurus);
        pterodactylus = new Pterodactylus("Pedro", 50, 10, 50, "Pterodactylus");
        pterodactylus.attack(carnieDino);
        assertEquals(10, carnieDino.getHealthPoints());
    }

    @Test
    public void canCheckInVisitorToPark(){
        park.checkInVisitorToPark(visitor);
        assertEquals(1, park.getNumberOfVisitors());
    }
}
