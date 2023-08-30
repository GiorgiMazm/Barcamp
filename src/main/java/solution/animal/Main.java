package solution.animal;

abstract class CloneableAnimal {
    public abstract CloneableAnimal clone();

    public abstract void makeSound();

    public int age;
}

class Cat extends CloneableAnimal {
    public Cat(int catAge) {
        this.age = catAge;
    }

    @Override
    public CloneableAnimal clone() {
        return new Cat(this.age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Dog extends CloneableAnimal {
    public Dog(int dogAge) {
        this.age = dogAge;
    }

    @Override
    public CloneableAnimal clone() {
        return new Dog(this.age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Bird extends CloneableAnimal {
    public Bird(int birdAge) {
        this.age = birdAge;
    }

    @Override
    public CloneableAnimal clone() {
        return new Bird(this.age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }
}

public class Main {
    public static void main(String[] args) {
        CloneableAnimal cat = new Cat(4);
        CloneableAnimal clonedCat = cat.clone();
        System.out.println(cat.age);
        System.out.println(clonedCat.age);
        cat.makeSound(); // Meow!
        clonedCat.makeSound(); // Meow!

        CloneableAnimal dog = new Dog(8);
        CloneableAnimal clonedDog = dog.clone();
        System.out.println(dog.age);
        System.out.println(clonedDog.age);
        dog.makeSound(); // Woof!
        clonedDog.makeSound(); // Woof!

        CloneableAnimal bird = new Bird(2);
        CloneableAnimal clonedBird = bird.clone();
        System.out.println(bird.age);
        System.out.println(clonedBird.age);
        bird.makeSound(); // Chirp!
        clonedBird.makeSound(); // Chirp!

    }
}
