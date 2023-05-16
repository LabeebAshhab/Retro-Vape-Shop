package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;

import Classes.*;

public class Ruokt extends JFrame
{
    private Container c;
    private ImageIcon icon, img, previousIcon;
    private JLabel imgLabel, brand, model, price, type, bc, vs;
    private JButton buyNowBtn, previousBtn;
   

    public Ruokt()
    {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(758, 758);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("");

        //Page design
        this.setLocationRelativeTo(null);
        this.setResizable(false);
		
		icon = new ImageIcon(getClass().getResource("/images/Icon.png"));   
        this.setIconImage(icon.getImage());


        //Backgroud coloring
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#000000"));

        Font font = new Font("Segoe UI", Font.PLAIN, 25);
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        previousIcon = new ImageIcon(getClass().getResource("/images/Previous.png"));
        previousBtn = new JButton(previousIcon);
        previousBtn.setBounds(5, 5, 24, 24);
        previousBtn.setCursor(cursor);
        c.add(previousBtn);

        

        type = new JLabel("Type:  Disposable");
        type.setBounds(20, 550, 280, 30);
		Font ft = new Font("Segoe UI", Font.BOLD, 21);
        type.setFont(ft);
        type.setForeground(Color.WHITE);
        c.add(type);
 

        bc = new JLabel("Battery capacity: 850mah");
        bc.setBounds(20, 600, 280, 30);
		Font fbc = new Font("Segoe UI", Font.BOLD, 21);
        bc.setFont(fbc);
        bc.setForeground(Color.WHITE);
        c.add(bc);

        vs = new JLabel("Vapespan: 5000 puff");
        vs.setBounds(20, 650, 280, 30);
		Font fvs = new Font("Segoe UI", Font.BOLD, 21);
        vs.setFont(fvs);
        vs.setForeground(Color.WHITE);
        c.add(vs);

        price = new JLabel("Price: 1850 BDT");
        price.setBounds(540, 610, 280, 30);
		Font fp = new Font("Segoe UI", Font.BOLD, 21);
        price.setFont(fp);
        price.setForeground(Color.WHITE);
        c.add(price);

        String p = "1850";
		String n = "Ruoktank";

        buyNowBtn = new JButton("Buy Now");
        buyNowBtn.setBounds(540, 650, 150, 40);
        Font f = new Font("Segoe UI", Font.BOLD, 25);
        buyNowBtn.setFont(f);
        buyNowBtn.setCursor(cursor);
        c.add(buyNowBtn);
		
		img = new ImageIcon(getClass().getResource("/products/Ruoktank.jpg"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(0, 0, 758, 758);
        c.add(imgLabel);

     
        previousBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                CustomerDashBoard frame = new CustomerDashBoard();
                frame.setVisible(true);
            }
        });


        buyNowBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                Payment frame = new Payment(n, p);
                frame.setVisible(true);
            }
        });



    }

    public static void main(String args[])
    {
        new Ruokt();
    }
}

