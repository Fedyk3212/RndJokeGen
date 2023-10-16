public class JOPER {
    private static final String[] joks = {"Штирлиц", "Бармен", "Сталкер", "Боцман", "Моряк", "Негр"};
    private static final String[] act1 = {"выпил", "подумал", "решил", "вышел", "купил", "продал"};
    private static final String[] fin = {"дверь", "башмачок", "негр", "окно", "свобода"};
    private static final String[] Prg = {"в", "на", " "};

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