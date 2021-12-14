package lesson_6;

public class Animal {

    private static int animalCount = 0;

    String animalName;
    String name;
    String color;
    public int age;


    public Animal(String animalName, String name, String color, int age) {
        this.animalName = animalName;
        this.name = name;
        this.color = color;
        this.age = age;

        animalCount++;

    }

    public void info() {
        if (age <= 1) {
            System.out.println(animalName + " " + name + ", " + color + " " + age + " год.");
        } else if (age <= 4) {
            System.out.println(animalName + " " + name + ", " + color + " " + age + " годa.");
        } else {
            System.out.println(animalName + " " + name + ", " + color + " " + age + " лет.");
        }
    }

    public void runAway(int distance) {
        System.out.println(animalName + " " + name + " пробежал " + distance + " метров");
    }

    public void sail(int distance) {
        System.out.println(animalName + " " + name + "проплыл" + distance + " метров.");

    }

    public static void main(String[] args) {
        Animal cat1 = new Cat("Koт", "Муська", "серый", 4);
        Animal cat2 = new Cat("Кот", "Барсик", "рыжий", 2);
        Animal cat3 = new Cat("Кот", "Васька", "черный", 1);
        Animal dog1 = new Dog("Собака", "K9", "серая", 6);
        Animal dog2 = new Dog("Собака", "Стрелка", "полосатая", 3);
        Animal dog3 = new Dog("Собака", "Белка", "полосатая", 3);


        allActions(cat1, 150, 60);
        allActions(cat2, 200, 5);
        allActions(cat3, 45, 21);
        allActions(dog1, 600, 5);
        allActions(dog2, 350, 15);
        allActions(dog3, 50, 3);

        Animal.countingAnimals();

    }

    private static void allActions(Animal animalName, int distanceRunAway, int distanceSail) {
        animalName.info();
        animalName.runAway(distanceRunAway);
        animalName.sail(distanceSail);
        System.out.println();
    }

    public static void countingAnimals() {
        System.out.println("\nКолличество всех животных: " + animalCount);

    }
}
