package com.mycompany.hospitalmanagementapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Doctorportal extends JFrame implements ActionListener {

    private JLabel hdrDoctor, lblId, lblName, lblSpecialty, lblSearch;
    private JTextField txtId, txtName, txtSpecialty, txtSearch;
    private JScrollPane spTable;
    private JButton btnAdd, btnUpdate, btnDelete, btnClear, btnSearch, btnViewAll, btnBack;
    private JTable tblDoctor;
    private DefaultTableModel modelDoctor;

    Doctorportal() {
        setTitle("Doctor Records");
        setSize(800, 560);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        hdrDoctor = new JLabel("Doctor Management");
        hdrDoctor.setBounds(320, 15, 200, 30);
        add(hdrDoctor);

        // Form
        lblId = new JLabel("Doctor ID:");
        lblId.setBounds(30, 60, 100, 25);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(140, 60, 200, 25);
        add(txtId);

        lblName = new JLabel("Name:");
        lblName.setBounds(30, 95, 100, 25);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(140, 95, 200, 25);
        add(txtName);

        lblSpecialty = new JLabel("Specialty:");
        lblSpecialty.setBounds(30, 130, 100, 25);
        add(lblSpecialty);

        txtSpecialty = new JTextField();
        txtSpecialty.setBounds(140, 130, 200, 25);
        add(txtSpecialty);

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
        lblSearch = new JLabel("Search (ID / Name / Specialty):");
        lblSearch.setBounds(30, 230, 190, 25);
        add(lblSearch);

        txtSearch = new JTextField();
        txtSearch.setBounds(225, 230, 190, 25);
        add(txtSearch);

        btnSearch = new JButton("Search");
        btnSearch.setBounds(425, 228, 100, 30);
        add(btnSearch);

        btnViewAll = new JButton("View All");
        btnViewAll.setBounds(535, 228, 100, 30);
        add(btnViewAll);

        // Table
        String[] columns = {"Doctor ID", "Name", "Specialty", "No. of Patients"};
        modelDoctor = new DefaultTableModel(columns, 0);
        tblDoctor = new JTable(modelDoctor);
        spTable = new JScrollPane(tblDoctor);
        spTable.setBounds(30, 280, 720, 220);
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
            // TODO: validate and insert doctor to database
        } else if (e.getSource() == btnUpdate) {
            // TODO: update doctor record
        } else if (e.getSource() == btnDelete) {
            // TODO: delete doctor record
        } else if (e.getSource() == btnSearch) {
            // TODO: search doctor
        } else if (e.getSource() == btnViewAll) {
            // TODO: load all doctors
        } else if (e.getSource() == btnClear) {
            txtId.setText("");
            txtName.setText("");
            txtSpecialty.setText("");
            txtSearch.setText("");
        } else if (e.getSource() == btnBack) {
            Hospitalmanagement menu = new Hospitalmanagement();
            menu.setVisible(true);
            dispose();
        }
    }
}