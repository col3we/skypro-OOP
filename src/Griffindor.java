public class Griffindor extends hogwarts {
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

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void showProperties() {
        super.showProperties();
        System.out.println("Ноблесть: " + nobility + ", Честь: " + honor + ", Храбрость: " + bravery);
    }
}