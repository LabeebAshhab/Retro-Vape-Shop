package Classes;

import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import Classes.*;

public class AdminDashBoard extends JFrame {
    private Container c;
    private ImageIcon icon, bgPictureImg, sellsIcon, logoutIcon, cDataForAdminIcon, cAddIcon, adminDataIcon, adminAddIcon;
    private JLabel dashBoard, cDataForAdmin, adminIconLabel, bgPicture, cAdd, adminAdd, adminDataLabel;
    private JButton sellsBtn, logoutBtn, cDataForAdminBtn, cAddBtn, adminDataBtn, adminAddBtn;
    

    public AdminDashBoard()
    {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setUndecorated(true);
        this.setSize(1065, 650);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("Admin DashBoard");


        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#60a9f7")); 

        //Icon
        icon = new ImageIcon(getClass().getResource("/images/iconF.png"));
        this.setIconImage(icon.getImage());


        //Background Picture
        bgPictureImg = new ImageIcon(getClass().getResource("/images/es/Admin DBG.jpg"));
        bgPicture = new JLabel(bgPictureImg);
        bgPicture.setBounds(0, 0, bgPictureImg.getIconWidth(), bgPictureImg.getIconHeight());
        c.add(bgPicture);


       


        //logout Button
        logoutIcon = new ImageIcon(getClass().getResource("/images/return.png"));
        logoutBtn = new JButton(logoutIcon);
		logoutBtn.setBounds(950, 20, 140, 40);
		logoutBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
		logoutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logoutBtn.setFocusPainted(false);
        logoutBtn.setContentAreaFilled(false);
        c.add(logoutBtn);
		//Sells Info Btn
		sellsIcon = new ImageIcon(getClass().getResource("/images/SellsIn.png"));
        sellsBtn = new JButton(sellsIcon);
		sellsBtn.setBounds(950, 80, 140, 40);
		sellsBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
		sellsBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sellsBtn.setFocusPainted(false);
        sellsBtn.setContentAreaFilled(false);
        c.add(sellsBtn);


        //Font for all button labeing
        Font labelFont = new Font("Segoe UI", Font.BOLD, 18);


        

        cDataForAdmin = new JLabel("Customer Data");
        cDataForAdmin.setBounds(720, 230, 20, 50);
        cDataForAdmin.setFont(labelFont);
        c.add(cDataForAdmin);
    

        //Customer Data Icon
        cDataForAdminIcon = new ImageIcon(getClass().getResource("/images/Customer DB.png"));
        

        //Customer data button
        cDataForAdminBtn = new JButton(cDataForAdminIcon);
        cDataForAdminBtn.setBounds(750, 210, cDataForAdminIcon.getIconWidth(), cDataForAdminIcon.getIconHeight());
		cDataForAdminBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cDataForAdminBtn.setFocusPainted(false);
        cDataForAdminBtn.setContentAreaFilled(false);
        cDataForAdmin = new JLabel("Customer Data");
        cDataForAdmin.setBounds(780, 370, 200, 50);
        cDataForAdmin.setFont(labelFont);
        c.add(cDataForAdminBtn);
        c.add(cDataForAdmin);



        //admin Information
        adminDataIcon = new ImageIcon(getClass().getResource("/images/Admin DB.png"));

        adminDataBtn = new JButton(adminDataIcon);
        adminDataBtn.setBounds(750, 10, adminDataIcon.getIconWidth(), adminDataIcon.getIconHeight());		
		adminDataBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        adminDataBtn.setFocusPainted(false);
        adminDataBtn.setContentAreaFilled(false);
        c.add(adminDataBtn);
		
		adminDataLabel = new JLabel("Admin Data");
        adminDataLabel.setBounds(780, 180, 170, 20);
		adminDataLabel.setFont(labelFont);
        c.add(adminDataLabel);


        //Admin Add 
        adminAddIcon = new ImageIcon(getClass().getResource("/images/Add Admin B.png"));
        adminAddBtn = new JButton(adminAddIcon);
        adminAddBtn.setBounds(750, 410, adminAddIcon.getIconWidth(), adminAddIcon.getIconHeight());
		adminAddBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        adminAddBtn.setFocusPainted(false);
        adminAddBtn.setContentAreaFilled(false);
        adminAddBtn.setBackground(Color.decode("#FFFFFF"));
        c.add(adminAddBtn);



        //Admin Add Label
        adminAdd = new JLabel("Add Admin");
        adminAdd.setBounds(780, 580, 170, 20);
		adminAdd.setFont(labelFont);
        c.add(adminAdd);
        





        //Action Listener 

        //logout button
        logoutBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new AdminLoginPage();
            }
        });
		
		//sells Btn Ae
		sellsBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new SellsInfo();
            }
        });


        cDataForAdminBtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new CustomerDataForAdmin();
            }    
        });

        



        adminAddBtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new AddAdmin();
            }    
        });


        adminDataBtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae)
            {
              setVisible(false);
              new AdminData();  
            }    
        });


    


    }

    public static void main(String[] args) {
        AdminDashBoard frame = new AdminDashBoard();
        frame.setVisible(true);
    }
}
