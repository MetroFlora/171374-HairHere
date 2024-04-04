

import javax.swing.*;
import java.awt.*;

import dBConnect.*;

/**
 * Main
 */
public class Main extends JFrame {
    JPanel mainPanel = new JPanel();
    CardLayout crd = new CardLayout();

    Main() {
        mainPanel.setLayout(crd);
        mainPanel.add("login", new LoginPanel(crd));
        mainPanel.add("user", new UserPanel(crd));
        mainPanel.add("registration", new RegistrationPanel(crd));

        crd.show(mainPanel, "login");
        add(mainPanel);

        setTitle("Login");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Main f = new Main();
    }
    
}