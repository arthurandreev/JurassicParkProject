import Dinos.*;
import FlyingDinos.*;
import Paddocks.*;

import java.util.concurrent.TimeUnit;


public class Runner {
    public static void main(String[] args) {

        Stegosaurus stegosaurus = new Stegosaurus("Steve", TypeOfDinosaur.Herbivore, 10, 15, "Stegosaurus");
        Pterodactylus pterodactylus = new Pterodactylus ("Luigi", 50, 5, 15, "Pterodactylus");
        Park park = new Park(100);
        HerbivorePaddock herbivorePaddock = new HerbivorePaddock("HerbiePad", 20);
        Visitor visitor = new Visitor("Bob", "Stonemason");

        park.checkInVisitorToPark(visitor);
        park.getWelcomeMessage();
        park.addDinosaurToPaddock(stegosaurus);
        pterodactylus.getName();
        pterodactylus.getSpeed();
        pterodactylus.getAttackValue();
        pterodactylus.attack(stegosaurus);
        pterodactylus.attack(stegosaurus);
        pterodactylus.attack(stegosaurus);
        pterodactylus.attack(stegosaurus);
        park.getGoodbyeMessage();
    }
}
