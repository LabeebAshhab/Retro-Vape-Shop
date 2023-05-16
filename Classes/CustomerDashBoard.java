package Classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;
import Classes.*;

public class CustomerDashBoard extends JFrame {
    private Container c;
	private ImageIcon img;
	private JLabel imgLabel;
    private JButton customer, backBtn, caliBtn, nkdBtn, mintfBtn, nkdMBtn, vapor80Btn, wotofoRBtn, vapemBtn, wotofocBtn,
			randmBtn, calikBtn, grapeFBtn, juiceBtn, MBBtn, randMBtn, ruoksBtn, ruokTBtn, vapefBtn, vapegBtn, searchBtn;
			
    private ImageIcon icon, backImg, caliIcon, nkdIcon, mintfIcon, nkdMIcon, vapor80Icon, wotofoRIcon, vapemIcon, wotofocIcon,
			randmIcon, calikIcon, grapeFIcon, juiceIcon, MBIcon, randMIcon, ruoksIcon, ruokTIcon, vapefIcon, vapegIcon, searchIcon;
			
    private JLabel search, cali, nkd, mintf, nkdM, vapor80, wotofoR, randm, randmm,
			vapef, calik, vapeg, vapem, grapef, juice, MB, ruoks, ruokt, wotofoc;
			
    private JTextField searchBarTf;
    protected String vape[] = {"ak2", "lemon", "mint", "vapor", "resin", "prime", "peach", "max", "wotofo",
								"randm", "rasp", "koko", "mixed", "grape", "guava", "juice", "berry", "apple", "orange", "tank", "cherry", "strawberry"};
    protected String check;

    // Add JScrollPane
    private JScrollPane scrollPane;
    private JPanel panel;
	private JLabel label;

public CustomerDashBoard() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1040, 760);
	this.setTitle("Products");
    this.setLayout(null);
    this.setVisible(true);

    this.setResizable(false);
    this.setLocationRelativeTo(null);

    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.decode("#F2F2F2"));

    // Add panel
    panel = new JPanel();
    panel.setPreferredSize(new Dimension(1040, 1920));
    panel.setLayout(null);
    panel.setBackground(Color.decode("#F2F2F2"));
	

    // Create JScrollPane object and set properties
    scrollPane = new JScrollPane(panel);
    scrollPane.setBounds(0, 0, 1040, 760);
    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	scrollPane.getVerticalScrollBar().setUnitIncrement(16);
    c.add(scrollPane);
	
	label = new JLabel("- Oops end of list -");
	label.setForeground(Color.YELLOW);
	label.setBounds(430, 1860, 300, 30);
	Font fontt = new Font("Lucida Console", Font.BOLD, 15);
	label.setFont(fontt);
	panel.add(label);

	label = new JLabel("But hey more products are coming soon!!!");
	label.setForeground(Color.YELLOW);
	label.setBounds(360, 1875, 350, 30);
	Font fonttt = new Font("Lucida Console", Font.BOLD, 13);
	label.setFont(fonttt);
	panel.add(label);

    this.setPreferredSize(new Dimension(1040, 760));


    // Add components to the panel instead of the c container

    //Icon 
    icon = new ImageIcon(getClass().getResource("/images/iconF.png"));
    this.setIconImage(icon.getImage());

    Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

    customer = new JButton("");
    customer.setBounds(1030, 5, 30, 30);
    customer.setCursor(cursor);
    panel.add(customer);

    //Back image Icon
    backImg = new ImageIcon(getClass().getResource("/images/Previous.png"));

    backBtn = new JButton(backImg);
    backBtn.setBounds(5, 5, 24, 24);
    backBtn.setBackground(Color.decode("#F2F2F2"));
    backBtn.setCursor(cursor);
    panel.add(backBtn);

    search = new JLabel("Search your flavour here...");
    Font searchFont = new Font("Segeo UI Black", Font.BOLD, 15);
    search.setBounds(815, 1, 300, 30);
    search.setFont(searchFont);
    panel.add(search);

    searchBarTf = new JTextField();
    searchBarTf.setBounds(840, 30, 150, 30);
    panel.add(searchBarTf);

    Font font = new Font("Times New Roman", Font.BOLD, 25);

    searchIcon = new ImageIcon(getClass().getResource("/images/Search.png"));
    searchBtn = new JButton(searchIcon);
    searchBtn.setBounds(995, 30, 24, 26);
    panel.add(searchBtn);
	

	searchBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String searchText = searchBarTf.getText().toLowerCase();
                check = "";

                if (searchText == null || searchText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Search bar is empty", "Alert", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                for (int i = 0; i < vape.length; i++) {
                    if (vape[i].equals(searchText)) {
                        check = vape[i];
                    }
                }

                if (check.equals("ak2")) {
                    setVisible(false);
                    new Cali();
                } else if (check.equals("lemon")) {
                    setVisible(false);
                    new NKD();
                } else if (check.equals("max")) {
                    setVisible(false);
                    new NKDm();
                } else if (check.equals("guava")) {
                    setVisible(false);
                    new Mintf();
                } else if (check.equals("vapor")) {
                    setVisible(false);
                    new Vapor80();
                } else if (check.equals("strawberry")) {
                    setVisible(false);
                    new Wotoforum();
                } else if (check.equals("mint")) {
                    setVisible(false);
                    new Randmcm();
                } else if (check.equals("koko")) {
                    setVisible(false);
                    new Calik();
                } else if (check.equals("resin")) {
                    setVisible(false);
                    new Grapef();
                } else if (check.equals("peach")) {
                    setVisible(false);
                    new Juicehp();
                } else if (check.equals("berry")) {
                    setVisible(false);
                    new Monsterb();
                } else if (check.equals("orange")) {
                    setVisible(false);
                    new Ruoks();
                } else if (check.equals("prime")) {
                    setVisible(false);
                    new Calik();
                } else if (check.equals("tank")) {
                    setVisible(false);
                    new Ruokt();
                } else if (check.equals("apple")) {
                    setVisible(false);
                    new Randmap();
                } else if (check.equals("cherry")) {
                    setVisible(false);
                    new Wotofoc();
                } else if (check.equals("mixed")) {
                    setVisible(false);
                    new Vapef();
                } else if (check.equals("grape")) {
                    setVisible(false);
                    new Vapeg();
                } else if (check.equals("rasp")) {
                    setVisible(false);
                    new Vapem();
                } else {
                    JOptionPane.showMessageDialog(null, "Item not found", "Alert", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        backBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new CustomerLoginPage();
            }
        });

		
		caliIcon = new ImageIcon(getClass().getResource("/products/thumbnail/caliburn.jpg"));
        caliBtn = new JButton(caliIcon);
        caliBtn.setBounds(35, 70, 280, 240);
        caliBtn.setCursor(cursor);
        panel.add(caliBtn);

        cali = new JLabel("Caliburn AK2");
		cali.setForeground(Color.WHITE);
        cali.setBounds(120, 320, 300, 30); 
        cali.setFont(font);
        panel.add(cali);

        caliBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Cali();
            }
        });
		
		
        nkdIcon = new ImageIcon(getClass().getResource("/products/thumbnail/nkdlemon.jpeg"));
        nkdBtn = new JButton(nkdIcon);
        nkdBtn.setBounds(370, 70, 280, 240);
        nkdBtn.setCursor(cursor);
        panel.add(nkdBtn);

        nkd = new JLabel("NKD Lemon");
		nkd.setForeground(Color.WHITE);
        nkd.setBounds(455, 320, 300, 30);
        nkd.setFont(font);
        panel.add(nkd);



        nkdBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new NKD();
            }
        });
		
		
		mintfIcon = new ImageIcon(getClass().getResource("/products/thumbnail/mintfreetone.jpg"));
        mintfBtn = new JButton(mintfIcon);
        mintfBtn.setBounds(710, 70, 280, 240);
        mintfBtn.setCursor(cursor);
        panel.add(mintfBtn);

        mintf = new JLabel("Freeton Mint");
		mintf.setForeground(Color.WHITE);
        mintf.setBounds(790, 320, 300, 30);
        mintf.setFont(font);
        panel.add(mintf);



        mintfBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Mintf();
            }
        });
		
		
		nkdMIcon = new ImageIcon(getClass().getResource("/products/thumbnail/nkdmax.jpg"));
        nkdMBtn = new JButton(nkdMIcon);
        nkdMBtn.setBounds(35, 360, 280, 240);
        nkdMBtn.setCursor(cursor);
        panel.add(nkdMBtn);

        nkdM = new JLabel("NKD Max");
		nkdM.setForeground(Color.WHITE);
        nkdM.setBounds(120, 610, 300, 30);
        nkdM.setFont(font);
        panel.add(nkdM);



        nkdMBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new NKDm();
            }
        });
		
		
		vapor80Icon = new ImageIcon(getClass().getResource("/products/thumbnail/vapor80.jpg"));
        vapor80Btn = new JButton(vapor80Icon);
        vapor80Btn.setBounds(710, 360, 280, 240);
        vapor80Btn.setCursor(cursor);
        panel.add(vapor80Btn);

        vapor80 = new JLabel("Vaporessor 80s");
		vapor80.setForeground(Color.WHITE);
        vapor80.setBounds(740, 610, 300, 30);
        vapor80.setFont(font);
        panel.add(vapor80);



        vapor80Btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Vapor80();
            }
        });
		
		
		wotofoRIcon = new ImageIcon(getClass().getResource("/products/thumbnail/wotoforum.jpg"));
        wotofoRBtn = new JButton(wotofoRIcon);
        wotofoRBtn.setBounds(370, 360, 280, 240);
        wotofoRBtn.setCursor(cursor);
        panel.add(wotofoRBtn);

        wotofoR = new JLabel("Wotofo Zetta");
		wotofoR.setForeground(Color.WHITE);
        wotofoR.setBounds(450, 610, 300, 30);
        wotofoR.setFont(font);
        panel.add(wotofoR);



        wotofoRBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Wotoforum();
            }
        });
		
		randmIcon = new ImageIcon(getClass().getResource("/products/thumbnail/randmcm.jpg"));
		randmBtn = new JButton(randmIcon);
		randmBtn.setBounds(35, 660, 280, 240);
		randmBtn.setCursor(cursor);
		panel.add(randmBtn);

		randm = new JLabel("Randm Mint");
		randm.setForeground(Color.WHITE);
		randm.setBounds(120, 910, 300, 30);
		randm.setFont(font);
		panel.add(randm);


        randmBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Randmcm();
            }
        });
		
		calikIcon = new ImageIcon(getClass().getResource("/products/thumbnail/calikoko.jpg"));
        calikBtn = new JButton(calikIcon);
        calikBtn.setBounds(375, 660, 280, 240);
        calikBtn.setCursor(cursor);
        panel.add(calikBtn);

        calik = new JLabel("Caliburn Prime");
		calik.setForeground(Color.WHITE);
        calik.setBounds(455, 910, 300, 30);
        calik.setFont(font);
        panel.add(calik);

        calikBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Calik();
            }
        });
		
		grapeFIcon = new ImageIcon(getClass().getResource("/products/thumbnail/grapefreetone.jpg"));
        grapeFBtn = new JButton(grapeFIcon);
        grapeFBtn.setBounds(715, 660, 280, 240);
        grapeFBtn.setCursor(cursor);
        panel.add(grapeFBtn);

        grapef = new JLabel("Freetone Resin");
		grapef.setForeground(Color.WHITE);
        grapef.setBounds(790, 910, 300, 30);
        grapef.setFont(font);
        panel.add(grapef);

        grapeFBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Grapef();
            }
        });
		
		juiceIcon = new ImageIcon(getClass().getResource("/products/thumbnail/juiceheadpeach.jpg"));
        juiceBtn = new JButton(juiceIcon);
        juiceBtn.setBounds(35, 960, 280, 240);
        juiceBtn.setCursor(cursor);
        panel.add(juiceBtn);

        juice = new JLabel("JuiceHead 5K");
		juice.setForeground(Color.WHITE);
        juice.setBounds(120, 1210, 300, 30);
        juice.setFont(font);
        panel.add(juice);

        juiceBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Juicehp();
            }
        });
		
		
		MBIcon = new ImageIcon(getClass().getResource("/products/thumbnail/monsterberry.jpg"));
        MBBtn = new JButton(MBIcon);
        MBBtn.setBounds(375, 960, 280, 240);
        MBBtn.setCursor(cursor);
        panel.add(MBBtn);

        MB = new JLabel("Monster Bars");
		MB.setForeground(Color.WHITE);
        MB.setBounds(455, 1210, 300, 30);
        MB.setFont(font);
        panel.add(MB);

        MBBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Monsterb();
            }
        });
		
		ruokTIcon = new ImageIcon(getClass().getResource("/products/thumbnail/ruoktank.jpg"));
        ruokTBtn = new JButton(ruokTIcon);
        ruokTBtn.setBounds(375, 1260, 280, 240);
        ruokTBtn.setCursor(cursor);
        panel.add(ruokTBtn);

        ruokt = new JLabel("Ruok Tank");
		ruokt.setForeground(Color.WHITE);
        ruokt.setBounds(460, 1505, 300, 30);
        ruokt.setFont(font);
        panel.add(ruokt);

        ruokTBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Ruokt();
            }
        });
		
		randMIcon = new ImageIcon(getClass().getResource("/products/thumbnail/randmapple.jpg"));
        randMBtn = new JButton(randMIcon);
        randMBtn.setBounds(715, 960, 280, 240);
        randMBtn.setCursor(cursor);
        panel.add(randMBtn);

        randmm = new JLabel("Randm Tornado");
		randmm.setForeground(Color.WHITE);
        randmm.setBounds(780, 1210, 300, 30);
        randmm.setFont(font);
        panel.add(randmm);

        randMBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Randmap();
            }
        });
		
		ruoksIcon = new ImageIcon(getClass().getResource("/products/thumbnail/ruoksoda.jpg"));
        ruoksBtn = new JButton(ruoksIcon);
        ruoksBtn.setBounds(35, 1260, 280, 240);
        ruoksBtn.setCursor(cursor);
        panel.add(ruoksBtn);

        ruoks = new JLabel("Ruok Energy");
		ruoks.setForeground(Color.WHITE);
        ruoks.setBounds(100, 1505, 300, 30);
        ruoks.setFont(font);
        panel.add(ruoks);

        ruoksBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Ruoks();
            }
        });
		
		vapefIcon = new ImageIcon(getClass().getResource("/products/thumbnail/vapinginfruity.jpg"));
        vapefBtn = new JButton(vapefIcon);
        vapefBtn.setBounds(715, 1260, 280, 240);
        vapefBtn.setCursor(cursor);
        panel.add(vapefBtn);

        vapef = new JLabel("Vapengin Fruity");
		vapef.setForeground(Color.WHITE);
        vapef.setBounds(780, 1505, 300, 30);
        vapef.setFont(font);
        panel.add(vapef);

        vapefBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Vapef();
            }
        });
		
		vapegIcon = new ImageIcon(getClass().getResource("/products/thumbnail/vapingingrape.jpg"));
        vapegBtn = new JButton(vapegIcon);
        vapegBtn.setBounds(35, 1555, 280, 240);
        vapegBtn.setCursor(cursor);
        panel.add(vapegBtn);

        vapeg = new JLabel("Vapengin Grape");
		vapeg.setForeground(Color.WHITE);
        vapeg.setBounds(100, 1805, 300, 30);
        vapeg.setFont(font);
        panel.add(vapeg);

        vapegBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Vapeg();
            }
        });
		
		vapemIcon = new ImageIcon(getClass().getResource("/products/thumbnail/vapinginmars.jpg"));
        vapemBtn = new JButton(vapemIcon);
        vapemBtn.setBounds(375, 1555, 280, 240);
        vapemBtn.setCursor(cursor);
        panel.add(vapemBtn);

        vapem = new JLabel("Vapengin Mars");
		vapem.setForeground(Color.WHITE);
        vapem.setBounds(450, 1805, 300, 30);
        vapem.setFont(font);
        panel.add(vapem);

        vapemBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Vapem();
            }
        });
		
		wotofocIcon = new ImageIcon(getClass().getResource("/products/thumbnail/wotofocherry.jpg"));
        wotofocBtn = new JButton(wotofocIcon);
        wotofocBtn.setBounds(715, 1555, 280, 240);
        wotofocBtn.setCursor(cursor);
        panel.add(wotofocBtn);

        wotofoc = new JLabel("Wotofo Cherry");
		wotofoc.setForeground(Color.WHITE);
        wotofoc.setBounds(780, 1805, 300, 30);
        wotofoc.setFont(font);
        panel.add(wotofoc);

        wotofocBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                setVisible(false);
                new Wotofoc();
            }
        });
		
		
	img = new ImageIcon(getClass().getResource("/images/csBackground.jpg"));
    imgLabel = new JLabel(img);
    imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
    panel.add(imgLabel);
	

    }
	 public static void main(String[] args) {
        new CustomerDashBoard();
    }
}