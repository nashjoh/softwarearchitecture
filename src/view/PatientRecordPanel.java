/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;

public class PatientRecordPanel extends JPanel {

    public PatientRecordPanel() {
        setBorder(BorderFactory.createTitledBorder("Patient Record"));
        setLayout(new BorderLayout());

        JTextArea recordArea = new JTextArea();
        JButton addNote = new JButton("Add Assessment Note");

        add(new JScrollPane(recordArea), BorderLayout.CENTER);
        add(addNote, BorderLayout.SOUTH);
    }
}
