package solution.character;

public class Main {
    public static void main(String[] args) {

        Mage gandalf = new Mage("Gandalf");
        gandalf.attack();
        Mage mageClone = gandalf.clone();
        mageClone.attack();


        Warrior warGod = new Warrior("Kratos");
        warGod.attack();
        Warrior warriorClone = warGod.clone();
        warriorClone.attack();

    }
}

abstract class GameCharacter {
    protected int health;

    public abstract void attack();

    public abstract GameCharacter clone();
}

class Warrior extends GameCharacter {
    public Warrior(String name) {
        this.name = name;
        health = 100;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("Warrior " + this.name + " attacks with a sword!");
    }

    @Override
    public Warrior clone() {
        return new Warrior(this.name);
    }
}

class Mage extends GameCharacter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mage(String name) {
        this.name = name;
        health = 80;
    }

    @Override
    public void attack() {
        System.out.println("Mage " + this.name + " casts a fireball!");
    }

    @Override
    public Mage clone() {
        return new Mage(this.name);
    }
}
