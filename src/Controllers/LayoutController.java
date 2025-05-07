package Controllers;

import Views.HomePanel;
import Views.LoadingPanel;
import Views.ReceivePanel;
import Views.SharePanel;

import javax.swing.*;
import java.awt.*;

public class LayoutController {
    private JPanel mainPanel;
    private CardLayout cardLayout;

    public enum View{
        HOME,
        SHARE,
        RECEIVE,
        LOADING,
        USERNAME
    }

    public LayoutController() {
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(new HomePanel(this), View.HOME.name());
        mainPanel.add(new SharePanel(this), View.SHARE.name());
        mainPanel.add(new ReceivePanel(this), View.RECEIVE.name());
        mainPanel.add(new LoadingPanel(this), View.LOADING.name());
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void show(View viewToShow){ cardLayout.show(mainPanel, viewToShow.name()); }
}
