public class Cat extends Animal {

    public String name;
    public static int catsCounter;

    public Cat(String name) {
        this.name = name;
        catsCounter++;
    }

    @Override
    public void run(int distance) throws ActionsException {

        if (distance > 200) {
            throw new ActionsException("Кошка не может пробежать более 200 м");
        } else {
            System.out.println(name + " пробежал(а) " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) throws ActionsException {
        throw new ActionsException("Кошка не умеет плавать");
    }
}
