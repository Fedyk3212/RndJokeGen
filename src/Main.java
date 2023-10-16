import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.Reader;
import java.util.Base64;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        localization localization = new localization();
        Modificator modificator = new Modificator();
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
        frame.add(names);
        names.setVisible(false);
        JTextField namestxf = new JTextField();
        modificator.fw(namestxf);
        modificator.KeyListener(namestxf, names);
        namestxf.setBounds(x, 20, 30, 20);
        frame.add(namestxf);
        namestxf.setVisible(false);
        // поле с действиями
        acts.setBounds(x1, 30, 100, 50);
        frame.add(acts);
        acts.setVisible(false);
        JTextField actstxf = new JTextField();
        actstxf.setBounds(x, 50, 30, 20);
        frame.add(actstxf);
        actstxf.setVisible(false);
        // поле с предлогами
        prdlg.setBounds(x1, 60, 100, 50);
        frame.add(prdlg);
        prdlg.setVisible(false);
        JTextField prdlgtxf = new JTextField();
        prdlgtxf.setBounds(x, 80, 30, 20);
        frame.add(prdlgtxf);
        prdlgtxf.setVisible(false);
        // поле с концовками
        fin.setBounds(x1, 90, 100, 50);
        frame.add(fin);
        fin.setVisible(false);
        JTextField fintxf = new JTextField();
        fintxf.setBounds(x, 110, 30, 20);
        frame.add(fintxf);
        fintxf.setVisible(false);
        // кнопка настроек и её работа
        Icon icon = getImage();
        JButton settings = new JButton(icon);
        frame.add(settings);
        settings.setBounds(190, 0, 30, 30);
        int[] tick = {0};
        settings.addActionListener(e -> {
                    if (tick[0] == 1) {
                        but.setVisible(true);
                        exp.setVisible(true);
                        label.setVisible(true);
                        language.setVisible(true);
                        names.setVisible(false);
                        namestxf.setVisible(false);
                        acts.setVisible(false);
                        actstxf.setVisible(false);
                        prdlg.setVisible(false);
                        prdlgtxf.setVisible(false);
                        fin.setVisible(false);
                        fintxf.setVisible(false);
                        tick[0] = 0;
                        if (check(exp)) {
                            exp.doClick();
                        }
                    } else if (tick[0] == 0) {
                        language.setVisible(false);
                        but.setVisible(false);
                        exp.setVisible(false);
                        but3.setVisible(false);
                        but2.setVisible(false);
                        label.setVisible(false);
                        names.setVisible(true);
                        namestxf.setVisible(true);
                        acts.setVisible(true);
                        actstxf.setVisible(true);
                        prdlg.setVisible(true);
                        prdlgtxf.setVisible(true);
                        fin.setVisible(true);
                        fintxf.setVisible(true);
                        tick[0] = 1;
                    }

                }

        );

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
        boolean check = exp.isEnabled();
        String[] saves = {" ", " ", " "};
        int[] count = {0};
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

    private static ImageIcon getImage() {
        String base = "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";
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] bufferedImage = decoder.decode(base);
        ImageIcon icon = new ImageIcon(bufferedImage);
        return icon;
    }

    public static boolean check(JCheckBox exp) {
        boolean check;
        check = exp.isEnabled();
        return check;
    }

}
