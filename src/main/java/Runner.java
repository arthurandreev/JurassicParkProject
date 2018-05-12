import Dinos.*;
import FlyingDinos.*;
import Paddocks.*;

import java.util.concurrent.TimeUnit;

//runner class
public class Runner {
    public static void main(String[] args) {
        Food meat = new Food(FoodType.ANIMALS);
        Food veggie = new Food(FoodType.PLANTS);
        HerbieDino herbieDino = new HerbieDino("Steve", TypeOfDinosaur.Herbivore, 10, 15, 10, DinoList.Tyrannosaurus);
        Pterodactylus pterodactylus = new Pterodactylus ("Luigi", 50, 5, 15, "Pterodactylus");
        Park park = new Park(100);
        HerbivorePaddock herbivorePaddock = new HerbivorePaddock("HerbiePad", 20);
        Visitor visitor = new Visitor("Bob", "Stonemason");

        park.checkInVisitorToPark(visitor);
        park.getWelcomeMessage();
        park.addDinosaurToPaddock(herbieDino);
        pterodactylus.getName();
        pterodactylus.getSpeed();
        pterodactylus.getAttackValue();
        pterodactylus.attack(herbieDino);
        pterodactylus.attack(herbieDino);
        pterodactylus.attack(herbieDino);
        pterodactylus.attack(herbieDino);
        park.getGoodbyeMessage();
    }
}
