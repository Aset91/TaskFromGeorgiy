public abstract class Animal {

    public Animal() {
        Counters.animalsCounter++;
    }

    public abstract void run(int distance) throws ActionsException;

    public abstract void swim(int distance) throws ActionsException;

}
