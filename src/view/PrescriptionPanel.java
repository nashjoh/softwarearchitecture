/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;

public class PrescriptionPanel extends JPanel {

    public PrescriptionPanel() {
        setBorder(BorderFactory.createTitledBorder("Prescriptions"));
        setLayout(new BorderLayout());

        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setText("Prescription records...\n");

        JButton add = new JButton("New Prescription");

        add(new JScrollPane(area), BorderLayout.CENTER);
        add(add, BorderLayout.SOUTH);
    }
}
