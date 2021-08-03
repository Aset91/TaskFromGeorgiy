public class Dog extends Animal {
    public String name;
    public static int dogsCounter;

    public Dog(String name) {
        this.name = name;
        dogsCounter++;
    }

    @Override
    public void run(int distance) throws ActionsException {
        if (distance > 500) {
            throw new ActionsException("Собака не может пробежать более 500 м");
        } else {
            System.out.println(name + " пробежал(а) " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) throws ActionsException {
        if (distance > 10) {
            throw new ActionsException("Собака не может проплыть более 10 м");
        } else {
            System.out.println(name + " проплыл(а) " + distance + " м");
        }
    }
}


