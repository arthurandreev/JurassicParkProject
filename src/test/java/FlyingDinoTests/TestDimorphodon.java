package FlyingDinoTests;

import Dinos.Spinosaurus;
import Dinos.TypeOfDinosaur;
import FlyingDinos.Dimorphodon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestDimorphodon {
    Dimorphodon dimorphodon;
    TypeOfDinosaur typeOfDinosaur;
    Spinosaurus spinosaurus;

    @Before
    public void before() {
        dimorphodon = new Dimorphodon("Lost Soul", 50, 5, 50, "Dimorphodon");
    }

    @Test
    public void canGetName() {
        assertEquals("Lost Soul", dimorphodon.getName());
    }

    @Test
    public void canGetSpeed() {
        assertEquals(50, dimorphodon.getSpeed());
    }

    @Test
    public void canGetAttack() {
        assertEquals(5, dimorphodon.getAttackValue());
    }

    @Test
    public void canGetWingSpan() {
        assertEquals(50, dimorphodon.getWingSpan());
    }
}