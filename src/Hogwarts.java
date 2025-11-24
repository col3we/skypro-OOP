public class Hogwarts {
    private String name;
    private int magic;
    private int transgression;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    // Метод сравнения магии и трансгрессии с другим студентом
    public void compareMagic(Hogwarts other) {
        int sumThis = this.magic + this.transgression;
        int sumOther = other.magic + other.transgression;

        if (sumThis > sumOther) {
            System.out.println(this.name + " сильнее, чем " + other.name);
        } else if (sumThis < sumOther) {
            System.out.println(other.name + " сильнее, чем " + this.name);
        } else {
            System.out.println(this.name + " и " + other.name + " равны по силе магии и трансгрессии");
        }
    }

    public void showProperties() {
        System.out.println("Имя: " + name + ", Магия: " + magic + ", Трансгрессия: " + transgression);
    }
}