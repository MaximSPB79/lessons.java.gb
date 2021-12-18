package lesson_7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    private boolean satiety;
    private String name;

    public boolean isSatiety() {
        satiety = false;
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
        System.out.println(name + " сытый, мяяяяу))");
    }

    public Cat(String name, boolean satiety) {
        this.satiety = satiety;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(getCatEatFoodCount());
    }


    public int getCatEatFoodCount() {

        return ThreadLocalRandom.current().nextInt(4) + 3;
    }
}
