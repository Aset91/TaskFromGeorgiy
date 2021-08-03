
public class MainClass {

    public static void main(String[] args) throws ActionsException {

        Cat cat = new Cat("Мурка");
        Dog dog = new Dog("Бобик");

        System.out.println(Animal.animalsCounter);
        System.out.println(Cat.catsCounter);
        System.out.println(Dog.dogsCounter);

        cat.run(150);
        dog.run(400);
        dog.swim(5);
        cat.swim(89);


    }
}