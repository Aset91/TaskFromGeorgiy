
public class MainClass {

    public static void main(String[] args) throws ActionsException {

        Cat cat = new Cat("Мурка");
        Dog dog = new Dog("Бобик");

        System.out.println(Counters.animalsCounter);
        System.out.println(Counters.catsCounter);
        System.out.println(Counters.dogsCounter);


        cat.run(-150);
        dog.run(400);
        dog.swim(5);
        cat.swim(89);


    }
}