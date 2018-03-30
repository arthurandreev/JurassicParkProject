package PaddockTests;

import Dinos.TypeOfDinosaur;
import Dinos.Tyrannosaurus;
import Paddocks.CarnivorePaddock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCarnivorePaddock {

    CarnivorePaddock carnivorePaddock;
    Tyrannosaurus tyrannosaurus;
    TypeOfDinosaur typeOfDinosaur;

    @Before
    public void before(){
        carnivorePaddock = new CarnivorePaddock("CarnPaddock", 15);
        tyrannosaurus = new Tyrannosaurus("Tyrrel", typeOfDinosaur.Carnivore, 10, 20, "Tyrannosaurus");
    }

    @Test
    public void canGetPaddockCount(){
        assertEquals(0, carnivorePaddock.getPaddockCount());
    }

    @Test
    public void canAddDinoToPaddock(){
        carnivorePaddock.addDinoToPaddock(tyrannosaurus);
        carnivorePaddock.addDinoToPaddock(tyrannosaurus);
        assertEquals(2, carnivorePaddock.getPaddockCount());
    }

    @Test
    public void canRemoveDinoFromPaddock(){
        carnivorePaddock.addDinoToPaddock(tyrannosaurus);
        carnivorePaddock.addDinoToPaddock(tyrannosaurus);
        carnivorePaddock.addDinoToPaddock(tyrannosaurus);
        carnivorePaddock.removeDinoFromPaddock(tyrannosaurus);
        assertEquals(2, carnivorePaddock.getPaddockCount());
    }
}
