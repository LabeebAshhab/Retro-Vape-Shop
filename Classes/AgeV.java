package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Classes.*;


public class AgeV extends JFrame
{
  private Container c;
  private JButton okay, cont, exit;
  private ImageIcon icon, img;
  private JLabel imgLabel, nameLabel,nameLabelT;
  private Font font,fontC;
  private Cursor cursor;


  public AgeV()
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
	nameLabel = new JLabel("Please Verify Your Age!");
	nameLabel.setFont(new Font(/*Font Name*/ "Segoe UI Black", Font.BOLD, /*Font Size*/ 38));
	nameLabel.setForeground(Color.WHITE);
	nameLabel.setBounds(560,170,900,200);
	c.add(nameLabel);

    //Logo and images
	img = new ImageIcon(getClass().getResource("/images/HomePage.jpg"));
    imgLabel = new JLabel(img);
    imgLabel.setBounds(0, -6, img.getIconWidth(), img.getIconHeight());
    c.add(imgLabel);
    // Fonts
    font = new Font(/*Font Name*/ "Segoe UI Black", Font.BOLD, /*Font Size*/ 20);
	fontC = new Font(/*Font Name*/ "MV Boli", Font.BOLD, /*Font Size*/ 15);



    // Cursor for JButtons
    cursor = new Cursor(Cursor.HAND_CURSOR); 

	
	

    //okay
    okay = new JButton("Okay");    
    okay.setBounds(570, 340, 200, 60);  
    okay.setFont(font); 
    okay.setCursor(cursor);
    okay.setForeground(Color.WHITE);
    okay.setBackground(Color.decode("#60a9f7"));
	okay.setFocusPainted(false);
    c.add(okay); 




    


    // EXIT
    exit = new JButton("No thanks...");
    exit.setBounds(820, 340, 200, 60);
    exit.setFont(font);
    exit.setCursor(cursor);
    exit.setForeground(Color.WHITE);
    exit.setBackground(Color.decode("#60a9f7"));
	exit.setFocusPainted(false);
    c.add(exit);
	
	//Contributions
	
	cont = new JButton("Contribution");    
    cont.setBounds(850, 550, 170, 40);  
    cont.setFont(fontC); 
    cont.setCursor(cursor);
    cont.setForeground(Color.WHITE);
    cont.setBackground(Color.decode("#0c339c"));
	cont.setFocusPainted(false);
    c.add(cont); 


    // Action Action Listener
    // Exit Button
    exit.addActionListener(new ActionListener() 
    {
      public void actionPerformed(ActionEvent ae) 
      {
        System.exit(0);
      }
    });

  
    //okay Button
    
    
	okay.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{	
			AgeV.this.setVisible(false);
			AgeVerificationApp aVA = new AgeVerificationApp();
			aVA.setVisible(true);
			
		}
	});
	//Contributions ActionListener
	
	cont.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{	
			AgeV.this.setVisible(false);
			Contribution conT = new Contribution();
			conT.setVisible(true);
			
		}
	});
	
  }


  public static void main(String[] args)
  {
    AgeV aV = new AgeV();
    aV.setVisible(false);
  }
}
