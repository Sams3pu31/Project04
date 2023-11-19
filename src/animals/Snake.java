package animals;

public class Snake extends AnyAnimal {
    @Override
    public void voice() {
        System.out.println("Я змейка, и я говорю SSSAYA HASSI EFF");
    }

    @Override
    public void walk() {
        System.out.println("Я змейка, я ползаю везде, где захочу!");
    }
    @Override
    public void info() {
        System.out.println("Это змея");
    }

    @Override
    public void eat() {
        System.out.println("Я змейка, и я люблю кушать мышек");
    }

}

