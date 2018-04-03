package PaddockTests;

import Dinos.CarnieDino;
import Dinos.DinoList;
import Dinos.TypeOfDinosaur;
import Paddocks.CarnivorePaddock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCarnivorePaddock {

    CarnivorePaddock carnivorePaddock;
    TypeOfDinosaur typeOfDinosaur;
    CarnieDino carnieDino;
    DinoList dinoKind;

    @Before
    public void before(){
        carnivorePaddock = new CarnivorePaddock("CarnPaddock", 15);
        carnieDino = new CarnieDino ("Tyrrel", typeOfDinosaur.Carnivore, 10, 20, 10, dinoKind.Tyrannosaurus);
    }

    @Test
    public void canGetPaddockCount(){
        assertEquals(0, carnivorePaddock.getPaddockCount());
    }

    @Test
    public void canAddDinoToPaddock(){
        carnivorePaddock.addDinoToPaddock(carnieDino);
        carnivorePaddock.addDinoToPaddock(carnieDino);
        assertEquals(2, carnivorePaddock.getPaddockCount());
    }

    @Test
    public void canRemoveDinoFromPaddock(){
        carnivorePaddock.addDinoToPaddock(carnieDino);
        carnivorePaddock.addDinoToPaddock(carnieDino);
        carnivorePaddock.addDinoToPaddock(carnieDino);
        carnivorePaddock.removeDinoFromPaddock(carnieDino);
        assertEquals(2, carnivorePaddock.getPaddockCount());
    }
}
