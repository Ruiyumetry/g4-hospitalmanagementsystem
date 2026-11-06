
package com.mycompany.hospitalmanagementapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class doctorportal extends JFrame implements ActionListener{

    private JLabel hdrDoctor, lblProfileSection, lblLookupSection, lblQueueSection;
    private JLabel lblDoctorId, lblDoctorName, lblSpecialty, lblFindPatient, lblTreatment;
    private JTextField txtDoctorId, txtDoctorName, txtSpecialty, txtFindPatient, txtTreatment;
    private JButton btnAddDoctor, btnUpdateDoctor, btnDeleteDoctor, btnSearchDoctor;
    private JButton btnSearchPatient, btnPatientRecord;
    private JButton btnTreatNext, btnShowQueue, btnMyPatients, btnDoctorReport;
    private JButton btnSummaryReport, btnResetForm, btnBack;
    private JTextArea txaOutput;


    doctorportal(){
        setTitle("Doctor Portal");
        setSize(830, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        hdrDoctor = new JLabel("Doctor Portal");
        hdrDoctor.setBounds(350, 15, 200, 30);
        add(hdrDoctor);

        
        lblProfileSection = new JLabel("MY PROFILE");
        lblProfileSection.setBounds(50, 55, 200, 30);
        add(lblProfileSection);

        lblDoctorId = new JLabel("Doctor ID:");
        lblDoctorId.setBounds(50, 85, 110, 30);
        add(lblDoctorId);

        lblDoctorName = new JLabel("Name:");
        lblDoctorName.setBounds(50, 120, 110, 30);
        add(lblDoctorName);

        lblSpecialty = new JLabel("Specialty:");
        lblSpecialty.setBounds(50, 155, 110, 30);
        add(lblSpecialty);

        txtDoctorId = new JTextField();
        txtDoctorId.setBounds(165, 85, 210, 30);
        add(txtDoctorId);

        txtDoctorName = new JTextField();
        txtDoctorName.setBounds(165, 120, 210, 30);
        add(txtDoctorName);

        txtSpecialty = new JTextField();
        txtSpecialty.setBounds(165, 155, 210, 30);
        add(txtSpecialty);

        btnAddDoctor = new JButton("Add");
        btnAddDoctor.setBounds(50, 195, 77, 30);
        add(btnAddDoctor);

        btnUpdateDoctor = new JButton("Update");
        btnUpdateDoctor.setBounds(132, 195, 77, 30);
        add(btnUpdateDoctor);

        btnDeleteDoctor = new JButton("Delete");
        btnDeleteDoctor.setBounds(214, 195, 77, 30);
        add(btnDeleteDoctor);

        btnSearchDoctor = new JButton("Search");
        btnSearchDoctor.setBounds(296, 195, 77, 30);
        add(btnSearchDoctor);

        
        lblLookupSection = new JLabel("PATIENT LOOKUP");
        lblLookupSection.setBounds(50, 245, 200, 30);
        add(lblLookupSection);

        lblFindPatient = new JLabel("Patient ID/Name:");
        lblFindPatient.setBounds(50, 275, 110, 30);
        add(lblFindPatient);

        txtFindPatient = new JTextField();
        txtFindPatient.setBounds(165, 275, 210, 30);
        add(txtFindPatient);

        btnSearchPatient = new JButton("Search Patient");
        btnSearchPatient.setBounds(50, 315, 160, 30);
        add(btnSearchPatient);

        btnPatientRecord = new JButton("Patient Record");
        btnPatientRecord.setBounds(215, 315, 160, 30);
        add(btnPatientRecord);

        
        lblQueueSection = new JLabel("APPOINTMENT QUEUE");
        lblQueueSection.setBounds(470, 55, 250, 30);
        add(lblQueueSection);

        lblTreatment = new JLabel("Treatment:");
        lblTreatment.setBounds(470, 85, 110, 30);
        add(lblTreatment);

        txtTreatment = new JTextField();
        txtTreatment.setBounds(585, 85, 195, 30);
        add(txtTreatment);

        btnTreatNext = new JButton("Treat Next");
        btnTreatNext.setBounds(470, 125, 150, 30);
        add(btnTreatNext);

        btnShowQueue = new JButton("Show Queue");
        btnShowQueue.setBounds(630, 125, 150, 30);
        add(btnShowQueue);

        btnMyPatients = new JButton("My Patients");
        btnMyPatients.setBounds(470, 165, 150, 30);
        add(btnMyPatients);

        btnDoctorReport = new JButton("My Report");
        btnDoctorReport.setBounds(630, 165, 150, 30);
        add(btnDoctorReport);

        btnSummaryReport = new JButton("Summary Report");
        btnSummaryReport.setBounds(470, 205, 150, 30);
        add(btnSummaryReport);

        btnResetForm = new JButton("Reset Form");
        btnResetForm.setBounds(630, 205, 150, 30);
        add(btnResetForm);

        btnBack = new JButton("Back");
        btnBack.setBounds(470, 245, 310, 30);
        add(btnBack);

        
        txaOutput = new JTextArea();
        txaOutput.setBounds(50, 365, 730, 265);
        txaOutput.setEditable(false);
        add(txaOutput);

        
        btnAddDoctor.addActionListener(this);
        btnUpdateDoctor.addActionListener(this);
        btnDeleteDoctor.addActionListener(this);
        btnSearchDoctor.addActionListener(this);
        btnSearchPatient.addActionListener(this);
        btnPatientRecord.addActionListener(this);
        btnTreatNext.addActionListener(this);
        btnShowQueue.addActionListener(this);
        btnMyPatients.addActionListener(this);
        btnDoctorReport.addActionListener(this);
        btnSummaryReport.addActionListener(this);
        btnResetForm.addActionListener(this);
        btnBack.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAddDoctor){
        }else if(e.getSource() == btnUpdateDoctor){

        }else if(e.getSource() == btnDeleteDoctor){
        }else if(e.getSource() == btnSearchDoctor){
        }else if(e.getSource() == btnSearchPatient){
        }else if(e.getSource() == btnPatientRecord){

        }else if(e.getSource() == btnTreatNext){
        }else if(e.getSource() == btnShowQueue){

        }else if(e.getSource() == btnMyPatients){
        }else if(e.getSource() == btnDoctorReport){

        }else if(e.getSource() == btnSummaryReport){
        }else if(e.getSource() == btnResetForm){
            txtDoctorId.setText("");
            txtDoctorName.setText("");
            txtSpecialty.setText("");

            txtFindPatient.setText("");
            txtTreatment.setText("");

            txaOutput.setText("");
        }else if(e.getSource() == btnBack){
            Hospitalmanagement home = new Hospitalmanagement();
            home.setVisible(true);
            dispose();
        }

    }
}
