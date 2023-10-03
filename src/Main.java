import org.w3c.dom.css.Counter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main {

    public static void main(String[] args) {
        String msg = """
                Данное приложение может вызвать;
                1-Приступы кринжа
                2-Полной или частичной потере юмора
                3-Переполнение памяти на 2323121%
                4-Поломку видеокарты и реестра через АНАЛ""";
        JFrame frame = new JFrame("JoPES GEN");
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        //дисклеймер
        JOptionPane.showMessageDialog(frame, msg, "Дисклеймер", JOptionPane.INFORMATION_MESSAGE);
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
        exp.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                int stateChange = e.getStateChange();
                switch (stateChange) {
                    case 2 -> but2.setVisible(false);
                    case 1 -> but2.setVisible(true);
                }
                switch (stateChange) {
                    case 2 -> but3.setVisible(false);
                    case 1 -> but3.setVisible(true);
                }
            }
        });

        String[] saves = { " ", " ", " " };
        int[] count = { 0 };
        but2.addActionListener(e -> {
            int fCount = count[0];
            if (fCount == 3) {
                saves[0] = " ";
                saves[1] = " ";
                saves[2] = " ";
                count[0] = 0;
            }
            saves[count[0]] = label.getText();
            count[0] = count[0] + 1;
        });
        but3.addActionListener(e -> JOptionPane.showMessageDialog(frame, saves[0] + """
                                
                """ + saves[1] + """
                                
                """ + saves[2]));


    }

}