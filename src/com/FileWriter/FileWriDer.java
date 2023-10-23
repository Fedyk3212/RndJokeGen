package com.FileWriter;
import com.MainRus.Main;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;

public class FileWriDer extends  Main {

    File file = new File("C:\\JProjects\\Project\\RndJokeGen\\src\\SaveFile.txt");
    FileInputStream fl = new FileInputStream ("D: ave.txt");
    FileWriter filewriter = new FileWriter(file);
    public FileWriDer(JTextField nametxf) throws IOException {

        nametxf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    try {
                        filewriter.write(nametxf.getText());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

    }


    public static void Reader(){}
}
