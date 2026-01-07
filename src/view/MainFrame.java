package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private CardLayout cardLayout;
    private JPanel contentPanel;

    public MainFrame() {
        setTitle("Healthcare Management System");
        setSize(1100, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ---------- TOP NAVIGATION BAR ----------
        JPanel navBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        navBar.setBackground(new Color(30, 45, 60));

        JButton patientBtn = createNavButton("Patient");
        JButton receptionistBtn = createNavButton("Receptionist");
        JButton gpBtn = createNavButton("GP");
        JButton specialistBtn = createNavButton("Specialist");
        JButton nurseBtn = createNavButton("Nurse");

        navBar.add(patientBtn);
        navBar.add(receptionistBtn);
        navBar.add(gpBtn);
        navBar.add(specialistBtn);
        navBar.add(nurseBtn);

        // ---------- MAIN CONTENT AREA ----------
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        contentPanel.add(new PatientUI(), "PATIENT");
        contentPanel.add(new ReceptionistUI(), "RECEPTIONIST");
        contentPanel.add(new GPUI(), "GP");
        contentPanel.add(new SpecialistUI(), "SPECIALIST");
        contentPanel.add(new NurseUI(), "NURSE");

        // ---------- BUTTON ACTIONS ----------
        patientBtn.addActionListener(e -> cardLayout.show(contentPanel, "PATIENT"));
        receptionistBtn.addActionListener(e -> cardLayout.show(contentPanel, "RECEPTIONIST"));
        gpBtn.addActionListener(e -> cardLayout.show(contentPanel, "GP"));
        specialistBtn.addActionListener(e -> cardLayout.show(contentPanel, "SPECIALIST"));
        nurseBtn.addActionListener(e -> cardLayout.show(contentPanel, "NURSE"));

        // ---------- DEFAULT VIEW ----------
        cardLayout.show(contentPanel, "PATIENT");

        add(navBar, BorderLayout.NORTH);
        add(contentPanel, BorderLayout.CENTER);
    }

    private JButton createNavButton(String text) {
        JButton button = new JButton(text);
        button.setFocusPainted(false);
        button.setBackground(new Color(220, 230, 240));
        button.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        return button;
    }
}
