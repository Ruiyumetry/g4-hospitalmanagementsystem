package com.mycompany.hospitalmanagementapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Reportsportal extends JFrame implements ActionListener {

    private JLabel hdrReports, lblType, lblFrom, lblTo;
    private JComboBox<String> cmbType;
    private JTextField txtFrom, txtTo;
    private JScrollPane spTable;
    private JButton btnGenerate, btnClear, btnBack;
    private JTable tblReport;
    private DefaultTableModel modelReport;

    Reportsportal() {
        setTitle("Reports");
        setSize(800, 520);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        hdrReports = new JLabel("Patient Visits and Treatment Reports");
        hdrReports.setBounds(270, 15, 300, 30);
        add(hdrReports);

        lblType = new JLabel("Report Type:");
        lblType.setBounds(30, 65, 100, 25);
        add(lblType);

        String[] reportTypes = {"Patient Visits", "Treatment History", "Appointments per Doctor"};
        cmbType = new JComboBox<>(reportTypes);
        cmbType.setBounds(140, 65, 220, 25);
        add(cmbType);

        lblFrom = new JLabel("From (YYYY-MM-DD):");
        lblFrom.setBounds(30, 105, 130, 25);
        add(lblFrom);

        txtFrom = new JTextField();
        txtFrom.setBounds(170, 105, 130, 25);
        add(txtFrom);

        lblTo = new JLabel("To (YYYY-MM-DD):");
        lblTo.setBounds(330, 105, 120, 25);
        add(lblTo);

        txtTo = new JTextField();
        txtTo.setBounds(460, 105, 130, 25);
        add(txtTo);

        btnGenerate = new JButton("Generate");
        btnGenerate.setBounds(30, 150, 110, 30);
        add(btnGenerate);

        btnClear = new JButton("Clear");
        btnClear.setBounds(150, 150, 110, 30);
        add(btnClear);

        btnBack = new JButton("Back");
        btnBack.setBounds(640, 150, 110, 30);
        add(btnBack);

        // Table
        String[] columns = {"Patient ID", "Patient Name", "Doctor", "Date", "Details"};
        modelReport = new DefaultTableModel(columns, 0);
        tblReport = new JTable(modelReport);
        spTable = new JScrollPane(tblReport);
        spTable.setBounds(30, 200, 720, 260);
        add(spTable);

        // Add to ActionListener
        btnGenerate.addActionListener(this);
        btnClear.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGenerate) {
            // TODO: generate report based on selected type and date range
        } else if (e.getSource() == btnClear) {
            txtFrom.setText("");
            txtTo.setText("");
            cmbType.setSelectedIndex(0);
            modelReport.setRowCount(0);
        } else if (e.getSource() == btnBack) {
            Hospitalmanagement menu = new Hospitalmanagement();
            menu.setVisible(true);
            dispose();
        }
    }
}