package examples;

public class Main {
    public static void main(String[] args) {
        // Create instances of Mage and Warrior with unique name
        // Create clone for each of them
    }
}

abstract class GameCharacter {
    protected String name;
    protected int health;

    public abstract void attack();

    public abstract GameCharacter clone();
}

 class Warrior extends GameCharacter {
    private String name;
    @Override
    public void attack() {

    }

    @Override
    public GameCharacter clone() {
        return null;
    }
     // Implement constructor with name, attributes, attack and clone methods
}

 class Mage extends GameCharacter {

    private String name;
    @Override
    public void attack() {

    }

    @Override
    public Mage clone() {
        return null;
    }
    // Implement constructor with name, attributes, attack and clone methods
}
