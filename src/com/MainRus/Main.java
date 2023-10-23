package com.MainRus;

import com.Eng_loc.localization;

import javax.swing.*;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        localization localization = new localization();
        String msg = String.join("\n",
                "Данное приложение может вызвать;",
                "1-Приступы кринжа",
                "2-Полной или частичной потере юмора",
                "3-Переполнение памяти на 2323121%",
                "4-Поломку видеокарты и реестра через АНАЛ;");


        JFrame frame = new JFrame("JoKes GEN");
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        JFrame optionsframe = new JFrame("options");
        optionsframe.setSize(frame.getSize());
        optionsframe.setLayout(null);
        optionsframe.setVisible(false);
        JOptionPane.showMessageDialog(frame, msg, "Дисклеймер", JOptionPane.INFORMATION_MESSAGE);
        //оптимизация кнопки локализации
        JRadioButton language = new JRadioButton("set language English");
        language.setBounds(25, 200, 200, 30);
        frame.add(language);
        language.setVisible(false);
        // то во что записывается "шутка"
        JLabel label = new JLabel();
        label.setBounds(50, 100, 200, 30);
        frame.add(label);
        label.setVisible(true);
        // кнопка активации шутки
        JButton but = new JButton("Типо шутка");
        frame.add(but);
        but.setBounds(25, 125, 200, 30);
        but.addActionListener(e -> label.setText(JOPER.genjok()));
        // чек бокс эксперементальных функций
        JCheckBox exp = new JCheckBox("Эксперементальные функции");
        frame.add(exp);
        exp.setBounds(25, 175, 210, 30);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // эксперементальная новая кнопка
        JButton but2 = new JButton("Сохранить");
        but2.setBounds(25, 35, 100, 30);
        frame.add(but2);
        but2.setVisible(false);
        // эксперементальная кнопка два
        JButton but3 = new JButton("Посмотреть сохр");
        but3.setBounds(25, 75, 100, 30);
        frame.add(but3);
        but3.setVisible(false);
        // кнопка локализзации
        language.setVisible(true);
        localization.butwork(language, but, but2, but3, frame, label);
        // новые поля
        int x = 130;
        int x1 = 25;
        JLabel names = new JLabel("Добавить имя");
        JLabel acts = new JLabel("Добавить действие");
        JLabel prdlg = new JLabel("Добавить союз");
        JLabel fin = new JLabel("Добавить конец");
        // поле с именами
        names.setBounds(x1, 0, 100, 50);
        optionsframe.add(names);
        names.setVisible(true);
        JTextField namestxf = new JTextField();
        namestxf.setBounds(x, 20, 30, 20);
        optionsframe.add(namestxf);
        namestxf.setVisible(true);
        // поле с действиями
        acts.setBounds(x1, 30, 100, 50);
        optionsframe.add(acts);
        acts.setVisible(true);
        JTextField actstxf = new JTextField();
        actstxf.setBounds(x, 50, 30, 20);
        optionsframe.add(actstxf);
        actstxf.setVisible(true);
        // поле с предлогами
        prdlg.setBounds(x1, 60, 100, 50);
        optionsframe.add(prdlg);
        prdlg.setVisible(true);
        JTextField prdlgtxf = new JTextField();
        prdlgtxf.setBounds(x, 80, 30, 20);
        optionsframe.add(prdlgtxf);
        prdlgtxf.setVisible(true);
        // поле с концовками
        fin.setBounds(x1, 90, 100, 50);
        optionsframe.add(fin);
        fin.setVisible(true);
        JTextField fintxf = new JTextField();
        fintxf.setBounds(x, 110, 30, 20);
        optionsframe.add(fintxf);
        fintxf.setVisible(true);
        // инициализациия для читателя и записывателя

        // кнопка настроек и её работа
        Icon icon = JOPER.getImage();
        JButton settings = new JButton(icon);
        frame.add(settings);
        settings.setBounds(190, 0, 30, 30);
        int[] tick = {0};
        settings.addActionListener(e -> {
                    if (tick[0] == 0) {
                        frame.setVisible(false);
                        optionsframe.setVisible(true);
                        optionsframe.add(settings);
                        tick[0] = 1;
                    } else if (tick[0] == 1) {
                        frame.setVisible(true);
                        optionsframe.setVisible(false);
                        frame.add(settings);
                        tick[0] = 0;
                    }
                }
        );

        exp.addItemListener(e -> {
            int stateChange = e.getStateChange();
            switch (stateChange) {
                case 2:
                    but2.setVisible(false);
                    break;
                case 1:
                    but2.setVisible(true);
                    break;
            }
            switch (stateChange) {
                case 2:
                    but3.setVisible(false);
                    break;
                case 1:
                    but3.setVisible(true);
                    break;
            }
        });
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

