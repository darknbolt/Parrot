package Views;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.stream.StreamSupport;

public class AppFrame extends JFrame {
    private JPanel panel;
    public AppFrame(){
        this.setTitle("Parrot");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setContentPane(panel = new JPanel());
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.setResizable(true);
        this.setVisible(true);
    }

    public void initialize(){
        JLabel label = new JLabel(new ImageIcon(System.getProperty("user.dir") + "\\resources\\Images\\loading.png"));
        label.setBounds(70, 300, 609, 96);
        this.getContentPane().add(label);

        //TODO: Initialize Objects and Data

        this.getContentPane().remove(label);
        this.getContentPane().repaint();
        System.out.println("Complete!");
    }
}
