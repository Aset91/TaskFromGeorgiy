public abstract class Animal {

    public Animal() {
        Counters.animalsCounter++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

}
