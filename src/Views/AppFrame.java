package Views;

import Controllers.DataController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.Objects;

public class AppFrame extends JFrame {
    private DataController dataController;
    public AppFrame(){
        this.setTitle("Parrot");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dataController = new DataController();
        this.setSize(750, 750);
        this.setContentPane(new JPanel());
        this.getContentPane().setLayout(null);
        this.getContentPane().setBackground(Color.white);
        this.setResizable(true);
        this.setVisible(true);
    }

    public void initialize(){
        URL resource = getClass().getResource("/Images/loading.png");
        if(resource == null){
            throw new RuntimeException("Image not found!");
        }
        JLabel label = new JLabel(new ImageIcon(resource));
        label.setBounds(70, 300, 609, 96);
        this.getContentPane().add(label);

        //TODO: Initialize Objects and Data
        new Thread(){
            @Override
            public void run() {
                super.run();
                dataController.generateClient();
            }
        }.start();

        try{
            Thread.sleep(Duration.ofSeconds(5));
        }catch (InterruptedException e){
            System.err.println("Interrupted Initialization: " + e.getMessage());
        }

        this.getContentPane().remove(label);
        this.getContentPane().repaint();
    }

    public void run(){
        JButton share = new JButton("Share");
        JButton receive = new JButton("Receive");

        share.setBounds(100, 300, 100, 50);
        receive.setBounds(250, 300, 100, 50);

        share.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("This much works 1");
            }
        });
        receive.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("This much works 2");
            }
        });

        this.getContentPane().add(share);
        this.getContentPane().add(receive);
        this.getContentPane().repaint();
    }
}
