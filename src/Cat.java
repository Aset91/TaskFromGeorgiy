public class Cat extends Animal {

    private String name;


    public Cat(String name) {
        this.name = name;
        Counters.catsCounter++;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) throws ActionsException {

        if (distance > 200) {
            throw new ActionsException("Кошка не может пробежать более 200 м");
        }
        if (distance < 0) {
            throw new ActionsException("Задано неверное значение");
        } else {
            System.out.println(name + " пробежал(а) " + distance + " м");
        }
    }


    @Override
    public void swim(int distance) throws ActionsException {
        throw new ActionsException("Кошка не умеет плавать");
    }
}
