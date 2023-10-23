package com.MainRus;

import javax.swing.*;
import java.util.Base64;

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
    public static ImageIcon getImage () {
        String base = "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";
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] bufferedImage = decoder.decode(base);
        return new ImageIcon(bufferedImage);
    }
}