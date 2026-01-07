/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;

public class ReferralPanel extends JPanel {

    public ReferralPanel() {
        setBorder(BorderFactory.createTitledBorder("Referrals"));
        setLayout(new BorderLayout());

        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setText("Referral queue (Singleton-managed)...\n");

        JButton create = new JButton("Create Referral");

        add(new JScrollPane(area), BorderLayout.CENTER);
        add(create, BorderLayout.SOUTH);
    }
}
