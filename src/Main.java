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

        // Вызываем методы сравнения у объектов
        cedric.compare(justin);       // Пуффендуй
        draco.compare(gregory);       // Слизерин
        ron.compare(potter);           // Гриффиндор
        chang.compare(marcus);         // Когтевран

        potter.compareMagic(draco);
    }
}
