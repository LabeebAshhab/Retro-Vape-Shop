package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

public class CustomerLoginPage extends JFrame {
  private Container c;
  private ImageIcon icon, img, homeLogo, login, signup;
  private JLabel imgLabel, cEmail, cPass, cReg, customerLoginLabel, emailPlaceLabel, passPlaceLabel;
  private JTextField cEmailTf;
  private JPasswordField cPassPf;
  private JButton cLoginBtn, cNewAccBtn, cLoginHomePageBtn;
  private Font font;

  public CustomerLoginPage() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1065, 650);
    setTitle("Customer Login");
    setLayout(null);
    setVisible(true);
    setResizable(false);
    setLocationRelativeTo(null);

    c = getContentPane();
    c.setLayout(null);
    c.setBackground(Color.decode("#60a9f7"));

    // Icon
    icon = new ImageIcon(getClass().getResource("/images/iconF.png"));
    setIconImage(icon.getImage());

    // Images Background image
    img = new ImageIcon(getClass().getResource("/images/customerLogin.png"));
    imgLabel = new JLabel(img);
    imgLabel.setBounds(-70, 0, img.getIconWidth(), img.getIconHeight());
    c.add(imgLabel);

    // Font
    font = new Font("Segoe UI Black", Font.BOLD, 15);

    // Home Button Logo
    homeLogo = new ImageIcon(getClass().getResource("/images/homeButton.png"));
    cLoginHomePageBtn = new JButton(homeLogo);
    cLoginHomePageBtn.setBounds(675, 9, 24, 24);
    cLoginHomePageBtn.setFocusPainted(false);
    cLoginHomePageBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    cLoginHomePageBtn.setContentAreaFilled(false);
    cLoginHomePageBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    imgLabel.add(cLoginHomePageBtn);
    c.add(cLoginHomePageBtn);

    // Email
    cEmail = new JLabel("Enter your email");
    cEmail.setFont(font);
    cEmailTf = new JTextField();
    cEmail.setBounds(700, 160, 160, 40);
    cEmailTf.setFont(new Font("Arial", Font.PLAIN, 15));
    cEmailTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    cEmail.setVisible(true);
    cEmailTf.setBounds(700, 190, 200, 40);
    cEmailTf.setBorder(null);
    cEmailTf.setBorder(null);
    cEmailTf.setOpaque(false);
    c.add(cEmail);
    c.add(cEmailTf);

    // Password
    cPass = new JLabel("Enter Password");
    cPass.setFont(font);
    cPassPf = new JPasswordField();
    cPass.setBounds(700, 250, 160, 40);
    cPassPf.setBounds(700, 280, 200, 40);
    cPassPf.setFont(new Font("Arial", Font.PLAIN, 15));
    cPassPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    cPassPf.setBorder(null);
    cPassPf.setBorder(null);
    cPassPf.setOpaque(false);
    c.add(cPass);
    c.add(cPassPf);

    login = new ImageIcon(getClass().getResource("/images/Login Button.png"));

    // Customer Login
    cLoginBtn = new JButton(login);
    cLoginBtn.setBounds(820, 330, 127, 47);
    cLoginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    cLoginBtn.setFocusPainted(false);
    cLoginBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    cLoginBtn.setContentAreaFilled(false);
    c.add(cLoginBtn);

    signup = new ImageIcon(getClass().getResource("/images/Signup Button.png"));

    // Registration Form
    cReg = new JLabel("Don't have an account yet?");
    cReg.setBounds(700, 550, 200, 50);
    cReg.setFont(new Font("Segoe UI", Font.BOLD, 15));
    cNewAccBtn = new JButton(signup);
    cNewAccBtn.setBounds(910, 550, 135, 50);
    cNewAccBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    c.add(cReg);
    c.add(cNewAccBtn);

    // Extra
    customerLoginLabel = new JLabel("Hello there!");
    customerLoginLabel.setBounds(905, 1, 400, 50);
    customerLoginLabel.setFont(new Font("Segoe UI", Font.BOLD, 25));
    c.add(customerLoginLabel);

    emailPlaceLabel = new JLabel("____________________________________");
    emailPlaceLabel.setBounds(700, 200, 400, 40);
    emailPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    c.add(emailPlaceLabel);

    passPlaceLabel = new JLabel("____________________________________");
    passPlaceLabel.setBounds(700, 290, 400, 40);
    passPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    c.add(passPlaceLabel);

    // Action Listener for Home Page Button
    cLoginHomePageBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        HomePage frame = new HomePage();
        frame.setVisible(true);
      }
    });

    cLoginBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        String cEmailStore = cEmailTf.getText();
        char[] cPassChars = cPassPf.getPassword();
        String cPassStore = new String(cPassChars);

        if (cEmailStore.isEmpty() || cPassStore.isEmpty()) {
          JOptionPane.showMessageDialog(null, "Please fill in all the fields.", "Warning!",
              JOptionPane.WARNING_MESSAGE);
        } else {
          try {
            String cEmail = "Email: " + cEmailStore;
            String cPass = "Password: " + cPassStore;
            BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\customer_data.txt"));

            int totalLines = 0;
            while (reader.readLine() != null) {
              totalLines++;
            }
            reader.close();

            boolean loggedIn = false; // Flag to check if user is logged in

            for (int i = 0; i < totalLines-4; i ++) {
              String line = Files.readAllLines(Paths.get(".\\Data\\customer_data.txt")).get(i + 1);
			  String line2 = Files.readAllLines(Paths.get(".\\Data\\customer_data.txt")).get(i + 4);

              if (line.equals(cEmail)&& line2.equals(cPass) ) {
                
                  loggedIn = true;
                  setVisible(false);
                  CustomerDashBoard frame = new CustomerDashBoard();
                  frame.setVisible(true);
                  break;
                
              }
            }

            if (!loggedIn) {
              JOptionPane.showMessageDialog(null, "Invalid Email or Password", "Warning",
                  JOptionPane.WARNING_MESSAGE);
            }
          } catch (Exception ex) {
            ex.printStackTrace();
          }
        }
      }
    });

    // Action Listener for new account registration
    cNewAccBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        CustomerRegistrationForm cR = new CustomerRegistrationForm();
        cR.setVisible(true);
      }
    });
  }

  public static void main(String[] args) {
    CustomerLoginPage Frame = new CustomerLoginPage();
    Frame.setVisible(true);
  }
}
