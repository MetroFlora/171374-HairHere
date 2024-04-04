package dBConnect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserPanel extends JPanel {
    CardLayout crd;

    JButton servicesButton = new JButton("Services");
    JButton timeButton = new JButton("Time");
    JButton locationButton = new JButton("Location");
    JButton exitButton = new JButton("EXIT");


    public UserPanel(CardLayout crd) {
        // Initialize button actions.
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.show(getParent(), "login");
            }
        });

        this.crd = crd;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 1;
        gbc.weighty = 1;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(servicesButton, gbc);

        gbc.gridy++;
        add(timeButton, gbc);
        
        gbc.gridy++;
        add(locationButton, gbc);

        gbc.gridy++;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 0, 0, 20);
        add(exitButton, gbc);
    }
}
