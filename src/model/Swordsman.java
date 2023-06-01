package model;

import base.Armor;
import base.Hero;
import base.Weapon;
import model.armory.Cuirass;
import model.weapons.Sword;

public class Swordsman extends Hero {
    public Swordsman(int health, String name, Cuirass cuirass, Sword sword) {
        super(health, name, cuirass, sword);
    }

}
