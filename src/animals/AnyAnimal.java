package animals;

import Interface.Animal;

public abstract class AnyAnimal implements Animal {

    public void walk() {
        System.out.println("Я животное и умею ходить");
    }
    public void eat() {
        System.out.println("Я животное и я люблю кушать");
    }
    public void sleep() {
    }
}