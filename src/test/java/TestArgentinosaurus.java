import Dinosaurs.Argentinosaurus;
import Dinosaurs.Food;
import Dinosaurs.TypeOfDinosaur;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestArgentinosaurus {

    Argentinosaurus argentinosaurus;
    TypeOfDinosaur typeOfDinosaur;
    Food food;


    @Before
    public void before() {
        food = new Food(5);
        argentinosaurus = new Argentinosaurus("Steve", typeOfDinosaur.HERBIVORE, 10);
    }

    @Test
    public void canGetName() {
        assertEquals("Steve", argentinosaurus.getName());
    }

    @Test
    public void canSetName(){
        argentinosaurus.setName("Dave");
        assertEquals("Dave", argentinosaurus.getName());
    }

    @Test
    public void canGetType(){
        assertEquals(typeOfDinosaur.HERBIVORE, argentinosaurus.getType());
    }

    @Test
    public void canGetFoodItemsInBelly() {
        argentinosaurus.feedDinosaur(food);
        assertEquals(1, argentinosaurus.getFoodItemsInBelly());
    }

    @Test
    public void canGetBellyCapacity() {
        assertEquals(10, argentinosaurus.getBellyCapacity());
    }

    @Test
    public void checkIfBellyIsEmpty(){
       assertFalse(argentinosaurus.bellyIsFull());
    }

    @Test
    public void checkIfBellyIsFull(){
        for(int i = 0; i < 10; i++){
            argentinosaurus.feedDinosaur(food);
        }
        assertTrue(argentinosaurus.bellyIsFull());
    }

    @Test
    public void checkIFLimitIs10ForBelly(){
        for(int i = 0; i < 12; i++){
            argentinosaurus.feedDinosaur(food);
        }
        assertEquals(10, argentinosaurus.getFoodItemsInBelly());
    }

    }

