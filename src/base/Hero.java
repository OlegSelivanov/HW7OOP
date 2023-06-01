package base;

import model.weapons.Hands;

import java.util.Map;
import java.util.Random;

public abstract class Hero implements Attack{
private int health;
private String name;
private Weapon wp = new Hands();
private Armor armor;

    public Hero(int health, String name,Armor armor, Weapon weapon) {
        this.health = health;
        this.name = name;
        this.wp=weapon;
        this.armor=armor;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int setDamage(int damage){
        int damagemultiplier= damage/(damage/armor.getArmorPoints());
        damage*=damagemultiplier;
        return damage;
    }

    @Override
    public void attack(Hero target) {
        var rd = new Random();
        while (health>=0){
           health =  (target.getHealth() - target.setDamage(rd.nextInt(1, wp.getDamage())));
            System.out.println("Цель " + name + " получила урон " + target.setDamage(rd.nextInt(1, wp.getDamage())) + " осталось " + health);
        }
    }
}
