package Views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class UsernamePanel extends JDialog {
    private String nickname;

    public UsernamePanel(){
        this.setTitle("Client Registration");
        this.setLocation(300, 300);
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(160, 190);

        JTextField nicknameField = new JTextField("Nickname");
        JButton submitButton = new JButton("Submit");

        nicknameField.setBounds(20, 30, 100, 50);
        submitButton.setBounds(20, 90, 100, 50);

        nicknameField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() != KeyEvent.VK_ENTER && nicknameField.getText().equals("Nickname")){
                    nicknameField.setText("");
                }
                else if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    nickname = nicknameField.getText();
                    dispose();
                }
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nickname = nicknameField.getText();
                dispose();
            }
        });

        this.add(nicknameField);
        this.add(submitButton);
        this.setVisible(true);
    }

    public String getNickname(){ return this.nickname; }
}
