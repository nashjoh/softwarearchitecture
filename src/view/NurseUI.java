/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;

public class NurseUI extends JPanel {

    public NurseUI() {
        setLayout(new BorderLayout());

        JLabel header = new JLabel("Nursing Station", JLabel.CENTER);
        header.setFont(new Font("Segoe UI", Font.BOLD, 18));

        JPanel content = new JPanel(new GridLayout(1,2,10,10));
        content.add(new PatientRecordPanel());
        content.add(new NotificationPanel());

        add(header, BorderLayout.NORTH);
        add(content, BorderLayout.CENTER);
    }
}
