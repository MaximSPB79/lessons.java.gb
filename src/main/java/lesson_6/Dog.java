package lesson_6;

public class Dog extends Animal {

    public Dog(String animalName, String name, String color, int age) {
        super(animalName, name, color, age);
    }

    public void runAway(int distance) {
        if (distance >= 500) {
            System.out.println("Это выше моих сил");
            return;
        }
        System.out.println(animalName + " " + name + " пробежала " + distance + " метров");
    }

    public void sail(int distance) {
        if (distance >= 10) {
            System.out.println("И даже собаке это не под силу");
            return;
        }
        System.out.println(animalName + " " + name + " проплыла " + distance + " метров");
    }
}
