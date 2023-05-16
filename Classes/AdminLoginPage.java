package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import static javax.swing.JOptionPane.showMessageDialog;

import Classes.*;


public class AdminLoginPage extends JFrame
{
  private Container c;
  private ImageIcon img, icon, homeLogo, login;
  private JLabel adminIDLabel, adminPassLabel, imgLabel, idPlaceLabel, passPlaceLabel, adminLogInLabel;
  private JTextField adminIDTf;
  private JPasswordField adminPassPf;
  private JButton adminLoginBtn, adminLoginHomePageBtn;
  private Font font;
  

  public AdminLoginPage()
  {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1065, 650);
    this.setLayout(null);
    this.setVisible(true);
    this.setTitle("Admin Login Page");

    //Page design
    this.setLocationRelativeTo(null);
    this.setResizable(false);


    //Backgroud coloring
    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.decode("#60a9f7"));

	
	font = new Font(/*Font Name*/ "Times New Roman", Font.BOLD, /*Font Size*/ 15);

    //Icon
    icon = new ImageIcon(getClass().getResource("/images/iconF.png"));
    this.setIconImage(icon.getImage());


    //Backgound images
    img = new ImageIcon(getClass().getResource("/images/Admin LBG.jpg"));
    imgLabel = new JLabel(img);
    imgLabel.setBounds(-20, -20, 700,700);
    c.add(imgLabel);



    //Home Button Logo
    homeLogo = new ImageIcon(getClass().getResource("/images/HBL.png"));
    adminLoginHomePageBtn = new JButton(homeLogo);
    adminLoginHomePageBtn.setBounds(1000, 20,homeLogo.getIconWidth(), homeLogo.getIconHeight());
	adminLoginHomePageBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
	adminLoginHomePageBtn.setContentAreaFilled(false);
	adminLoginHomePageBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    adminLoginHomePageBtn.setFocusPainted(false);
    c.add(adminLoginHomePageBtn);
	




    //Admin ID
    adminIDLabel = new JLabel("Admin ID");
    adminIDTf = new JTextField();
	adminIDLabel.setFont(font);
    adminIDLabel.setBounds(700, 190, 80, 60);
    adminIDLabel.setForeground(Color.WHITE);
    
    adminIDTf.setBounds(700, 230, 200, 40);

	adminIDTf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
    adminIDTf.setForeground(Color.white);
    adminIDTf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    adminIDTf.setCaretColor(Color.white);
	
    adminIDLabel.setVisible(true);
    adminIDTf.setVisible(true);
	adminIDTf.setBorder(null);
	adminIDTf.setBorder(null);
    adminIDTf.setOpaque(false);
    c.add(adminIDLabel);
    c.add(adminIDTf);

	  



    //Admin Password
    adminPassLabel = new JLabel("Password");
    adminPassPf = new JPasswordField();
    adminPassLabel.setBounds(700, 280, 70, 60);
    adminPassLabel.setForeground(Color.WHITE);
    adminPassPf.setBounds(700, 320, 200, 40);
	
	adminPassPf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
    adminPassPf.setForeground(Color.white);
    adminPassPf.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    adminPassPf.setCaretColor(Color.white);
	
	adminPassPf.setBorder(null);
	adminPassLabel.setFont(font);
	adminPassPf.setBorder(null);
    adminPassPf.setOpaque(false);
    c.add(adminPassLabel);
    c.add(adminPassPf);
	
	  


    //Login button logo
    login = new ImageIcon(getClass().getResource("/images/es/ALB.png"));


    //Admin Login button
    adminLoginBtn = new JButton(login);
    adminLoginBtn.setBounds(800,440,login.getIconWidth(),login.getIconHeight());
	adminLoginBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
	adminLoginBtn.setContentAreaFilled(false);
	adminLoginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    adminLoginBtn.setFocusPainted(false);
    //adminLoginBtn.setBackground(Color.decode("#3944BC"));
    c.add(adminLoginBtn);
	
	
	//Extra Work
	idPlaceLabel = new JLabel("_______________________________");
    idPlaceLabel.setBounds(700, 240, 400, 40);
    idPlaceLabel.setForeground(Color.white);
    idPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	//idPlaceLabel.setBounds(770, 180, 200, 40);
	c.add(idPlaceLabel);
	
	passPlaceLabel = new JLabel("______________________________");
    passPlaceLabel.setBounds(700, 330, 400, 40);
    passPlaceLabel.setForeground(Color.white);
    passPlaceLabel.setCursor(new Cursor(Cursor.TEXT_CURSOR));
	//passPlaceLabel.setBounds(770, 180, 200, 40);
	c.add(passPlaceLabel);
	
	
	adminLogInLabel = new JLabel("Login As an Admin");
	adminLogInLabel.setBounds(730, 80, 400, 100);
	adminLogInLabel.setFont(new Font("Segoe UI", Font.BOLD, 25));
    adminLogInLabel.setForeground(Color.WHITE);
	c.add(adminLogInLabel);

 

    //Action Listener start

    //Action Listener for Home Page Button
    adminLoginHomePageBtn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        setVisible(false);
        HomePage frame = new HomePage();
        frame.setVisible(true);
      }
    });

    

    //Action Listener for login button
    adminLoginBtn.addActionListener(new ActionListener()
    {

      public void actionPerformed(ActionEvent ae)
      {
        String adminIdStore = adminIDTf.getText();   
        String adminPassStore = adminPassPf.getText();  

        if(adminIdStore.isEmpty() || adminPassStore.isEmpty())
	      {
         
          showMessageDialog(null, "Please fill all of the fields.", "Warning!", JOptionPane.WARNING_MESSAGE);
	      }

        else
        {
          try 
          {
            String adminId = "ID: "+adminIdStore; 
            String adminPass = "Password: "+adminPassStore;     

            BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\admin_data.txt"));  //For read text file

            int totalLines = 0;
            while(reader.readLine() != null)
            {
              totalLines++;
              //For identify, Number of line
            }
            reader.close();

            for(int i=0; i<=totalLines; i++)
            {
              String idLine = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i+1);  
			  String passLine = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i+2);   

              if(idLine.equals(adminId) && passLine.equals(adminPass))   
              {

                 
                
                setVisible(false);
                AdminDashBoard aF = new AdminDashBoard();
                aF.setVisible(true);
                break;
                
              }
            }
          }

          catch(Exception ex)
          {
            showMessageDialog(null, "Invalid Id or Password", "Warning", JOptionPane.WARNING_MESSAGE);
          }
        }
      }
    });

    

  }



  public static void main(String[] args)
  {
    AdminLoginPage Frame = new AdminLoginPage();
    Frame.setVisible(true);

  }
}
