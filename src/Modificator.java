import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;

public class Modificator extends Main {
    File file;

    {
        file = new File("C:\\JProjects\\Project\\RndJokeGen\\src\\BaseData");
    }

    BufferedReader reader = new BufferedReader(new FileReader(file));
    PrintStream pstr = new PrintStream(file);

    public Modificator() throws FileNotFoundException {
    }

    public void fw(JTextField namestxf) throws IOException {
        String text = namestxf.getText();
        pstr.print(text + " ");
    }


    public void KeyListener(JTextField namestxf, JLabel names) {
        namestxf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    try {
                        fw(namestxf);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });
    }

            }

