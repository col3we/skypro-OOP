public class Main {
    public static void main(String[] args) {
        Griffindor potter = new Griffindor("Гарри Поттер", 23, 3, 5, 10, 20);
        Griffindor hermione = new Griffindor("Гермиона Грейнджер", 12, 32, 52, 20, 30);
        Griffindor ron = new Griffindor("Рон Уизли", 12, 23, 15, 18, 29);

        Slytherin draco = new Slytherin("Драко Малфой", 10, 95, 79, 90, 1, 88, 42);
        Slytherin grehem = new Slytherin("Грэхэм Монтегю", 22, 32, 69, 52, 77, 42, 73);
        Slytherin gregory = new Slytherin("Грегори Гойл", 55, 47, 51, 69, 42, 59, 100);

        Puffendruy zacharias = new Puffendruy("Захария Смит", 12, 27, 1, 20, 42);
        Puffendruy cedric = new Puffendruy("Седрик Диггори", 30, 7, 42, 40, 50);
        Puffendruy justin = new Puffendruy("Джастин Финч-Флетчли", 42, 42, 42, 42, 42);

        Cogtevran chang = new Cogtevran("Чжоу Чанг", 52, 22, 44, 66, 33, 42);
        Cogtevran padma = new Cogtevran("Падма Патил", 95, 88, 77, 66, 100, 42);
        Cogtevran marcus = new Cogtevran("Маркус Белби", 69, 77, 88, 77, 95, 77);

        potter.showProperties();
        hermione.showProperties();
        ron.showProperties();

        draco.showProperties();
        grehem.showProperties();
        gregory.showProperties();

        zacharias.showProperties();
        cedric.showProperties();
        justin.showProperties();

        chang.showProperties();
        padma.showProperties();
        marcus.showProperties();

        comparePuffendruy(cedric, justin);
        compareSlytherin(draco, gregory);
        compareGriffindor(ron, potter);
        compareCogtevran(chang, marcus);

        compareMagic(potter, draco);
    }

    static void compareMagic(hogwarts student1, hogwarts student2) {
        if (student1.getMagic() + student1.getTransgression() > student2.getMagic() + student2.getTransgression()) {
            System.out.println(student1.getName() + " сильнее, чем " + student2.getName());
        } else if (student1.getMagic() + student1.getTransgression() < student2.getMagic() + student2.getTransgression()) {
            System.out.println(student2.getName() + " сильнее, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по силе магии и трансгресии ");
        }
    }

    static void compareGriffindor(Griffindor student1, Griffindor student2) {
        int summ1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int summ2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        if (summ1 > summ2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }
    }

    static void compareCogtevran(Cogtevran student1, Cogtevran student2) {
        int summ1 = student1.getMind() + student1.getWit() + student1.getWisdom() + student1.getCreativity();
        int summ2 = student2.getMind() + student2.getWit() + student2.getWisdom() + student2.getCreativity();
        if (summ1 > summ2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        }
    }

    static void comparePuffendruy(Puffendruy student1, Puffendruy student2) {
        int summ1 = student1.getIndustriousness() + student1.getLoyalty() + student1.getHonesty();
        int summ2 = student2.getIndustriousness() + student2.getLoyalty() + student2.getHonesty();
        if (summ1 > summ2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        }
    }

    static void compareSlytherin(Slytherin student1, Slytherin student2) {
        int summ1 = student1.getTrick() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getDesireForPower();
        int summ2 = student2.getTrick() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getDesireForPower();
        if (summ1 > summ2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        }
    }
}