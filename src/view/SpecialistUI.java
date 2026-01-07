/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;

public class SpecialistUI extends JPanel {

    public SpecialistUI() {
        setLayout(new BorderLayout());

        JLabel header = new JLabel("Specialist Referral Centre", JLabel.CENTER);
        header.setFont(new Font("Segoe UI", Font.BOLD, 18));

        JPanel content = new JPanel(new GridLayout(1,2,10,10));
        content.add(new ReferralPanel());
        content.add(new PatientRecordPanel());

        add(header, BorderLayout.NORTH);
        add(content, BorderLayout.CENTER);
    }
}
