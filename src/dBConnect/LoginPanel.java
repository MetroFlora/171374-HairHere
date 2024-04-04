package dBConnect;

import javax.swing.*;
import java.awt.*;
import static java.awt.Frame.NORMAL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel {

    CardLayout crd;

    JLabel title = new JLabel("HAIR HERE", JLabel.CENTER);
    JPanel inputJPanel = new JPanel();
    JTextField usernamTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton registerButton = new JButton("Register/Create New Account");

    public LoginPanel(CardLayout crd) {
        // Initialize button actions
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Login.doLogin(usernamTextField.getText(), passwordField.getText())) {
                    System.out.println("logged in!");
                    crd.show(getParent(), "user");
                } else {
                    System.out.println("Failed login!");
                    javax.swing.JOptionPane.showMessageDialog(getParent(), "invalid login credentials!", "Error", NORMAL);
                }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.show(getParent(), "registration");
            }
        });

        this.crd = crd;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;

        gbc.gridx = 0;
        gbc.gridy = 0;
        title.setFont(new Font("Helvetica Neue", Font.PLAIN, 36));
        add(title, gbc);

        gbc.gridy++;
        initInputPanel();
        add(inputJPanel, gbc);

        gbc.gridy++;
        gbc.fill = GridBagConstraints.NONE;
        add(loginButton, gbc);

        gbc.gridy++;
        add(registerButton, gbc);
    }

    private void initInputPanel() {
        inputJPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.CENTER;

        gbc.gridx = 0;
        gbc.gridy = 0;
        inputJPanel.add(new Container(), gbc);

        gbc.gridx = 1;
        inputJPanel.add(new JLabel("Username"), gbc);

        gbc.gridx = 2;
        inputJPanel.add(new Container(), gbc);

        gbc.gridx = 3;
        inputJPanel.add(usernamTextField, gbc);

        gbc.gridx = 4;
        inputJPanel.add(new Container(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 0.5;
        gbc.gridwidth = 5;
        inputJPanel.add(new Container(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 1;
        gbc.gridwidth = 1;
        inputJPanel.add(new Container(), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        inputJPanel.add(new JLabel("Password"), gbc);

        gbc.gridx = 2;
        inputJPanel.add(new Container(), gbc);

        gbc.gridx = 3;
        inputJPanel.add(passwordField, gbc);

        gbc.gridx = 4;
        inputJPanel.add(new Container(), gbc);
    }

}
