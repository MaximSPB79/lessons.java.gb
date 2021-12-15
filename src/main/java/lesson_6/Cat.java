package lesson_6;

public class Cat extends Animal {

    public Cat(String animalName, String name, String color, int age) {
        super(animalName, name, color, age);
    }

    public void runAway(int distance) {
        if (distance >= 200) {
            System.out.println("Коты не собаки, так не бегают");
            return;
        }
        System.out.println(animalName + " " + name + " пробежал " + distance + " метров");
    }

    public void sail(int distance) {
        System.out.println("Кошки плавать не умеют");
    }
}
