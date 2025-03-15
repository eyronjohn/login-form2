package gui;

import javax.swing.*;
import java.awt.*;

public class LoginFormGUI extends Form{

    public LoginFormGUI() {
        super("Login");
        addGUIComponents();
    }

    private void addGUIComponents() {
        JLabel loginLbl = new JLabel("Login");
        loginLbl.setForeground(Color.BLACK);
        loginLbl.setBounds(0, 25, 100, 100);

        add(loginLbl);
    }
}
