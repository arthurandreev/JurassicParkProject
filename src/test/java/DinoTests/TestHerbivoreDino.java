package DinoTests;

import Dinos.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestHerbivoreDino {

    HerbieDino herbieDino;
    TypeOfDinosaur typeOfDinosaur;
    Food food;
    FoodType foodType;
    DinoList dinoKind;


    @Before
    public void before() {
        food = new Food(foodType.PLANTS);
        herbieDino = new HerbieDino("Steve", typeOfDinosaur.Herbivore, 10, 15, 10, dinoKind.Spinosaurus);
    }

    @Test
    public void canGetName() {
        assertEquals("Steve", herbieDino.getName());
    }

    @Test
    public void canSetName(){
        herbieDino.setName("Dave");
        assertEquals("Dave", herbieDino.getName());
    }

    @Test
    public void canGetType(){
        assertEquals(typeOfDinosaur.Herbivore, herbieDino.getType());
    }


    @Test
    public void canGetBellyCapacity() {
        assertEquals(10, herbieDino.getBellyCapacity());
    }

    @Test
    public void checkIfBellyIsEmpty(){
        assertFalse(herbieDino.bellyIsFull());
    }

    @Test
    public void checkIfBellyIsFull(){
        for(int i = 0; i < 10; i++){
            herbieDino.feedDinosaur(food);
        }
        assertTrue(herbieDino.bellyIsFull());
    }

    @Test
    public void checkIFLimitIs10ForBelly(){
        for(int i = 0; i < 12; i++){
            herbieDino.feedDinosaur(food);
        }
        assertEquals(10, herbieDino.getFoodItemsInBelly());
    }

}

