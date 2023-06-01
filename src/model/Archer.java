package model;

import base.Armor;
import base.Hero;
import base.Weapon;
import model.armory.LeatherArmor;
import model.weapons.Bow;

public class Archer extends Hero {
    public Archer(int health, String name, LeatherArmor armor, Bow longBow) {
        super(health, name, armor, longBow);
    }

}
