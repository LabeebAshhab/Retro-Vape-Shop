package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import static javax.swing.JOptionPane.showMessageDialog;

public class Payment extends JFrame {
    private Container c;
    private ImageIcon icon;
    private JButton backBtn, confirmPaymentBtn;
    private ImageIcon backImg, logoImg, paymethImg;
    private JLabel title, logo, acceptPay, payMethod, name, amount, vat, paym, phoneNumberLabel, addressLabel, otpLabel;
    private JRadioButton bkashOption, nagadOption, codOption;
    private ButtonGroup grp;
    private JTextField phoneNumberTextField, addressTextField, otpTextField;
    protected String n, price;

    public Payment(String n, String price) {
        this.n = n;
        this.price = price;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1065, 650);
        this.setLayout(null);
        this.setVisible(true);

        this.setResizable(false);
        this.setLocationRelativeTo(null);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        // Back image Icon
        backImg = new ImageIcon(getClass().getResource(""));

        backBtn = new JButton(backImg);
        backBtn.setBounds(5, 5, 24, 24);
        backBtn.setBackground(Color.decode("#F2F2F2"));
        backBtn.setCursor(cursor);
        c.add(backBtn);

        // Logo
        logoImg = new ImageIcon(getClass().getResource("/images/payimg.png"));
        logo = new JLabel(logoImg);
        logo.setBounds(-70, 0, logoImg.getIconWidth(), logoImg.getIconHeight());
        c.add(logo);

        // Title
        title = new JLabel("Confirm Your Payment");
        title.setBounds(550, 25, 600, 40);
        Font titleFont = new Font("Segeo UI Black", Font.BOLD, 35);
        title.setFont(titleFont);
        title.setForeground(Color.decode("#8B8000"));
        c.add(title);

        // Acpect pay label
        acceptPay = new JLabel("You can pay via");
        acceptPay.setBounds(550, 100, 300, 30);
        Font acceptPayFont = new Font("Segoe UI Semibold", Font.PLAIN, 25);
        acceptPay.setFont(acceptPayFont);
        acceptPay.setForeground(Color.decode("#8B8000"));
        c.add(acceptPay);

        // paymethod
        paymethImg = new ImageIcon(getClass().getResource("/images/paymeth.jpg"));
        paym = new JLabel(paymethImg);
        paym.setBounds(550, 130, 200, 58);
        c.add(paym);

        // Pay Selection
        payMethod = new JLabel("Select a method");
        payMethod.setBounds(550, 200, 500, 50);
        Font payMethodFont = new Font("Segoe UI", Font.PLAIN, 20);
        payMethod.setFont(payMethodFont);
        c.add(payMethod);

        // Bkash Option
        bkashOption = new JRadioButton("Bkash");
        bkashOption.setBounds(720, 210, 100, 30);
        c.add(bkashOption);

        // Nagod Option
        nagadOption = new JRadioButton("Nagad");
        nagadOption.setBounds(800, 210, 100, 30);
        c.add(nagadOption);

        // COD option
        codOption = new JRadioButton("Cash on Delivery");
        codOption.setBounds(880, 210, 180, 30);
        c.add(codOption);

        // For choose only one option
        grp = new ButtonGroup();
        grp.add(bkashOption);
        grp.add(nagadOption);
        grp.add(codOption);

        Font font = new Font("Segoe UI", Font.PLAIN, 15);

        // Phone Number
        phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberLabel.setBounds(570, 260, 130, 30);
        phoneNumberLabel.setFont(font);
        c.add(phoneNumberLabel);

        phoneNumberTextField = new JTextField();
        phoneNumberTextField.setBounds(700, 260, 200, 30);
        c.add(phoneNumberTextField);

        // Address
        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(570, 300, 130, 30);
        addressLabel.setFont(font);
        c.add(addressLabel);

        addressTextField = new JTextField();
        addressTextField.setBounds(700, 300, 200, 30);
        c.add(addressTextField);

        // OTP
        otpLabel = new JLabel("OTP:");
        otpLabel.setBounds(570, 300, 130, 30);
        otpLabel.setFont(font);
        c.add(otpLabel);

        otpTextField = new JTextField();
        otpTextField.setBounds(700, 300, 200, 30);
        c.add(otpTextField);

        name = new JLabel("Product Name: " + n);
        name.setBounds(570, 440, 250, 30);
        name.setFont(font);
        c.add(name);

        amount = new JLabel("Total Amount: BDT " + price);
        amount.setBounds(570, 460, 250, 30);
        amount.setFont(font);
        c.add(amount);

        vat = new JLabel("VAT included, where applicable");
        vat.setBounds(570, 490, 300, 30);
        c.add(vat);

        confirmPaymentBtn = new JButton("Confirm Payment");
        confirmPaymentBtn.setBounds(800, 530, 200, 40);
        confirmPaymentBtn.setForeground(Color.WHITE);
        confirmPaymentBtn.setBackground(Color.RED);
        confirmPaymentBtn.setCursor(cursor);
        c.add(confirmPaymentBtn);

        phoneNumberLabel.setVisible(false);
        addressLabel.setVisible(false);
        phoneNumberTextField.setVisible(false);
        addressTextField.setVisible(false);
        otpLabel.setVisible(false);
        otpTextField.setVisible(false);

        codOption.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                amount.setText("Total Amount: BDT " + (Integer.parseInt(price) + 80));
                vat.setText("80Tk Delivery Charge Included");
                phoneNumberLabel.setVisible(true);
                addressLabel.setVisible(true);
                phoneNumberTextField.setVisible(true);
                addressTextField.setVisible(true);
                otpLabel.setVisible(false);
                otpTextField.setVisible(false);
            }
        });

        bkashOption.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                amount.setText("Total Amount: BDT " + price);
                vat.setText("VAT included, where applicable");
                phoneNumberLabel.setVisible(true);
                addressLabel.setVisible(false);
                phoneNumberTextField.setVisible(true);
                addressTextField.setVisible(false);
                otpLabel.setVisible(true);
                otpTextField.setVisible(true);
            }
        });

        nagadOption.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                amount.setText("Total Amount: BDT " + price);
                vat.setText("VAT included, where applicable");
                phoneNumberLabel.setVisible(true);
                addressLabel.setVisible(false);
                phoneNumberTextField.setVisible(true);
                addressTextField.setVisible(false);
                otpLabel.setVisible(true);
                otpTextField.setVisible(true);
            }
        });

        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new CustomerDashBoard();
            }
        });

        confirmPaymentBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String phoneNumberStore = phoneNumberTextField.getText();
                String addressTextStore = addressTextField.getText();

                if (phoneNumberStore.isEmpty() ) {
                    showMessageDialog(null, "Please Fill Up All Info", "Warning!", JOptionPane.WARNING_MESSAGE);
                }

                else {
                    if (nagadOption.isSelected()) {
                        try {
                            Integer.parseInt(phoneNumberStore);

                            setVisible(false);
                            showMessageDialog(null, "Payment Confirmed.Your order is Successful",
                                    "Payment Confirmation!", JOptionPane.PLAIN_MESSAGE);
                            saveToTextFile(n, price);
                            new CustomerDashBoard();
                        }

                        catch (Exception ex) {
                            showMessageDialog(null, "Invalid Info!", "Alert!",
                                    JOptionPane.WARNING_MESSAGE);
                        }
                    }

                    else if (bkashOption.isSelected()) {
                        try {
                            Integer.parseInt(phoneNumberStore);

                            setVisible(false);
                            showMessageDialog(null, "Payment Confirmed.Your order is Successful",
                                    "Payment Confirmation!", JOptionPane.PLAIN_MESSAGE);
                            saveToTextFile(n, price);
                            new CustomerDashBoard();
                        }

                        catch (Exception ex) {
                            showMessageDialog(null, "Invalid Info!", "Alert!",
                                    JOptionPane.WARNING_MESSAGE);
                        }
                    }

                    else if (codOption.isSelected()) {
                        try {
                            Integer.parseInt(phoneNumberStore);

                            setVisible(false);
                            showMessageDialog(null, "Payment Confirmed.Your order is Successful",
                                    "Payment Confirmation!", JOptionPane.PLAIN_MESSAGE);
                            saveToTextFile(n, price);
                            new CustomerDashBoard();
                        }

                        catch (Exception ex) {
                            showMessageDialog(null, "Your Information Incorrect", "Alert!",
                                    JOptionPane.WARNING_MESSAGE);
                        }
                    }

                    else {
                        showMessageDialog(null, "Please select a card", "Alert", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });

    }

    private void saveToTextFile(String productName, String productPrice) {
        try {
            File file = new File(".\\Data\\payment_data.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.println("Product Name: " + productName);
            printWriter.println("Product Price: " + productPrice);
            printWriter.println("===============================================");
            printWriter.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

   
}
