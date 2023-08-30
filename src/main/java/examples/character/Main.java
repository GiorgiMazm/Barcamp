package examples.character;

public class Main {
    public static void main(String[] args) {
        // Create instances of Mage and Warrior with unique name
        // Create clone for each of them
    }
}

abstract class GameCharacter {
    public String name;
    public int health;

    public abstract void attack();

    public abstract GameCharacter clone();
}

class Warrior extends GameCharacter {
    @Override
    public void attack() {

    }

    @Override
    public GameCharacter clone() {
        return null;
    }
    // Implement constructor with name and health, attack and clone methods
}

class Mage extends GameCharacter {
    @Override
    public void attack() {

    }

    @Override
    public Mage clone() {
        return null;
    }
    // Implement constructor with name and health, attack and clone methods
}
