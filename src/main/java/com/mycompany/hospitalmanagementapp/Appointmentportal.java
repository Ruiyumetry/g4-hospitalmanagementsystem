package com.mycompany.hospitalmanagementapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Appointmentportal extends JFrame implements ActionListener {

    private JLabel hdrAppointment, lblAppId, lblPatientId, lblDoctorId, lblDate, lblUrgency, lblSearch;
    private JTextField txtAppId, txtPatientId, txtDoctorId, txtDate, txtSearch;
    private JComboBox<String> cmbUrgency;
    private JScrollPane spTable;
    private JButton btnSchedule, btnUpdate, btnCancel, btnClear, btnSearch, btnViewAll, btnNext, btnBack;
    private JTable tblAppointment;
    private DefaultTableModel modelAppointment;

    Appointmentportal() {
        setTitle("Appointments");
        setSize(850, 600);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        hdrAppointment = new JLabel("Appointment Management");
        hdrAppointment.setBounds(335, 15, 220, 30);
        add(hdrAppointment);

        // Form
        lblAppId = new JLabel("Appointment ID:");
        lblAppId.setBounds(30, 60, 110, 25);
        add(lblAppId);

        txtAppId = new JTextField();
        txtAppId.setBounds(150, 60, 180, 25);
        add(txtAppId);

        lblPatientId = new JLabel("Patient ID:");
        lblPatientId.setBounds(30, 95, 110, 25);
        add(lblPatientId);

        txtPatientId = new JTextField();
        txtPatientId.setBounds(150, 95, 180, 25);
        add(txtPatientId);

        lblDoctorId = new JLabel("Doctor ID:");
        lblDoctorId.setBounds(430, 60, 100, 25);
        add(lblDoctorId);

        txtDoctorId = new JTextField();
        txtDoctorId.setBounds(540, 60, 180, 25);
        add(txtDoctorId);

        lblDate = new JLabel("Date (YYYY-MM-DD):");
        lblDate.setBounds(430, 95, 120, 25);
        add(lblDate);

        txtDate = new JTextField();
        txtDate.setBounds(560, 95, 160, 25);
        add(txtDate);

        lblUrgency = new JLabel("Urgency:");
        lblUrgency.setBounds(30, 130, 110, 25);
        add(lblUrgency);

        String[] urgencyLevels = {"1 - Emergency", "2 - Urgent", "3 - Normal"};
        cmbUrgency = new JComboBox<>(urgencyLevels);
        cmbUrgency.setBounds(150, 130, 180, 25);
        add(cmbUrgency);

        // Buttons
        btnSchedule = new JButton("Schedule");
        btnSchedule.setBounds(30, 180, 110, 30);
        add(btnSchedule);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(150, 180, 110, 30);
        add(btnUpdate);

        btnCancel = new JButton("Cancel Appt.");
        btnCancel.setBounds(270, 180, 110, 30);
        add(btnCancel);

        btnClear = new JButton("Clear");
        btnClear.setBounds(390, 180, 110, 30);
        add(btnClear);

        btnNext = new JButton("Serve Next");
        btnNext.setBounds(570, 180, 110, 30);
        add(btnNext);

        btnBack = new JButton("Back");
        btnBack.setBounds(690, 180, 110, 30);
        add(btnBack);

        // Search
        lblSearch = new JLabel("Search (Appt. ID / Patient ID / Doctor ID):");
        lblSearch.setBounds(30, 230, 260, 25);
        add(lblSearch);

        txtSearch = new JTextField();
        txtSearch.setBounds(295, 230, 190, 25);
        add(txtSearch);

        btnSearch = new JButton("Search");
        btnSearch.setBounds(495, 228, 100, 30);
        add(btnSearch);

        btnViewAll = new JButton("View All");
        btnViewAll.setBounds(605, 228, 100, 30);
        add(btnViewAll);

        // Table
        String[] columns = {"Appointment ID", "Patient ID", "Doctor ID", "Date", "Urgency"};
        modelAppointment = new DefaultTableModel(columns, 0);
        tblAppointment = new JTable(modelAppointment);
        spTable = new JScrollPane(tblAppointment);
        spTable.setBounds(30, 280, 770, 260);
        add(spTable);

        // Add to ActionListener
        btnSchedule.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnCancel.addActionListener(this);
        btnClear.addActionListener(this);
        btnNext.addActionListener(this);
        btnSearch.addActionListener(this);
        btnViewAll.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSchedule) {
            // TODO: verify patient (hashing), add to priority queue + database
        } else if (e.getSource() == btnUpdate) {
            // TODO: update appointment
        } else if (e.getSource() == btnCancel) {
            // TODO: cancel appointment
        } else if (e.getSource() == btnNext) {
            // TODO: poll the priority queue (highest urgency first)
        } else if (e.getSource() == btnSearch) {
            // TODO: search appointment
        } else if (e.getSource() == btnViewAll) {
            // TODO: load all appointments
        } else if (e.getSource() == btnClear) {
            txtAppId.setText("");
            txtPatientId.setText("");
            txtDoctorId.setText("");
            txtDate.setText("");
            txtSearch.setText("");
            cmbUrgency.setSelectedIndex(0);
        } else if (e.getSource() == btnBack) {
            Hospitalmanagement menu = new Hospitalmanagement();
            menu.setVisible(true);
            dispose();
        }
    }
}