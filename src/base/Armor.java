package base;

public class Armor {
    public Armor(String name, int armorPoints) {
        this.name = name;
        this.armorPoints = armorPoints;
    }

    public String getName() {
        return name;
    }

    public int getArmorPoints() {
        return armorPoints;
    }

    private String name;
    private int armorPoints;
}
