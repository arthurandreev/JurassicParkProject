import Dinosaurs.Food;
import Dinosaurs.TypeOfDinosaur;
import Dinosaurs.Tyrannosaurus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestTyrannosaurus {

    Tyrannosaurus tyrannosaurus;
    TypeOfDinosaur typeOfDinosaur;
    Food food;

    @Before
    public void before(){
        food = new Food(5);
        tyrannosaurus = new Tyrannosaurus("Jeniffer", typeOfDinosaur.CARNIVORE, 15);
    }

    @Test
    public void canGetName() {
        assertEquals("Jeniffer", tyrannosaurus.getName());
    }

    @Test
    public void canSetName(){
        tyrannosaurus.setName("Alice");
        assertEquals("Alice", tyrannosaurus.getName());
    }

    @Test
    public void canGetType(){
        assertEquals(typeOfDinosaur.CARNIVORE, tyrannosaurus.getType());
    }

    @Test
    public void canGetFoodItemsInBelly(){
        tyrannosaurus.feedDinosaur(food);
        assertEquals(5,  food.getFoodIntake());
    }

    @Test
    public void canGetBellyCapacity(){
        assertEquals(15, tyrannosaurus.getBellyCapacity());
    }

    @Test
    public void checkIfBellyIsEmpty(){
        assertFalse(tyrannosaurus.bellyIsFull());
    }

    @Test
    public void checkIfBellyIsFull(){
        for(int i = 0; i < 15; i++){
            tyrannosaurus.feedDinosaur(food);
        }
        assertTrue(tyrannosaurus.bellyIsFull());
    }

    @Test
    public void checkIFLimitIs10ForBelly(){
        for(int i = 0; i < 17; i++){
            tyrannosaurus.feedDinosaur(food);
        }
        assertEquals(15, tyrannosaurus.getFoodItemsInBelly());
    }
}

