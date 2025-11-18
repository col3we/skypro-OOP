public class Cogtevran extends hogwarts {
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

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void showProperties() {
        super.showProperties();
        System.out.println("Ум: " + mind + ", Мудрость: " + wisdom + ", Острота ума: " + wit + ", Творчество: " + creativity);
    }

}