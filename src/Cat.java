public class Cat {
    private String name;
    private int appetite;
    private boolean full;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }
    public void eat(Plate p) {
        full = p.decreaseFood(appetite);
    }
    public void info() {
        System.out.println("Cat " + name + " is " + ( full ? "full" : "hungry"));
    }
}
