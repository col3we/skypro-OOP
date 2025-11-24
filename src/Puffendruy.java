public class Puffendruy extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffendruy(String name, int magic, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void showProperties() {
        super.showProperties();
        System.out.println("Трудолюбие: " + industriousness + ", Верность: " + loyalty + ", Честность: " + honesty);
    }

    public void compare(Puffendruy other) {
        int sumThis = this.industriousness + this.loyalty + this.honesty;
        int sumOther = other.getIndustriousness() + other.getLoyalty() + other.getHonesty();

        if (sumThis > sumOther) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + this.getName());
        }
    }
}