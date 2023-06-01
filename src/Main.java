import model.Swordsman;
import model.armory.Cuirass;
import model.weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Swordsman firstCharacter = new Swordsman(120,"Ланселот",new Cuirass("Панцирь",6),new Sword(45,"Одноручный меч"));
        Swordsman secondCharacter = new Swordsman(130,"Уильям",new Cuirass("Кираса",3),new Sword(50,"Двуручный меч"));
        firstCharacter.attack(secondCharacter);
        secondCharacter.attack(firstCharacter);
    }
}