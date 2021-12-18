package lesson_7;

public class Feeding {
    public static void main(String[] args) throws InterruptedException {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Jack", false);
        cat[1] = new Cat("Жук", false);
        cat[2] = new Cat("Мокрушник", false);


        Plate plate = new Plate(50);

        plate.printInfo();

        while (plate.getFoodCount() > 0) {
            catsEat(cat, plate); // кормим свору котов
        }
        System.out.println("Eды не хватит, у котиков сильный аппетит");
        plate.setFoodCount(150);
        plate.printInfo();
    }

    public static void catsEat(Cat[] cat, Plate plate) throws InterruptedException {
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            cat[i].setSatiety(true);
               Thread.sleep(2000); // это так, для реалистичности действий, а то котики проглодатся не успевают))
            System.out.println(cat[i].isSatiety() + " " + cat[i].getName() + " Снова хочется кушать");
                Thread.sleep(2000);
            if (plate.getFoodCount() < cat[i].getCatEatFoodCount())
                break;
            plate.printInfo();
        }
    }
}
