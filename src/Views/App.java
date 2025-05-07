package Views;

import Controllers.DataController;
import Controllers.LayoutController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class App extends JFrame {
    private DataController dataController;
    private LayoutController layoutController;
    private final URL resource = getClass().getResource("/Images/logo.png");
    public App(){
        this.setTitle("Parrot");
        this.setIconImage(new ImageIcon(resource).getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setResizable(true);

        this.dataController = new DataController();
        this.layoutController = new LayoutController();
        this.setContentPane(layoutController.getMainPanel());
        layoutController.show(LayoutController.View.LOADING);

        this.setVisible(true);
        initialize();
    }

    private void initialize(){
        dataController.generateClient();
        layoutController.show(LayoutController.View.HOME);
    }
}
