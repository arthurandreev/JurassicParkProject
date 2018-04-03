package DinoTests;

import Dinos.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCarnivoreDino {

    CarnieDino carnieDino;
    TypeOfDinosaur typeOfDinosaur;
    Food food;
    FoodType foodType;
    DinoList dinoKind;


    @Before
    public void before() {
        food = new Food(foodType.ANIMALS);
        carnieDino = new CarnieDino("Tyrell", typeOfDinosaur.Carnivore, 10, 15, 10,dinoKind.Tyrannosaurus);
    }

    @Test
    public void canGetName() {
        assertEquals("Tyrell", carnieDino.getName());
    }

    @Test
    public void canSetName(){
        carnieDino.setName("Dave");
        assertEquals("Dave", carnieDino.getName());
    }

    @Test
    public void canGetType(){
        assertEquals(typeOfDinosaur.Carnivore, carnieDino.getType());
    }


    @Test
    public void canGetBellyCapacity() {
        assertEquals(10, carnieDino.getBellyCapacity());
    }

    @Test
    public void checkIfBellyIsEmpty(){
        assertFalse(carnieDino.bellyIsFull());
    }

    @Test
    public void checkIfBellyIsFull(){
        for(int i = 0; i < 10; i++){
            carnieDino.feedDinosaur(food);
        }
        assertTrue(carnieDino.bellyIsFull());
    }

    @Test
    public void checkIFLimitIs10ForBelly(){
        for(int i = 0; i < 12; i++){
            carnieDino.feedDinosaur(food);
        }
        assertEquals(10, carnieDino.getFoodItemsInBelly());
    }

}

