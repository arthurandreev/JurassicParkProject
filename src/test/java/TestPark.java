import Dinos.Dinosaur;
import Dinos.Spinosaurus;
import Dinos.TypeOfDinosaur;
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

    @Before
    public void before(){
        park = new Park("Ace Ventura Park");

        }
    @Test
    public void canGetName(){
        assertEquals("Ace Ventura Park", park.getName());
    }

    @Test
    public void canAddDinoToPaddock(){
        spinosaurus = new Spinosaurus("Steve", TypeOfDinosaur.HERBIVORE, 10, 15);
        park.addDinosaurToPaddock(spinosaurus);
        assertEquals(1, park.getHerbivorePaddock().getPaddockCount());
    }

    @Test
    public void canTransferToPaddock(){
        spinosaurus = new Spinosaurus("Dave", TypeOfDinosaur.HERBIVORE, 10, 15);
        herbivorePaddock = new HerbivorePaddock("HerbPad1", 10);
        herbivorePaddock2 = new HerbivorePaddock("HerbPad2", 15);
        park.transferDinosaur(spinosaurus, herbivorePaddock, herbivorePaddock2);
        assertEquals(1, herbivorePaddock2.getPaddockCount());
    }
}
