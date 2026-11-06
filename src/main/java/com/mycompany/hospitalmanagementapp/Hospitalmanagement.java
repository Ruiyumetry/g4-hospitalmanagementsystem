package com.mycompany.hospitalmanagementapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Hospitalmanagement extends JFrame implements ActionListener {

    private JLabel hdrHospital, lblChooseRole;
    private JButton btnPatient, btnDoctor, btnAppointment, btnReports, btnLogout;

    Hospitalmanagement() {
        setTitle("Hospital Management System");
        setSize(500, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        hdrHospital = new JLabel("Hospital Management System");
        hdrHospital.setBounds(150, 30, 250, 30);
        add(hdrHospital);

        lblChooseRole = new JLabel("Please choose what you want to manage:");
        lblChooseRole.setBounds(130, 80, 280, 30);
        add(lblChooseRole);

        btnPatient = new JButton("Patients");
        btnPatient.setBounds(80, 130, 150, 50);
        add(btnPatient);

        btnDoctor = new JButton("Doctors");
        btnDoctor.setBounds(260, 130, 150, 50);
        add(btnDoctor);

        btnAppointment = new JButton("Appointments");
        btnAppointment.setBounds(80, 200, 150, 50);
        add(btnAppointment);

        btnReports = new JButton("Reports");
        btnReports.setBounds(260, 200, 150, 50);
        add(btnReports);

        btnLogout = new JButton("Logout");
        btnLogout.setBounds(190, 290, 120, 30);
        add(btnLogout);

        // Add to ActionListener
        btnPatient.addActionListener(this);
        btnDoctor.addActionListener(this);
        btnAppointment.addActionListener(this);
        btnReports.addActionListener(this);
        btnLogout.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnPatient) {
            Patientportal patient = new Patientportal();
            patient.setVisible(true);
            dispose();
        } else if (e.getSource() == btnDoctor) {
            Doctorportal doctor = new Doctorportal();
            doctor.setVisible(true);
            dispose();
        } else if (e.getSource() == btnAppointment) {
            Appointmentportal appointment = new Appointmentportal();
            appointment.setVisible(true);
            dispose();
        } else if (e.getSource() == btnReports) {
            Reportsportal reports = new Reportsportal();
            reports.setVisible(true);
            dispose();
        } else if (e.getSource() == btnLogout) {
            Loginform login = new Loginform();
            login.setVisible(true);
            dispose();
        }
    }
}