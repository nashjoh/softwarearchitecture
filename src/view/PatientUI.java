/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;

public class PatientUI extends JPanel {

    public PatientUI() {
        setLayout(new BorderLayout());

        JLabel header = new JLabel("Patient Dashboard", JLabel.CENTER);
        header.setFont(new Font("Segoe UI", Font.BOLD, 18));
        header.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));

        JPanel content = new JPanel(new GridLayout(1,2,10,10));
        content.add(new AppointmentPanel());
        content.add(new PrescriptionPanel());

        add(header, BorderLayout.NORTH);
        add(content, BorderLayout.CENTER);
    }
}
