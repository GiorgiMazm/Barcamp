package solution.character;

public class Main {
    public static void main(String[] args) {
        Mage gandalf = new Mage("Gandalf", 80);
        gandalf.attack();
        Mage mageClone = gandalf.clone();
        mageClone.attack();
        System.out.println(gandalf.health);
        System.out.println(mageClone.health);

        Warrior warGod = new Warrior("Kratos", 100);
        warGod.attack();
        Warrior warriorClone = warGod.clone();
        warriorClone.attack();
        System.out.println(warGod.health);
        System.out.println(warriorClone.health);

    }
}

abstract class GameCharacter {
    public int health;
    public String name;

    public abstract void attack();

    public abstract GameCharacter clone();
}

class Warrior extends GameCharacter {
    public Warrior(String name, int characterHealth) {
        this.name = name;
        this.health = characterHealth;
    }

    @Override
    public void attack() {
        System.out.println("Warrior " + this.name + " attacks with a sword!");
    }

    @Override
    public Warrior clone() {
        return new Warrior(this.name, this.health);
    }
}

class Mage extends GameCharacter {
    public Mage(String name, int characterHealth) {
        this.name = name;
        this.health = characterHealth;
    }

    @Override
    public void attack() {
        System.out.println("Mage " + this.name + " casts a fireball!");
    }

    @Override
    public Mage clone() {
        return new Mage(this.name, this.health);
    }
}
