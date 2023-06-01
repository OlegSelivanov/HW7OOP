package model;

import base.Hero;
import base.Weapon;
import model.armory.Shirt;
import model.weapons.Hands;

public class Peasant extends Hero {

    public Peasant(int health, String name, Shirt robe, Hands fists) {
        super(health, name,robe,fists);
    }

}

