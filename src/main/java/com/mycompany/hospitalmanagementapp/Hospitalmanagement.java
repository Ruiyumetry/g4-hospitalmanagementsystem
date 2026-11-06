
package com.mycompany.hospitalmanagementapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Hospitalmanagement extends JFrame implements ActionListener{

    private JLabel hdrHospital, lblChooseRole;
    private JButton btnPatient, btnDoctor, btnExit;


    Hospitalmanagement(){
        setTitle("Hospital Management System");
        setSize(500, 350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        hdrHospital = new JLabel("Hospital Management System");
        hdrHospital.setBounds(150, 40, 250, 30);
        add(hdrHospital);

        lblChooseRole = new JLabel("Please select your role:");
        lblChooseRole.setBounds(170, 100, 200, 30);
        add(lblChooseRole);

        btnPatient = new JButton("Patient");
        btnPatient.setBounds(80, 150, 150, 50);
        add(btnPatient);

        btnDoctor = new JButton("Doctor");
        btnDoctor.setBounds(260, 150, 150, 50);
        add(btnDoctor);

        btnExit = new JButton("Exit");
        btnExit.setBounds(190, 240, 120, 30);
        add(btnExit);

        // Add to ActionListener
        btnPatient.addActionListener(this);
        btnDoctor.addActionListener(this);
        btnExit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnPatient){
            patientportal patient = new patientportal();
            patient.setVisible(true);
            dispose();
        }else if(e.getSource() == btnDoctor){
            doctorportal doctor = new doctorportal();
            doctor.setVisible(true);
            dispose();

        }else if(e.getSource() == btnExit){
            System.exit(0);
        }

    }
}
