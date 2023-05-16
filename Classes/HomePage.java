package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Classes.*;


public class HomePage extends JFrame
{
  private Container c; 
  private JButton admin, customer, exit;
  private ImageIcon icon, img;
  private JLabel imgLabel, nameLabel, nameLabelT;
  private Font font;
  private Cursor cursor;


  public HomePage()
  {
    //Frame size and Layout
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1065, 650);
    this.setTitle("Home");
    this.setLayout(null);
    
  

    //page design
    this.setLocationRelativeTo(null);
    this.setResizable(false); 


    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.decode("#C5C6D0"));   


    //Icon
    icon = new ImageIcon(getClass().getResource("/images/iconF.png"));
    this.setIconImage(icon.getImage());

	nameLabelT = new JLabel("*All Our Pruduct Contains Nicotine and Nicotine is an Addictive Substance*");
	nameLabelT.setFont(new Font(/*Font Name*/ "MV Boli", Font.BOLD, /*Font Size*/ 15));
	nameLabelT.setForeground(Color.WHITE);
	nameLabelT.setBounds(10,500,900,200);
	c.add(nameLabelT);

    //Logo and images
    img = new ImageIcon(getClass().getResource("/images/HomePage.jpg"));
    imgLabel = new JLabel(img);
    imgLabel.setBounds(0, -6, img.getIconWidth(), img.getIconHeight());
    c.add(imgLabel);
	
	


    // Fonts
    font = new Font(/*Font Name*/ "Segoe UI Black", Font.BOLD, /*Font Size*/ 25);



    // Cursor for JButtons
    cursor = new Cursor(Cursor.HAND_CURSOR);
	
	//Name
	nameLabel = new JLabel("We sell vapes n stuff");
	nameLabel.setFont(new Font(/*Font Name*/ "MV Boli", Font.BOLD, /*Font Size*/ 45));
	nameLabel.setForeground(Color.WHITE);
	nameLabel.setBounds(550,300,900,200);
	c.add(nameLabel);
	
	
	



    //Admin
    admin = new JButton("Admin");    
    admin.setBounds(800, 210, 200, 60); 
    admin.setFont(font); 
    admin.setCursor(cursor);
    admin.setForeground(Color.WHITE);
    admin.setBackground(Color.decode("#60a9f7"));
	admin.setFocusPainted(false);
    c.add(admin);




    // Customer
    customer = new JButton("Customer");    
    customer.setBounds(800, 310, 200, 60);
    customer.setFont(font);
    customer.setCursor(cursor);
    customer.setForeground(Color.WHITE);
    customer.setBackground(Color.decode("#60a9f7"));
	customer.setFocusPainted(false);
    c.add(customer);   



    // EXIT
    exit = new JButton("Exit");
    exit.setBounds(800, 410, 200, 60);
    exit.setFont(font);
    exit.setCursor(cursor);
    exit.setForeground(Color.WHITE);
    exit.setBackground(Color.decode("#FF0000"));
	exit.setFocusPainted(false);
    c.add(exit);


    // Action Action Listener
    // Exit Button
    exit.addActionListener(new ActionListener() 
    {
      public void actionPerformed(ActionEvent ae) 
      {
        System.exit(0);
      }
    });

  
    //Admin Button
    admin.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        setVisible(false);
        AdminLoginPage frame = new AdminLoginPage();
        frame.setVisible(true);
      }
    });
  
    // Customer Button Action Listener
    customer.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ae)
      {
        setVisible(false);
        new CustomerLoginPage();
        //frame.setVisible(true);
      }
    });
		this.setVisible(true);
  }


  public static void main(String[] args)
  {
    HomePage frame = new HomePage();
    frame.setVisible(true);
  }
}
