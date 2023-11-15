public abstract class AnyAnimal implements Animal {
    @Override
    public void walk() {
        System.out.println("Я животное и умею ходить");
    }
    @Override
    public void eat() {
        System.out.println("Я животное и я люблю кушать");
    }
    @Override
    public void sleep() {
    }
}