import animals.Elephant;
import animals.Snake;
import animals.SnowLeopard;
import zookepeer.Zookeeper;

public class Zoo {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();

        Elephant elephant = new Elephant();
        SnowLeopard snowLeopard = new SnowLeopard();
        Snake snake = new Snake();

        System.out.println("----------------------------");
        zookeeper.makeVoice(elephant);
        System.out.println("----------------------------");
        zookeeper.makeVoice(snowLeopard);
        System.out.println("----------------------------");
        zookeeper.makeVoice(snake);
        System.out.println("----------------------------");

        System.out.println("----------------------------");
        zookeeper.makeWalk(elephant);
        System.out.println("----------------------------");
        zookeeper.makeWalk(snowLeopard);
        System.out.println("----------------------------");
        zookeeper.makeWalk(snake);
        System.out.println("----------------------------");

        System.out.println("Информация о животных:");
        System.out.println("----------------------------");
        zookeeper.showInfo(elephant);
        System.out.println();
        zookeeper.showInfo(snowLeopard);
        System.out.println();
        zookeeper.showInfo(snake);
        System.out.println("----------------------------");

        System.out.println("Что кушают животные?");
        System.out.println("----------------------------");
        zookeeper.showEat(elephant);
        System.out.println();
        zookeeper.showEat(snowLeopard);
        System.out.println();
        zookeeper.showEat(snake);
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        zookeeper.showSleep(elephant);
        zookeeper.showSleep(snowLeopard);
        zookeeper.showSleep(snake);

    }
}