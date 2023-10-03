public class JOPER {
    private static final String[] joks = {"Штирлиц", "Бармен", "Сталкер", "Боцман", "Моряк", "Негр"};
    private static final String[] act1 = {"Выпил", "Подумал", "Решил", "Вышел", "Купил", "Продал"};
    private static final String[] fin = {"Дверь", "Башмачок", "Негр", "Окно", "Свобода"};
    private static final String[] Prg = {"В", "На", " "};

    public static int random(int max) {
        return (int) Math.floor(Math.random() * max);

    }

    public static String genjok() {
        return (joks[random(6)] + " " +
                act1[random(6)] + " " +
                Prg[random(3)] + " " +
                fin[random(5)]);
    }
    }