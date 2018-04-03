package PaddockTests;

import Dinos.DinoList;
import Dinos.HerbieDino;
import Dinos.TypeOfDinosaur;
import Paddocks.HerbivorePaddock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHerbivorePaddock {

    HerbivorePaddock herbivorePaddock;
    TypeOfDinosaur typeOfDinosaur;
    HerbieDino herbieDino;
    DinoList dinoKind;

    @Before
    public void before(){
        herbivorePaddock = new HerbivorePaddock("CarnPaddock", 15);
        herbieDino = new HerbieDino("Steve", typeOfDinosaur.Herbivore, 10, 20, 10, dinoKind.Tricerator);
    }

    @Test
    public void canGetPaddockCount(){
        assertEquals(0, herbivorePaddock.getPaddockCount());
    }

    @Test
    public void canAddDinoToPaddock(){
        herbivorePaddock.addDinoToPaddock(herbieDino);
        herbivorePaddock.addDinoToPaddock(herbieDino);
        assertEquals(2, herbivorePaddock.getPaddockCount());
    }

    @Test
    public void canRemoveDinoFromPaddock(){
        herbivorePaddock.addDinoToPaddock(herbieDino);
        herbivorePaddock.addDinoToPaddock(herbieDino);
        herbivorePaddock.addDinoToPaddock(herbieDino);
        herbivorePaddock.removeDinoFromPaddock(herbieDino);
        assertEquals(2, herbivorePaddock.getPaddockCount());
    }
}
