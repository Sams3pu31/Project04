public class Zookeeper {

    void makeVoice(AnyAnimal animal) {
        System.out.println("Я смотритель за животными в зоопарке и сейчас я попрошу рассказать животное о себе:");
        animal.voice();
    }

    void makeWalk(AnyAnimal animal) {
        System.out.println("Я смотритель за животными и сейчас я попрошу животное пойти погулять");
        animal.walk();
    }

    void showInfo(Animal animal) {
        animal.info();
    }

    void showEat(Animal animal) {
        System.out.print("Все животные любят кушать: ");
        animal.eat();
    }
    void showSleep(Animal animal) {
        System.out.print("Все животные любят спать \n");
        animal.sleep();
    }
}