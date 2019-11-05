public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[] {
                new Cat("Barsik", 5),
                new Cat("Lucy", 3),
                new Cat("Meteor", 15),
        };
        Plate plate = new Plate(15);
        plate.info();
        for (Cat cat: cats) {
            cat.eat(plate);
            cat.info();
            plate.info();
        }
        plate.addFood(10);
        plate.info();
        cats[2].eat(plate);
        cats[2].info();
        plate.info();
    }
}
