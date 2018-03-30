package PaddockTests;

import Dinos.Stegosaurus;
import Dinos.TypeOfDinosaur;
import Paddocks.HerbivorePaddock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHerbivorePaddock {

    HerbivorePaddock herbivorePaddock;
    Stegosaurus stegosaurus;
    TypeOfDinosaur typeOfDinosaur;

    @Before
    public void before(){
        herbivorePaddock = new HerbivorePaddock("CarnPaddock", 15);
        stegosaurus = new Stegosaurus("Steve", typeOfDinosaur.Herbivore, 10, 20, "Stegosaurus");
    }

    @Test
    public void canGetPaddockCount(){
        assertEquals(0, herbivorePaddock.getPaddockCount());
    }

    @Test
    public void canAddDinoToPaddock(){
        herbivorePaddock.addDinoToPaddock(stegosaurus);
        herbivorePaddock.addDinoToPaddock(stegosaurus);
        assertEquals(2, herbivorePaddock.getPaddockCount());
    }

    @Test
    public void canRemoveDinoFromPaddock(){
        herbivorePaddock.addDinoToPaddock(stegosaurus);
        herbivorePaddock.addDinoToPaddock(stegosaurus);
        herbivorePaddock.addDinoToPaddock(stegosaurus);
        herbivorePaddock.removeDinoFromPaddock(stegosaurus);
        assertEquals(2, herbivorePaddock.getPaddockCount());
    }
}
