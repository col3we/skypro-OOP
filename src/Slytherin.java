public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int desireForPower;

    public Slytherin(String name, int magic, int transgression, int trick, int determination, int ambition,
                     int resourcefulness, int desireForPower) {
        super(name, magic, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desireForPower = desireForPower;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getDesireForPower() {
        return desireForPower;
    }

    public void showProperties() {
        super.showProperties();
        System.out.println("Хитрость: " + trick + ", Решительность: " + determination + ", Амбициозность: " + ambition +
                ", Находчивость: " + resourcefulness + ", Жажда власти: " + desireForPower);
    }

    public void compare(Slytherin other) {
        int sumThis = this.trick + this.determination + this.ambition + this.resourcefulness + this.desireForPower;
        int sumOther = other.getTrick() + other.getDetermination() + other.getAmbition() + other.getResourcefulness() +
                other.getDesireForPower();

        if (sumThis > sumOther) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Слизеринец, чем " + this.getName());
        }
    }
}