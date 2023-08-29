package solution.animal;

// CloneableAnimal interface
interface CloneableAnimal {
    CloneableAnimal clone();
    void makeSound();
}

// Cat class
class Cat implements CloneableAnimal {
    @Override
    public CloneableAnimal clone() {
        return new Cat();
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Dog class
class Dog implements CloneableAnimal {
    @Override
    public CloneableAnimal clone() {
        return new Dog();
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Bird class
class Bird implements CloneableAnimal {
    @Override
    public CloneableAnimal clone() {
        return new Bird();
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }
}

public class Main {
    public static void main(String[] args) {
        CloneableAnimal cat = new Cat();
        CloneableAnimal clonedCat = cat.clone();

        CloneableAnimal dog = new Dog();
        CloneableAnimal clonedDog = dog.clone();

        CloneableAnimal bird = new Bird();
        CloneableAnimal clonedBird = bird.clone();

        cat.makeSound(); // Meow!
        clonedCat.makeSound(); // Meow!

        dog.makeSound(); // Woof!
        clonedDog.makeSound(); // Woof!

        bird.makeSound(); // Chirp!
        clonedBird.makeSound(); // Chirp!
    }
}
