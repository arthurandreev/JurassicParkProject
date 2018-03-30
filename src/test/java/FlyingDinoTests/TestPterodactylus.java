package FlyingDinoTests;

import Dinos.Stegosaurus;
import Dinos.TypeOfDinosaur;
import FlyingDinos.Pterodactylus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPterodactylus {
    Pterodactylus pterodactylus;
    TypeOfDinosaur typeOfDinosaur;
    Stegosaurus stegosaurus;

    @Before
    public void before(){
        pterodactylus = new Pterodactylus("Bobby", 50, 10, 30, "pterodactylus");
    }

    @Test
    public void canGetName() {
        assertEquals("Bobby", pterodactylus.getName());
    }

    @Test
    public void canGetSpeed() {
        assertEquals(50, pterodactylus.getSpeed());
    }

    @Test
    public void canGetAttack() {
        assertEquals(10, pterodactylus.getAttackValue());
    }

    @Test
    public void canGetWingSpan() {
        assertEquals(30, pterodactylus.getWingSpan());
    }


}
