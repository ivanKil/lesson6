public class Les6 {

    public static void main(String[] args) {
        new Animal("Животное 1");
        new Animal("Животное 2");
        new Animal("Животное 3");
        new Animal("Животное 4");

        Dog dog1 = new Dog("Шарик");
        new Dog("Тузик");
        new Dog("Рэкс");
        new Dog("Мухтар");

        Cat cat1 = new Cat("Васька");
        new Cat("Мурзик");
        new Cat("Феликс");
        new Cat("Васька2");
        new Cat("Васька3");

        System.out.println("Создано животных Animal и всех наследников: " + Animal.getCountCreatedAnimalAndChilds());
        System.out.println("Создано животных Animal: " + Animal.getCountCreatedAnimal(Animal.class.getName()));
        System.out.println("Создано собак: " + Animal.getCountCreatedAnimal(Dog.class.getName()));
        System.out.println("Создано кошек: " + Animal.getCountCreatedAnimal(Cat.class.getName()) + "\n");

        cat1.run(2000);
        cat1.run(199);
        cat1.swim(2);

        dog1.run(600);
        dog1.run(499);
        dog1.swim(30);
        dog1.swim(2);

    }
}

