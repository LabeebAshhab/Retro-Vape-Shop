package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Classes.*;


public class Contribution  extends JFrame
{
  private Container c;
  private JButton okay, cont, exit;
  private ImageIcon icon, img;
  private JLabel imgLabel, nameLabel,nameLabelT;
  private Font font,fontC;
  private Cursor cursor;


  public Contribution ()
  {
    //Frame size and Layout
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1065, 650);
    this.setTitle("Age Verification Page");
    this.setLayout(null);
    this.setVisible(true);
  

    //page design
    this.setLocationRelativeTo(null);
    this.setResizable(false); 


    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.decode("#C5C6D0"));


    //Icon
    icon = new ImageIcon(getClass().getResource("/images/es/AgeV.png"));
    this.setIconImage(icon.getImage());
	
	nameLabelT = new JLabel("*All Our Pruduct Contains Nicotine and Nicotine is an Addictive Substance*");
	nameLabelT.setFont(new Font(/*Font Name*/ "MV Boli", Font.BOLD, /*Font Size*/ 15));
	nameLabelT.setForeground(Color.WHITE);
	nameLabelT.setBounds(10,500,900,200);
	c.add(nameLabelT);

	//Name
	nameLabel = new JLabel("About Us");
	nameLabel.setFont(new Font(/*Font Name*/ "Segoe UI Black", Font.BOLD, /*Font Size*/ 35));
	nameLabel.setForeground(Color.WHITE);
	nameLabel.setBounds(560,120,900,200);
	c.add(nameLabel);
	
	
	nameLabel = new JLabel("Group 2");
	nameLabel.setFont(new Font(/*Font Name*/ "Segoe UI Black", Font.BOLD, /*Font Size*/ 20));
	nameLabel.setForeground(Color.WHITE);
	nameLabel.setBounds(560,150,900,200);
	c.add(nameLabel);
	
	
	nameLabel = new JLabel("Name : MD Labeeb Ashhab");
	nameLabel.setFont(new Font(/*Font Name*/ "Segoe UI Black", Font.BOLD, /*Font Size*/ 20));
	nameLabel.setForeground(Color.WHITE);
	nameLabel.setBounds(560,210,900,200);
	c.add(nameLabel);
	
	nameLabel = new JLabel("ID :22-47879-2");
	nameLabel.setFont(new Font(/*Font Name*/ "Segoe UI Black", Font.BOLD, /*Font Size*/ 20));
	nameLabel.setForeground(Color.WHITE);
	nameLabel.setBounds(560,240,900,200);
	c.add(nameLabel);
	
	
	nameLabel = new JLabel("Name : MD Abu Jar Gifari");
	nameLabel.setFont(new Font(/*Font Name*/ "Segoe UI Black", Font.BOLD, /*Font Size*/ 20));
	nameLabel.setForeground(Color.WHITE);
	nameLabel.setBounds(560,300,900,200);
	c.add(nameLabel);
	
	nameLabel = new JLabel("ID :22-47917-2");
	nameLabel.setFont(new Font(/*Font Name*/ "Segoe UI Black", Font.BOLD, /*Font Size*/ 20));
	nameLabel.setForeground(Color.WHITE);
	nameLabel.setBounds(560,330,900,200);
	c.add(nameLabel);

    //Logo and images
	img = new ImageIcon(getClass().getResource("/images/HomePage.jpg"));
    imgLabel = new JLabel(img);
    imgLabel.setBounds(0, -6, img.getIconWidth(), img.getIconHeight());
    c.add(imgLabel);
    // Fonts
    font = new Font(/*Font Name*/ "Segoe UI Black", Font.BOLD, /*Font Size*/ 15);
	fontC = new Font(/*Font Name*/ "MV Boli", Font.BOLD, /*Font Size*/ 15);



    // Cursor for JButtons
    cursor = new Cursor(Cursor.HAND_CURSOR); 

	
	

    //okay
    okay = new JButton("Back");    
    okay.setBounds(560, 500, 170, 40);  
    okay.setFont(font); 
    okay.setCursor(cursor);
    okay.setForeground(Color.WHITE);
    okay.setBackground(Color.decode("#60a9f7"));
	okay.setFocusPainted(false);
    c.add(okay); 


	okay.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{	
			Contribution.this.setVisible(false);
			AgeV aV = new AgeV();
			aV.setVisible(true);
			
		}
	});
	
  }


  public static void main(String[] args)
  {
    Contribution conT = new Contribution();
    conT.setVisible(false);
  }
}
