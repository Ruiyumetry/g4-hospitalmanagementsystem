
package com.mycompany.hospitalmanagementapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class patientportal extends JFrame implements ActionListener{

    private JLabel hdrPatient, lblAccountSection, lblBookSection;
    private JLabel lblPatientId, lblPatientName, lblPatientAge, lblPatientPin, lblMedicalHistory;
    private JLabel lblFindDoctor, lblDoctorId, lblApptDate, lblUrgency, lblAppointmentId;
    private JTextField txtPatientId, txtPatientName, txtPatientAge, txtMedicalHistory;
    private JTextField txtFindDoctor, txtDoctorId, txtApptDate, txtAppointmentId;
    private JPasswordField pwdPatientPin;
    private JButton btnAddPatient, btnUpdatePatient, btnDeletePatient, btnLoginPatient;
    private JButton btnFindDoctor, btnBook, btnCancelAppt;
    private JButton btnMyAppointments, btnMyHistory, btnResetForm, btnBack;
    private JComboBox<String> cmbUrgency;
    private JTextArea txaOutput;
    private static final String[] urgencies = {"Routine", "Urgent", "Emergency"};


    patientportal(){
        setTitle("Patient Portal");
        setSize(830, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Header
        hdrPatient = new JLabel("Patient Portal");
        hdrPatient.setBounds(350, 15, 200, 30);
        add(hdrPatient);

        //Account Section
        lblAccountSection = new JLabel("MY ACCOUNT");
        lblAccountSection.setBounds(50, 55, 200, 30);
        add(lblAccountSection);

        lblPatientId = new JLabel("Patient ID:");
        lblPatientId.setBounds(50, 85, 110, 30);
        add(lblPatientId);

        lblPatientName = new JLabel("Name:");
        lblPatientName.setBounds(50, 120, 110, 30);
        add(lblPatientName);

        lblPatientAge = new JLabel("Age:");
        lblPatientAge.setBounds(50, 155, 110, 30);
        add(lblPatientAge);

        lblPatientPin = new JLabel("PIN:");
        lblPatientPin.setBounds(50, 190, 110, 30);
        add(lblPatientPin);

        lblMedicalHistory = new JLabel("Medical History:");
        lblMedicalHistory.setBounds(50, 225, 110, 30);
        add(lblMedicalHistory);

        txtPatientId = new JTextField();
        txtPatientId.setBounds(165, 85, 210, 30);
        add(txtPatientId);

        txtPatientName = new JTextField();
        txtPatientName.setBounds(165, 120, 210, 30);
        add(txtPatientName);

        txtPatientAge = new JTextField();
        txtPatientAge.setBounds(165, 155, 210, 30);
        add(txtPatientAge);

        pwdPatientPin = new JPasswordField();
        pwdPatientPin.setBounds(165, 190, 210, 30);
        add(pwdPatientPin);

        txtMedicalHistory = new JTextField();
        txtMedicalHistory.setBounds(165, 225, 210, 30);
        add(txtMedicalHistory);

        btnAddPatient = new JButton("Add");
        btnAddPatient.setBounds(50, 265, 77, 30);
        add(btnAddPatient);

        btnUpdatePatient = new JButton("Update");
        btnUpdatePatient.setBounds(132, 265, 77, 30);
        add(btnUpdatePatient);

        btnDeletePatient = new JButton("Delete");
        btnDeletePatient.setBounds(214, 265, 77, 30);
        add(btnDeletePatient);

        btnLoginPatient = new JButton("Login");
        btnLoginPatient.setBounds(296, 265, 77, 30);
        add(btnLoginPatient);

        //Book Appointment Section
        lblBookSection = new JLabel("BOOK AN APPOINTMENT");
        lblBookSection.setBounds(470, 55, 250, 30);
        add(lblBookSection);

        lblFindDoctor = new JLabel("Find Doctor:");
        lblFindDoctor.setBounds(470, 85, 110, 30);
        add(lblFindDoctor);

        txtFindDoctor = new JTextField();
        txtFindDoctor.setBounds(585, 85, 195, 30);
        txtFindDoctor.setToolTipText("Doctor name or specialty");
        add(txtFindDoctor);

        btnFindDoctor = new JButton("Find Doctor");
        btnFindDoctor.setBounds(470, 120, 310, 30);
        add(btnFindDoctor);

        lblDoctorId = new JLabel("Doctor ID:");
        lblDoctorId.setBounds(470, 155, 110, 30);
        add(lblDoctorId);

        txtDoctorId = new JTextField();
        txtDoctorId.setBounds(585, 155, 195, 30);
        add(txtDoctorId);

        lblApptDate = new JLabel("Date/Time:");
        lblApptDate.setBounds(470, 190, 110, 30);
        add(lblApptDate);

        txtApptDate = new JTextField();
        txtApptDate.setBounds(585, 190, 195, 30);
        txtApptDate.setToolTipText("yyyy-MM-dd HH:mm  (example: 2026-11-05 09:30)");
        add(txtApptDate);

        lblUrgency = new JLabel("Urgency:");
        lblUrgency.setBounds(470, 225, 110, 30);
        add(lblUrgency);

        cmbUrgency = new JComboBox<>(urgencies);
        cmbUrgency.setBounds(585, 225, 195, 30);
        add(cmbUrgency);

        lblAppointmentId = new JLabel("Appointment ID:");
        lblAppointmentId.setBounds(470, 260, 110, 30);
        add(lblAppointmentId);

        txtAppointmentId = new JTextField();
        txtAppointmentId.setBounds(585, 260, 195, 30);
        add(txtAppointmentId);

        btnBook = new JButton("Book");
        btnBook.setBounds(470, 300, 150, 30);
        add(btnBook);

        btnCancelAppt = new JButton("Cancel Appointment");
        btnCancelAppt.setBounds(630, 300, 150, 30);
        add(btnCancelAppt);

        //Bottom Buttons
        btnMyAppointments = new JButton("My Appointments");
        btnMyAppointments.setBounds(50, 350, 165, 30);
        add(btnMyAppointments);

        btnMyHistory = new JButton("My Medical History");
        btnMyHistory.setBounds(238, 350, 165, 30);
        add(btnMyHistory);

        btnResetForm = new JButton("Reset Form");
        btnResetForm.setBounds(426, 350, 165, 30);
        add(btnResetForm);

        btnBack = new JButton("Back");
        btnBack.setBounds(614, 350, 165, 30);
        add(btnBack);

        //Output
        txaOutput = new JTextArea();
        txaOutput.setBounds(50, 400, 730, 230);
        txaOutput.setEditable(false);
        add(txaOutput);

        // Add to ActionListener
        btnAddPatient.addActionListener(this);
        btnUpdatePatient.addActionListener(this);
        btnDeletePatient.addActionListener(this);
        btnLoginPatient.addActionListener(this);
        btnFindDoctor.addActionListener(this);
        btnBook.addActionListener(this);
        btnCancelAppt.addActionListener(this);
        btnMyAppointments.addActionListener(this);
        btnMyHistory.addActionListener(this);
        btnResetForm.addActionListener(this);
        btnBack.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAddPatient){
            // TODO: add patient
        }else if(e.getSource() == btnUpdatePatient){
            // TODO: update patient

        }else if(e.getSource() == btnDeletePatient){
            // TODO: delete patient
        }else if(e.getSource() == btnLoginPatient){
            // TODO: verify patient ID and PIN

        }else if(e.getSource() == btnFindDoctor){
            // TODO: search doctors by name or specialty
        }else if(e.getSource() == btnBook){
            // TODO: book appointment

        }else if(e.getSource() == btnCancelAppt){
            // TODO: cancel appointment
        }else if(e.getSource() == btnMyAppointments){
            // TODO: show this patient's appointments

        }else if(e.getSource() == btnMyHistory){
            // TODO: show this patient's medical history
        }else if(e.getSource() == btnResetForm){
            txtPatientId.setText("");
            txtPatientName.setText("");
            txtPatientAge.setText("");
            pwdPatientPin.setText("");
            txtMedicalHistory.setText("");

            txtFindDoctor.setText("");
            txtDoctorId.setText("");
            txtApptDate.setText("");
            txtAppointmentId.setText("");
            cmbUrgency.setSelectedIndex(0);

            txaOutput.setText("");
        }else if(e.getSource() == btnBack){
            Hospitalmanagement home = new Hospitalmanagement();
            home.setVisible(true);
            dispose();
        }

    }
}