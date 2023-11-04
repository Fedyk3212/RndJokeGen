package com.Eng_loc;

import javax.swing.*;

import com.MainRus.JOPER;
import com.MainRus.Main;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class localization extends Main {
    private static final List<String> joks1eng = new ArrayList<>(Arrays.asList("Stirlitz", "Barthender", "Stalker", "Boatswain", "Sailor"));
    private static final List<String> engact = new ArrayList<>(Arrays.asList("drank", "thought", "decided", "came out", "bought", "sold"));
    private static final List<String> engprg = new ArrayList<>(Arrays.asList("in", "on", " "));
    private static final List<String> engfin = new ArrayList<>(Arrays.asList("door", "boots", "window", "freedom"));

    public static int random(int max) {
        return (int) Math.floor(Math.random() * max);
    }

    public static String loclazdJoke() {
        return (joks1eng.get(random(joks1eng.size())) + " " +
                engact.get(random(engact.size())) + " " +
                engprg.get(random(engact.size())) + " " +
                engfin.get(random(engact.size())));
    }
    public JButton locbut = new JButton("Gen Joke", JOPER.getImage3());
    public void butwork(JButton but, JFrame frame, JLabel label, JRadioButton language,  JLabel names,JLabel acts,JLabel prdlg,JLabel fin) {
        frame.add(locbut);
        locbut.setBounds(but.getBounds());
        locbut.addActionListener(e -> label.setText(loclazdJoke()));
        locbut.setVisible(false);
        locbut.setContentAreaFilled(false);
        locbut.setBorderPainted(false);
        language.addItemListener(e->{
            switch (e.getStateChange()){
                case ItemEvent.SELECTED: but.setVisible(false);
                locbut.setVisible(true);
                names.setText("add name");
                acts.setText("add act");
                prdlg.setText("add conviction");
                fin.setText("add ending");
                break;
                case ItemEvent.DESELECTED: but.setVisible(true);
                locbut.setVisible(false);
                    names.setText("Добавить имя");
                    acts.setText("Добавить действие");
                    prdlg.setText("Добавить союз");
                    fin.setText("Добавить конец");
            }
        });

    }
}

