package animals;

public class SnowLeopard extends AnyAnimal {
    @Override
    public void voice() {
        System.out.println("Я Барс и я могу сказать Мауррр");
    }

    @Override
    public void walk() {
        System.out.println("Я Барс, я умею не только передвигаться по земле, но еще и лазаю по скалам");
    }

    @Override
    public void info() {
        System.out.println("Это Барс");
    }

    @Override
    public void eat() {
        System.out.println("Я грозный снежный барс! Я люблю покушать, но для этого мне нужно охотиться");
    }

}