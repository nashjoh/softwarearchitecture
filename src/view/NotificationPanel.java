/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;

public class NotificationPanel extends JPanel {

    public NotificationPanel() {
        setBorder(BorderFactory.createTitledBorder("Notifications"));
        setLayout(new BorderLayout());

        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setText("System notifications...\n");

        JButton send = new JButton("Send Notification");

        add(new JScrollPane(area), BorderLayout.CENTER);
        add(send, BorderLayout.SOUTH);
    }
}
