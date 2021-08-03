public class Dog extends Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
        Counters.dogsCounter++;
    }

    public String getName() {
        return name;
    }


    @Override
    public void run(int distance) {
        if (distance < 0) {
            throw new ActionsException("Задано неверное значение");
        }
        if (distance > 500) {
            throw new ActionsException("Собака не может пробежать более 500 м");
        } else {
            System.out.println(name + " пробежал(а) " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance < 0) {
            throw new ActionsException("Задано неверное значение");
        }
        if (distance > 10) {
            throw new ActionsException("Собака не может проплыть более 10 м");
        } else {
            System.out.println(name + " проплыл(а) " + distance + " м");
        }
    }
}


