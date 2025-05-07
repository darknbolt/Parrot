package Views;

import Controllers.LayoutController;

import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel {
    public HomePanel(LayoutController controller) {
        this.setLayout(new BorderLayout());

        JButton share = new JButton("Share");
        JButton receive = new JButton("Receive");

        share.setSize(100, 50);
        receive.setSize(300, 150);

        share.addActionListener(e -> controller.show(LayoutController.View.SHARE));
        receive.addActionListener(e -> controller.show(LayoutController.View.RECEIVE));

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(share);
        buttonPanel.add(receive);

        add(menuBar, BorderLayout.PAGE_START);
        add(buttonPanel, BorderLayout.CENTER);
        this.setVisible(true);
    }
}
