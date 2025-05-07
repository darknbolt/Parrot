package Views;

import Controllers.LayoutController;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LoadingPanel extends JPanel {
    private ImageIcon image;

    public LoadingPanel(LayoutController controller) {
        URL myResource = getClass().getResource("/Images/loading.png");
        if(myResource == null){
            throw new RuntimeException("Image not found!");
        }
        image = new ImageIcon(myResource);
        JLabel imageLabel = new JLabel(image);
        imageLabel.setBounds(70, 300, 609, 96);
        this.add(imageLabel, BorderLayout.CENTER);
        this.repaint();
        this.setVisible(true);
    }
}
