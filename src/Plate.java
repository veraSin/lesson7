public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
        if (this.food < 0)
            this.food = 0;
    }
    public boolean decreaseFood(int n) {
        if (n < 1 || n > food)
            return false;
        food -= n;
        return true;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void addFood(int n) {
        if (n < 1)
            return;
        food += n;
    }
}
