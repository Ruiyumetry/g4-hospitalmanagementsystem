package com.mycompany.hospitalmanagementapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Loginform extends JFrame implements ActionListener {

    private JLabel hdrLogin, lblUsername, lblPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin, btnExit;

    Loginform() {
        setTitle("Admin Login");
        setSize(500, 350);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        hdrLogin = new JLabel("Hospital Management System - Admin Login");
        hdrLogin.setBounds(100, 30, 320, 30);
        add(hdrLogin);

        lblUsername = new JLabel("Username:");
        lblUsername.setBounds(80, 100, 100, 30);
        add(lblUsername);

        txtUsername = new JTextField();
        txtUsername.setBounds(180, 100, 220, 30);
        add(txtUsername);

        lblPassword = new JLabel("Password:");
        lblPassword.setBounds(80, 150, 100, 30);
        add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(180, 150, 220, 30);
        add(txtPassword);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(110, 230, 120, 35);
        add(btnLogin);

        btnExit = new JButton("Exit");
        btnExit.setBounds(260, 230, 120, 35);
        add(btnExit);

        // Add to ActionListener
        btnLogin.addActionListener(this);
        btnExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            String username = txtUsername.getText().trim();
            String password = new String(txtPassword.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter username and password.");
                return;
            }

            // TODO: verify admin account from the database (next step)
            Hospitalmanagement menu = new Hospitalmanagement();
            menu.setVisible(true);
            dispose();

        } else if (e.getSource() == btnExit) {
            System.exit(0);
        }
    }
}