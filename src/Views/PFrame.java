package Views;

import javax.swing.*;

public class PFrame extends JFrame {
    private PPanel panel;
    public PFrame(){
        this.setTitle("Parrot");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setContentPane(panel = new PPanel());
        this.setResizable(true);
        this.setVisible(true);
    }
}
