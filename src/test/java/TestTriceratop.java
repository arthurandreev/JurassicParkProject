import Dinosaurs.Food;
import Dinosaurs.Triceratop;
import Dinosaurs.TypeOfDinosaur;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestTriceratop {

    Triceratop triceratop;
    TypeOfDinosaur typeOfDinosaur;
    Food food;

    @Before
    public void before(){
        food = new Food(8);
        triceratop = new Triceratop("Charlie", typeOfDinosaur.CARNIVORE, 15);

    }

    @Test
    public void canGetName(){
        assertEquals("Charlie", triceratop.getName());
    }

    @Test
    public void canSetName(){
        triceratop.setName("Banki Moon");
        assertEquals("Banki Moon", triceratop.getName());
    }

    @Test
    public void canGetType(){
        assertEquals(TypeOfDinosaur.CARNIVORE, triceratop.getType());
    }

    @Test
    public void canGetFoodItemsInBelly(){
        triceratop.feedDinosaur(food);
        assertEquals(1, triceratop.getFoodItemsInBelly());
    }

    @Test
    public void canGetBellyCapacity(){
        assertEquals(15, triceratop.getBellyCapacity());
    }

    @Test
    public void checkIfBellyIsEmpty(){
        assertFalse(triceratop.bellyIsFull());
    }

    @Test
    public void checkIfBellyIsFull(){
        for(int i = 0; i < 15; i++){
            triceratop.feedDinosaur(food);
        }
        assertTrue(triceratop.bellyIsFull());
    }

    @Test
    public void checkIFLimitIs10ForBelly(){
        for(int i = 0; i < 17; i++){
            triceratop.feedDinosaur(food);
        }
        assertEquals(15, triceratop.getFoodItemsInBelly());
    }
}
