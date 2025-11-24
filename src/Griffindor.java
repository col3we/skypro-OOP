public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void showProperties() {
        super.showProperties();
        System.out.println("Ноблесть: " + nobility + ", Честь: " + honor + ", Храбрость: " + bravery);
    }

    public void compare(Griffindor other) {
        int sumThis = this.nobility + this.honor + this.bravery;
        int sumOther = other.getNobility() + other.getHonor() + other.getBravery();

        if (sumThis > sumOther) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Гриффиндорец, чем " + this.getName());
        }
    }
}