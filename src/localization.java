import javax.swing.*;

public class localization extends Main {
    private static final String[] joks1eng = {"Stirlitz", "Barthender", "Stalker", "Boatswain","Sailor"};
    private static final String[] engact = {"drank", "thought", "decided", "came out", "bought", "sold"};
    private static final String[] engprg = {"in", "on", " "};
    private static final String[] engfin =  {"door", "boots", "window", "freedom"};
    public Object locbut;


        public static int random(int max) {
        return (int) Math.floor(Math.random() * max);

    }
    public static String loclazdJoke() {
        return (joks1eng[random(5)] + " " +
                engact[random(6)] + " " +
                engprg[random(3)] + " " +
                engfin[random(4)]);
    }
    public void butwork(JRadioButton language, JButton but, JButton but2, JButton but3, JFrame frame, JLabel label){
        JButton locbut = new JButton("Gen Joke");
        frame.add(locbut);
        locbut.setBounds(25, 125, 200, 30);
        locbut.addActionListener(e -> label.setText(loclazdJoke()));
        locbut.setVisible(false);
        language.addItemListener(e -> {
            int state = e.getStateChange();
            if (state == 1){
                but.setText("Gen Joke");
                but2.setText("Save");
                but3.setText("Saved jok");
                but.setVisible(false);
                locbut.setVisible(true);

            }
            else if (state == 2){
                but.setText("Типо Шутка");
                but2.setText("Сохранить");
                but3.setText("Посмотреть сохр");
                but.setVisible(true);
                locbut.setVisible(false);
            }
        })
        ;
    }
}

