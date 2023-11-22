package zookepeer;

import animals.AnyAnimal;
import Interface.Animal;

public class Zookeeper {

    public void makeVoice(AnyAnimal animal) {
        System.out.println("Я смотритель за животными в зоопарке и сейчас я попрошу рассказать животное о себе:");
        animal.voice();
    }

    public void makeWalk(AnyAnimal animal) {
        System.out.println("Я смотритель за животными и сейчас я попрошу животное пойти погулять");
        animal.walk();
    }

    public void showInfo(Animal animal) {
        animal.info();
    }

    public void showEat(Animal animal) {
        System.out.print("Все животные любят кушать: ");
        animal.eat();
    }
    public void showSleep(Animal animal) {
        System.out.print("Все животные любят спать \n");
        animal.sleep();
    }
}