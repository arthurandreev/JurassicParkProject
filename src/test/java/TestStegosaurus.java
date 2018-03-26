import Dinosaurs.Food;
import Dinosaurs.Stegosaurus;
import Dinosaurs.TypeOfDinosaur;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestStegosaurus {

    Stegosaurus stegosaurus;
    TypeOfDinosaur typeOfDinosaur;
    Food food;

    @Before
    public void before(){
        food = new Food(5);
        stegosaurus = new Stegosaurus("Nick", typeOfDinosaur.HERBIVORE, 15);
    }

    @Test
    public void canGetName() {
        assertEquals("Nick", stegosaurus.getName());
    }

    @Test
    public void canSetName(){
        stegosaurus.setName("Boris");
        assertEquals("Boris", stegosaurus.getName());
    }

    @Test
    public void canGetType(){
        assertEquals(typeOfDinosaur.HERBIVORE, stegosaurus.getType());
    }

    @Test
    public void canGetFoodItemsInBelly(){
        stegosaurus.feedDinosaur(food);
        assertEquals(5,  food.getFoodIntake());
    }

    @Test
    public void canGetBellyCapacity(){
        assertEquals(15, stegosaurus.getBellyCapacity());
    }

    @Test
    public void checkIfBellyIsEmpty(){
        assertFalse(stegosaurus.bellyIsFull());
    }

    @Test
    public void checkIfBellyIsFull(){
        for(int i = 0; i < 15; i++){
            stegosaurus.feedDinosaur(food);
        }
        assertTrue(stegosaurus.bellyIsFull());
    }

    @Test
    public void checkIFLimitIs10ForBelly(){
        for(int i = 0; i < 17; i++){
            stegosaurus.feedDinosaur(food);
        }
        assertEquals(15, stegosaurus.getFoodItemsInBelly());
    }
}
