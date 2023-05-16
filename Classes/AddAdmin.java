package Classes;

import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;  
import javax.swing.border.Border;  
import java.io.*;  
import static javax.swing.JOptionPane.showMessageDialog; 
import java.nio.file.*;
import Classes.*;

public class AddAdmin extends JFrame
{
    private Container c;
    private ImageIcon icon, addAdminBgImg, previousIcon, signOutLogo;
    private JLabel title, addAdminID, addAdminBg, name,password, cofirmPassword, namePlaceLabel, idPlaceLabel,passPlaceLabel, cPasssPlaceLabel;
    private JTextField nameTf, addAdminIDTf;
	private JPasswordField passwordPf, confirmPasswordPf;
	private JButton confirmBtn, previousBtn, signOutBtn;


    public AddAdmin()
    {
       
        this.setSize(1065, 650);
        this.setTitle("Retro Vape Shop");
        this.setLayout(null);
        this.setVisible(true);


        this.setResizable(false);
        this.setLocationRelativeTo(null);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		//Backgroud coloring
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.decode("#3944BC"));


        //Icon
        icon = new ImageIcon(getClass().getResource("/images/iconF.png"));
        this.setIconImage(icon.getImage());

        Font font = new Font(/*Font Name*/ "Times New Roman", Font.BOLD, /*Font Size*/ 20);

        //Admin ID 
        addAdminID = new JLabel("");
        addAdminID.setBounds(670, 30, 60, 30);
        addAdminID.setFont(font);
        c.add(addAdminID);
        

        //image
        addAdminBgImg = new ImageIcon(getClass().getResource("/images/Add Admin Bg.png"));
        addAdminBg = new JLabel(addAdminBgImg);
        addAdminBg.setBounds(-30,0, addAdminBgImg.getIconWidth(), addAdminBgImg.getIconHeight());
        c.add(addAdminBg);

        //Title
        title = new JLabel("");
        title.setBounds(250, 20, 600, 30);
        Font titleFont = new Font(/*Font Name*/ "Times New Roman", Font.BOLD, /*Font Size*/ 40);
        title.setFont(titleFont);
        addAdminBg.add(title);

        //Admin ID
		
		addAdminID = new JLabel("ID");
		addAdminIDTf = new JTextField();
		addAdminID.setFont(font);
		addAdminID.setBounds(730, 190, 60, 60);
		addAdminID.setForeground(Color.WHITE);   
		addAdminIDTf.setBounds(730, 230, 200, 40);
		addAdminIDTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		addAdminIDTf.setForeground(Color.white);
		addAdminIDTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		addAdminIDTf.setCaretColor(Color.white);
		addAdminID.setVisible(true);
		addAdminIDTf.setVisible(true);
		addAdminIDTf.setBorder(null);
		addAdminIDTf.setOpaque(false);
		c.add(addAdminID);
		c.add(addAdminIDTf);
		
		
		//name
		
		name = new JLabel("Name");
        name.setFont(font);
        name.setForeground(Color.WHITE);
        nameTf = new JTextField();
        nameTf.setBounds(730, 150, 200, 40);
		name.setBounds(730, 120, 160, 40);
		nameTf.setForeground(Color.WHITE);
		nameTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		nameTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		nameTf.setCaretColor(Color.BLACK);
		nameTf.setVisible(true);
		nameTf.setBorder(null);
		nameTf.setOpaque(false);
        c.add(name);
        c.add(nameTf);
		
		//password		
		password = new JLabel("Password");
        password.setFont(font);
        password.setForeground(Color.WHITE);
        passwordPf = new JPasswordField();
        passwordPf.setBounds(730, 315, 200, 40);
		password.setBounds(730, 285, 160, 40);
		passwordPf.setForeground(Color.WHITE);
		passwordPf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		passwordPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		passwordPf.setCaretColor(Color.WHITE);
		passwordPf.setVisible(true);
		passwordPf.setBorder(null);
		passwordPf.setOpaque(false);
        c.add(password);
        c.add(passwordPf);
		
		//confirm pass		
		cofirmPassword = new JLabel("Confirm Password");
        cofirmPassword.setFont(font);
        cofirmPassword.setForeground(Color.WHITE);
        confirmPasswordPf = new JPasswordField();
        confirmPasswordPf.setBounds(730, 395, 200, 40);
		cofirmPassword.setBounds(730, 365, 160, 40);
		confirmPasswordPf.setForeground(Color.WHITE);
		confirmPasswordPf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		confirmPasswordPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		confirmPasswordPf.setCaretColor(Color.WHITE);
		confirmPasswordPf.setVisible(true);
		confirmPasswordPf.setBorder(null);
		confirmPasswordPf.setOpaque(false);
        c.add(cofirmPassword);
        c.add(confirmPasswordPf);
		
		//Button confirmBtn
		
		confirmBtn = new JButton("Confirm");
        confirmBtn.setBounds(780, 490, 140,35);		
        confirmBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));		
        confirmBtn.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        confirmBtn.setBackground(Color.decode("#4CBB17"));
        c.add(confirmBtn);
		
	
		
		namePlaceLabel = new JLabel("____________________________________");
		namePlaceLabel.setBounds(730, 160, 400, 40);
		namePlaceLabel.setForeground(Color.white);
		namePlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		c.add(namePlaceLabel);
		
		idPlaceLabel = new JLabel("____________________________________");
		idPlaceLabel.setBounds(730, 240, 400, 40);
		idPlaceLabel.setForeground(Color.white);
		idPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		c.add(idPlaceLabel);
		
		passPlaceLabel = new JLabel("____________________________________");
		passPlaceLabel.setBounds(730, 325, 400, 40);
		passPlaceLabel.setForeground(Color.white);
		passPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		c.add(passPlaceLabel);
		
		cPasssPlaceLabel = new JLabel("____________________________________");
		cPasssPlaceLabel.setBounds(730, 405, 400, 40);
		cPasssPlaceLabel.setForeground(Color.white);
		cPasssPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		c.add(cPasssPlaceLabel);
		
		//Home Button Logo
        previousIcon = new ImageIcon(getClass().getResource("/images/Previous.png"));
        //Admin Login Page to Home Page Button
        previousBtn = new JButton(previousIcon);
        previousBtn.setBounds(50, 20,previousIcon.getIconWidth(), previousIcon.getIconHeight());
		previousBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        previousBtn.setFocusPainted(false);
        previousBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        previousBtn.setContentAreaFilled(false);
        addAdminBg.add(previousBtn);
		
		//SignOut Button Logo
        signOutLogo = new ImageIcon(getClass().getResource("/images/logout.png"));
        //Admin Login Page to Home Page Button
        signOutBtn = new JButton(signOutLogo);
        signOutBtn.setBounds(990, 30,signOutLogo.getIconWidth(), signOutLogo.getIconHeight());
		signOutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signOutBtn.setFocusPainted(false);
        signOutBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        signOutBtn.setContentAreaFilled(false);
        c.add(signOutBtn);

        previousBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				setVisible(false);
				AdminDashBoard frame = new AdminDashBoard();
				frame.setVisible(true);
			}
		});


		signOutBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				setVisible(false);
				AdminLoginPage frame = new AdminLoginPage();
				frame.setVisible(true);
			}
		});

        confirmBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String nameStore = nameTf.getText();
                String IDStore = addAdminIDTf.getText();
                String passwordStore = passwordPf.getText();
                String confirmPasswordStore = confirmPasswordPf.getText();

                if(passwordStore.equals(confirmPasswordStore))
                {
                    if(nameStore.isEmpty() || IDStore.isEmpty() || passwordStore.isEmpty() || confirmPasswordStore.isEmpty())
                    {
                        showMessageDialog(null, "Please fill all of the fields.", "WARNING", JOptionPane.WARNING_MESSAGE);
                    }
                    
                    else
                    {
                        try 
                    {
                        File file = new File(".\\Data\\admin_data.txt");
                        if(!file.exists())
                        {
                            file.createNewFile();
                        }

                        FileWriter fileWriter = new FileWriter(file, true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        PrintWriter printWriter = new PrintWriter(bufferedWriter);

                        printWriter.println("Admin Name: "+nameStore);
                        printWriter.println("ID: "+IDStore);
                        printWriter.println("Password: "+passwordStore);
                        printWriter.println("===============================================");
                        printWriter.close();

                        showMessageDialog(null, "Admin Regestration Successful", "Regestration Confirmation", -1);
                        setVisible(false);
                        new AdminLoginPage();

                    }

                    catch (Exception ex)
                    {
                        System.out.println(ex);
                    }
                    }
                }
            

                else 
                {
                    showMessageDialog(null, "Password not same", "WARNING", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
}
