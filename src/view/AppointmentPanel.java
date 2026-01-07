/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;

public class AppointmentPanel extends JPanel {

    public AppointmentPanel() {
        setBorder(BorderFactory.createTitledBorder("Appointments"));
        setLayout(new BorderLayout());

        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setText("Appointments loaded from CSV...\n");

        JButton refresh = new JButton("Refresh");

        add(new JScrollPane(area), BorderLayout.CENTER);
        add(refresh, BorderLayout.SOUTH);
    }
}
