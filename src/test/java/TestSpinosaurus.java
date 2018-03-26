import Dinosaurs.Food;
import Dinosaurs.Spinosaurus;
import Dinosaurs.TypeOfDinosaur;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestSpinosaurus {

    Spinosaurus spinosaurus;
    TypeOfDinosaur typeOfDinosaur;
    Food food;

    @Before
    public void before(){
        food = new Food(5);
        spinosaurus = new Spinosaurus("Bob", typeOfDinosaur.CARNIVORE, 15);
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", spinosaurus.getName());
    }

    @Test
    public void canSetName(){
        spinosaurus.setName("Jack");
        assertEquals("Jack", spinosaurus.getName());
    }

    @Test
    public void canGetType(){
        assertEquals(typeOfDinosaur.CARNIVORE, spinosaurus.getType());
    }

    @Test
    public void canGetFoodItemsInBelly(){
        spinosaurus.feedDinosaur(food);
        assertEquals(5,  food.getFoodIntake());
    }

    @Test
    public void canGetBellyCapacity(){
        assertEquals(15, spinosaurus.getBellyCapacity());
    }

    @Test
    public void checkIfBellyIsEmpty(){
        assertFalse(spinosaurus.bellyIsFull());
    }

    @Test
    public void checkIfBellyIsFull(){
        for(int i = 0; i < 15; i++){
            spinosaurus.feedDinosaur(food);
        }
        assertTrue(spinosaurus.bellyIsFull());
    }

    @Test
    public void checkIFLimitIs10ForBelly(){
        for(int i = 0; i < 17; i++){
            spinosaurus.feedDinosaur(food);
        }
        assertEquals(15, spinosaurus.getFoodItemsInBelly());
    }
}
