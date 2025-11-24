public class Cogtevran extends Hogwarts {
    private int mind;
    private int wit;
    private int wisdom;
    private int creativity;

    public Cogtevran(String name, int magic, int transgression, int mind, int wit, int wisdom, int creativity) {
        super(name, magic, transgression);
        this.mind = mind;
        this.wit = wit;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWit() {
        return wit;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void showProperties() {
        super.showProperties();
        System.out.println("Ум: " + mind + ", Мудрость: " + wisdom + ", Острота ума: " + wit + ", Творчество: " + creativity);
    }

    public void compare(Cogtevran other) {
        int sumThis = this.mind + this.wit + this.wisdom + this.creativity;
        int sumOther = other.getMind() + other.getWit() + other.getWisdom() + other.getCreativity();

        if (sumThis > sumOther) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + this.getName());
        }
    }
}