package com.mycompany.hospitalmanagementapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Patientportal extends JFrame implements ActionListener {

    private JLabel hdrPatient, lblId, lblName, lblAge, lblHistory, lblSearch;
    private JTextField txtId, txtName, txtAge, txtSearch;
    private JTextArea txtHistory;
    private JScrollPane spHistory, spTable;
    private JButton btnAdd, btnUpdate, btnDelete, btnClear, btnSearch, btnViewAll, btnBack;
    private JTable tblPatient;
    private DefaultTableModel modelPatient;

    Patientportal() {
        setTitle("Patient Records");
        setSize(800, 620);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        hdrPatient = new JLabel("Patient Management");
        hdrPatient.setBounds(320, 15, 200, 30);
        add(hdrPatient);

        // Form
        lblId = new JLabel("Patient ID:");
        lblId.setBounds(30, 60, 100, 25);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(140, 60, 180, 25);
        add(txtId);

        lblName = new JLabel("Name:");
        lblName.setBounds(30, 95, 100, 25);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(140, 95, 180, 25);
        add(txtName);

        lblAge = new JLabel("Age:");
        lblAge.setBounds(30, 130, 100, 25);
        add(lblAge);

        txtAge = new JTextField();
        txtAge.setBounds(140, 130, 180, 25);
        add(txtAge);

        lblHistory = new JLabel("Medical History:");
        lblHistory.setBounds(400, 60, 120, 25);
        add(lblHistory);

        txtHistory = new JTextArea();
        txtHistory.setLineWrap(true);
        txtHistory.setWrapStyleWord(true);
        spHistory = new JScrollPane(txtHistory);
        spHistory.setBounds(400, 90, 350, 70);
        add(spHistory);

        // Buttons
        btnAdd = new JButton("Add");
        btnAdd.setBounds(30, 180, 100, 30);
        add(btnAdd);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(140, 180, 100, 30);
        add(btnUpdate);

        btnDelete = new JButton("Delete");
        btnDelete.setBounds(250, 180, 100, 30);
        add(btnDelete);

        btnClear = new JButton("Clear");
        btnClear.setBounds(360, 180, 100, 30);
        add(btnClear);

        btnBack = new JButton("Back");
        btnBack.setBounds(650, 180, 100, 30);
        add(btnBack);

        // Search
        lblSearch = new JLabel("Search (ID / Name):");
        lblSearch.setBounds(30, 230, 130, 25);
        add(lblSearch);

        txtSearch = new JTextField();
        txtSearch.setBounds(170, 230, 220, 25);
        add(txtSearch);

        btnSearch = new JButton("Search");
        btnSearch.setBounds(400, 228, 100, 30);
        add(btnSearch);

        btnViewAll = new JButton("View All");
        btnViewAll.setBounds(510, 228, 100, 30);
        add(btnViewAll);

        // Table
        String[] columns = {"Patient ID", "Name", "Age", "Medical History"};
        modelPatient = new DefaultTableModel(columns, 0);
        tblPatient = new JTable(modelPatient);
        spTable = new JScrollPane(tblPatient);
        spTable.setBounds(30, 280, 720, 270);
        add(spTable);

        // Add to ActionListener
        btnAdd.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnClear.addActionListener(this);
        btnSearch.addActionListener(this);
        btnViewAll.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {
            // TODO: validate, insert to BST + hash + database
        } else if (e.getSource() == btnUpdate) {
            // TODO: update patient record
        } else if (e.getSource() == btnDelete) {
            // TODO: delete patient record
        } else if (e.getSource() == btnSearch) {
            // TODO: search patient using BST
        } else if (e.getSource() == btnViewAll) {
            // TODO: load all patients (in-order traversal of BST)
        } else if (e.getSource() == btnClear) {
            txtId.setText("");
            txtName.setText("");
            txtAge.setText("");
            txtHistory.setText("");
            txtSearch.setText("");
        } else if (e.getSource() == btnBack) {
            Hospitalmanagement menu = new Hospitalmanagement();
            menu.setVisible(true);
            dispose();
        }
    }
}