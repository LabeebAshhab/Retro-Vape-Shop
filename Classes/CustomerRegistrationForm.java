package Classes;

import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;  //For border
import javax.swing.border.Border;  //For border
import java.io.*;  //Field Backgorund/ Foreground color
import static javax.swing.JOptionPane.showMessageDialog;  //Panal Message
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

import Classes.*;

public class CustomerRegistrationForm extends JFrame
{
    private Container c;
    private ImageIcon icon, homeLogo, submit, img;
    private JLabel imgLabel, cNameReg, cPhnNumReg, cEmailReg, cAddressReg, cCreatePass, cConfirmPass, createAccLabel, startLabel;
    private JTextField cNameRegTf, cPhnNumRegTf, cEmailRegTf;
    private JTextArea cAddressRegTa;
    private JPasswordField cCreatePassPf, cConfirmPassPf;
    private JButton cRegExit, cRegSubmitBtn;
    private JScrollPane scroll;
    private Font font;


    public CustomerRegistrationForm()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1065, 650);
        this.setTitle("Create an User Account");
        this.setLayout(null);
        this.setVisible(true);


        this.setResizable(false);
        this.setLocationRelativeTo(null);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#60a9f7"));


        //Icon
        icon = new ImageIcon(getClass().getResource("/images/iconF.png"));
        this.setIconImage(icon.getImage());
		
		//Logo and images
		img = new ImageIcon(getClass().getResource("/images/signUp.png"));
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		c.add(imgLabel);

		font = new Font(/*Font Name*/ "Times New Roman", Font.PLAIN, /*Font Size*/ 15);

        //Home Button Logo
        homeLogo = new ImageIcon(getClass().getResource("/images/Previous.png"));
        //Admin Login Page to Home Page Button
        cRegExit = new JButton(homeLogo);
        cRegExit.setBounds(20, 20,homeLogo.getIconWidth(), homeLogo.getIconHeight());
		cRegExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cRegExit.setFocusPainted(false);
        cRegExit.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cRegExit.setContentAreaFilled(false);
        imgLabel.add(cRegExit);


        //Action Listener for previous
        cRegExit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new CustomerLoginPage();

            }
        });

        //Name
        cNameReg = new JLabel("Name");
        cNameReg.setFont(font);
        cNameRegTf = new JTextField();
        cNameRegTf.setBounds(570, 110, 200, 40);
		cNameReg.setBounds(570, 80, 160, 40);
		cNameRegTf.setForeground(Color.BLACK);
		cNameRegTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cNameRegTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cNameRegTf.setCaretColor(Color.BLACK);
        c.add(cNameReg);
        c.add(cNameRegTf);



        //Phone Number
        cPhnNumReg = new JLabel("Phone Number");
        cPhnNumReg.setFont(font);
        cPhnNumRegTf = new JTextField();
        cPhnNumRegTf.setBounds(570, 180, 200, 40);
		cPhnNumReg.setBounds(570, 150, 160, 40);
		setForeground(Color.BLACK);
		cPhnNumRegTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cPhnNumRegTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cPhnNumRegTf.setCaretColor(Color.BLACK);
        c.add(cPhnNumReg);
        c.add(cPhnNumRegTf);



        //Email
        cEmailReg = new JLabel("Email");
        cEmailReg.setFont(font);
        cEmailRegTf = new JTextField();
        cEmailRegTf.setBounds(800, 180, 200, 40);
		cEmailReg.setBounds(800, 150, 160, 40);
		cEmailRegTf.setForeground(Color.BLACK);
		cEmailRegTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cEmailRegTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cEmailRegTf.setCaretColor(Color.BLACK);
        c.add(cEmailReg);
        c.add(cEmailRegTf);



        //Adress
		
		cAddressReg = new JLabel("Address");
		cAddressRegTa = new JTextArea();
        cAddressReg.setFont(font);
        scroll = new JScrollPane(cAddressRegTa);
        scroll.setBounds(570, 250, 400, 70);
		cAddressReg.setBounds(570, 220, 160, 40);
		cAddressRegTa.setLineWrap(true);    //For this when line is complete then next line start
        cAddressRegTa.setWrapStyleWord(true);   //When line is complete then word is strat form next line
		cAddressRegTa.setForeground(Color.BLACK);
		cAddressRegTa.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cAddressRegTa.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cAddressRegTa.setCaretColor(Color.BLACK);
        c.add(cAddressReg);
        c.add(scroll);



        //Password Create
        cCreatePass = new JLabel("Password");
        cCreatePass.setFont(font);
        cCreatePassPf = new JPasswordField();
        cCreatePassPf.setBounds(570, 350, 200, 40);
		cCreatePass.setBounds(570, 320, 160, 40);
		cCreatePassPf.setForeground(Color.BLACK);
		cCreatePassPf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cCreatePassPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cCreatePassPf.setCaretColor(Color.BLACK);
        c.add(cCreatePass);
        c.add(cCreatePassPf);



        //Confirm Password
    
		
		cConfirmPass = new JLabel("Confirm Password");
        cConfirmPass.setFont(font);
        cConfirmPassPf = new JPasswordField();
        cConfirmPassPf.setBounds(570, 420, 200, 40);
		cConfirmPass.setBounds(570, 390, 160, 40);
		cConfirmPassPf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cConfirmPassPf.setForeground(Color.BLACK);
		cConfirmPassPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cConfirmPassPf.setCaretColor(Color.BLACK);
        c.add(cConfirmPass);
        c.add(cConfirmPassPf);



        //Submit Button
        cRegSubmitBtn = new JButton("Submit");
        cRegSubmitBtn.setBounds(800, 420, 140,40);		
        cRegSubmitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));		
        cRegSubmitBtn.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        cRegSubmitBtn.setBackground(Color.decode("#4CBB17"));
		
        //cRegSubmitBtn.setBackground(Color.decode("#F2F2F2"));
        c.add(cRegSubmitBtn);
		
		//extra
		
		createAccLabel = new JLabel("Create a new account");
		createAccLabel.setBounds(565, 0, 380, 80);
		createAccLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));
		c.add(createAccLabel);
		
		startLabel = new JLabel("Let's get Started");
		startLabel.setBounds(566, 20, 380, 90);
		startLabel.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		c.add(startLabel);




        //Action Listener for submit button (Registation Page to customer login page)
        cRegSubmitBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String cNameStore = cNameRegTf.getText();  //Name
				
                int cPhoneNumberStore;
				try {
				cPhoneNumberStore = Integer.parseInt(cPhnNumRegTf.getText());   //Phone Number
				}
				catch (NumberFormatException ex) {JOptionPane.showMessageDialog(null, "Invalid Phone Number"); return;} 
				catch (IllegalArgumentException ex) {JOptionPane.showMessageDialog(null, ex.getMessage()); return;}
                String cEmailStore = cEmailRegTf.getText();   //Email
                String cAddressStore = cAddressRegTa.getText();   //address
                String cCreatePassStore = cCreatePassPf.getText();   //Create password
                String cConfirmPassStore = cConfirmPassPf.getText();   //Confim Password

              if(cCreatePassStore.equals(cConfirmPassStore))
                {
                    if(cNameStore.isEmpty() || cEmailStore.isEmpty() ||  cAddressStore.isEmpty() || cCreatePassStore.isEmpty() || cConfirmPassStore.isEmpty())
                    {
                        showMessageDialog(null, "Please fill all of the fields.", "WARNING", JOptionPane.WARNING_MESSAGE);
                    }

                    else
                    {
                        try
                        {
                            File file = new File(".\\Data\\customer_data.txt");
                            if(!file.exists())
                            {
                                file.createNewFile();
                            }

                            FileWriter fileWriter = new FileWriter(file, true);
                            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                            PrintWriter printWriter = new PrintWriter(bufferedWriter);

                            LocalDateTime myDateObj = LocalDateTime.now();
                            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                            String timeAndDate = myDateObj.format(myFormatObj);
                           
                            printWriter.println("Customer Name: "+cNameStore);
                            printWriter.println("Email: " +cEmailStore);
                            printWriter.println("Phone Number: "+cPhoneNumberStore);
                            printWriter.println("Address: "+cAddressStore);
                            printWriter.println("Password: "+cCreatePassStore);
                            printWriter.println("Time & Date: "+timeAndDate);
                            printWriter.println("===============================================");
                            printWriter.println("===============================================");
                            printWriter.close();

                        }

                        catch (Exception ex)
                        {
                            System.out.print(ex);
                        }

                        //showMessageDialog(null, cNameStore, "Registration Complete", JOptionPane.WARNING_MESSAGE);
                        showMessageDialog(null, "Registration Successful", "Registration Complete", JOptionPane.WARNING_MESSAGE);
                        setVisible(false);
                        new CustomerLoginPage();
                    }

                }

               else
               {
                   showMessageDialog(null, "Password not same", "WARNING", JOptionPane.WARNING_MESSAGE);
                }
            }

        });



    }

        public static void main(String[] args)
        {
            //setVisible(false);
            CustomerRegistrationForm frame = new CustomerRegistrationForm();
            frame.setVisible(true);
        }



}
