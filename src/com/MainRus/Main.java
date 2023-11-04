package com.MainRus;

import com.Eng_loc.localization;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {

    public static void main(String[] args) throws IOException {
        localization localization = new localization();
        String msg = String.join("\n",
                "Данное приложение может вызвать;",
                "1-Приступы кринжа",
                "2-Полной или частичной потере юмора",
                "3-Переполнение памяти на 2323121%",
                "4-Поломку видеокарты и реестра через АНАЛ;");

        JFrame frame = new JFrame("JoKes GEN");
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setUndecorated(true);
        frame.setVisible(true);
        JFrame optionsframe = new JFrame("options");
        frame.setLocationRelativeTo(null);
        // раика настроект
        optionsframe.setLocation(frame.getLocation());
        optionsframe.setSize(frame.getSize());
        optionsframe.setLayout(null);
        optionsframe.setVisible(false);
        JOptionPane.showMessageDialog(frame, msg, "Дисклеймер", JOptionPane.INFORMATION_MESSAGE);
        optionsframe.setUndecorated(true);
        optionsframe.getContentPane().setBackground(Color.BLUE);
        //оптимизация кнопки локализации
        JRadioButton language = new JRadioButton("set language English");
        language.setForeground(Color.WHITE);
        language.setBounds(20, 125, 200, 30);
        optionsframe.add(language);
        language.setVisible(true);
        language.setBorderPainted(false);
        language.setContentAreaFilled(false);
        // то во что записывается "шутка"
        JLabel label = new JLabel();
        label.setBounds(105, 90, 300, 30);
        frame.add(label);
        label.setVisible(true);
        label.setFont(new Font("Dialog", Font.PLAIN, 18));
        label.setForeground(Color.BLUE);
        // кнопка активации шутки
        JButton but = new JButton("Типо шутка", JOPER.getImage3());
        frame.add(but);
        but.setBounds(150,110,100,100);
        but.addActionListener(e -> label.setText(JOPER.genjok()));
        but.setBorderPainted(false);
        but.setContentAreaFilled(false);
        // эксперементальная новая кнопка
        JButton but2 = new JButton(null, JOPER.getImage2());
        frame.add(but2);
        but2.setVisible(true);
        but2.setBounds(0, 0, 25, 25);
        but2.setBorder(null);
        but2.setBorderPainted(false);
        but2.setContentAreaFilled(false);
        // эксперементальная кнопка два
        JButton but3 = new JButton(null, JOPER.getImage5());
        frame.add(but3);
        but3.setVisible(true);
        but3.setBounds(25, 0, 25, 25);
        but3.setBorderPainted(false);
        but3.setContentAreaFilled(false);
        // кнопка локализзации
        language.setVisible(true);
        // новые поля
        int x = 160;
        int x1 = 25;
        JLabel names = new JLabel("Добавить имя(не работает)");
        names.setForeground(Color.WHITE);
        JLabel acts = new JLabel("Добавить действие(не работает)");
        acts.setForeground(Color.WHITE);
        JLabel prdlg = new JLabel("Добавить союз(не работает)");
        prdlg.setForeground(Color.WHITE);
        JLabel fin = new JLabel("Добавить конец(не работает)");
        fin.setForeground(Color.WHITE);
        // поле с именами
        names.setBounds(x1, 0, 130, 50);
        optionsframe.add(names);
        names.setVisible(true);
        JTextField namestxf = new JTextField();
        namestxf.setBounds(x, 20, 30, 20);
        optionsframe.add(namestxf);
        namestxf.setVisible(false);
        // поле с действиями
        acts.setBounds(x1, 30, 130, 50);
        optionsframe.add(acts);
        acts.setVisible(true);
        JTextField actstxf = new JTextField();
        actstxf.setBounds(x, 50, 30, 20);
        optionsframe.add(actstxf);
        actstxf.setVisible(false);
        // поле с предлогами
        prdlg.setBounds(x1, 60, 130, 50);
        optionsframe.add(prdlg);
        prdlg.setVisible(true);
        JTextField prdlgtxf = new JTextField();
        prdlgtxf.setBounds(x, 80, 30, 20);
        optionsframe.add(prdlgtxf);
        prdlgtxf.setVisible(false);
        // поле с концовками
        fin.setBounds(x1, 90, 130, 50);
        optionsframe.add(fin);
        fin.setVisible(true);
        JTextField fintxf = new JTextField();
        fintxf.setBounds(x, 110, 30, 20);
        optionsframe.add(fintxf);
        fintxf.setVisible(false);
        // кнопка выхода
        JButton exit = new JButton(null, JOPER.getImage4());
        frame.add(exit);
        exit.setVisible(true);
        exit.setBounds(370, 0, 30, 30);
        exit.setContentAreaFilled(false);
        exit.setBorderPainted(false);
        exit.addActionListener(e-> System.exit(0));
        localization.butwork(but, frame, label, language, names, acts, prdlg, fin);
        // кнопка настроек и её работа
        Icon icon = JOPER.getImage();
        JButton settings = new JButton(icon);
        frame.add(settings);
        settings.setBounds(340, 0, 30, 30);
        settings.setBorderPainted(false);
        settings.setContentAreaFilled(false);
        int[] tick = {0};
        settings.addActionListener(e -> {
                    if (tick[0] == 0) {
                        frame.setVisible(false);
                        optionsframe.setVisible(true);
                        optionsframe.add(settings);
                        optionsframe.add(exit);
                        tick[0] = 1;
                    } else if (tick[0] == 1) {
                        frame.setVisible(true);
                        optionsframe.setVisible(false);
                        frame.add(settings);
                        frame.add(exit);
                        tick[0] = 0;
                    }
                }
        );
        String[] saves = {" ", " ", " "};
        int[] count = {0};
        but2.addActionListener(e -> {
            int fCount = count[0];
            if (fCount == 3) {
                saves[0] = "";
                saves[1] = "";
                saves[2] = "";
                count[0] = 0;
            }
            saves[count[0]] = label.getText();
            count[0] = count[0] + 1;
        });
        but3.addActionListener(e -> JOptionPane.showMessageDialog(frame, String.join("\n", saves[0], saves[1], saves[2])));
    }
}



