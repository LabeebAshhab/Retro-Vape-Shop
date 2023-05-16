package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;

public class AgeVerificationApp extends JFrame{
    private JLabel ageCheckLabel;
    private JButton yesButton;
    private JButton noButton;
    private JTextField birthYearField;
    private JLabel birthYearLabel;
    private JButton submitButton;

    public AgeVerificationApp() {
			
    

    
        setLayout(null);
        getContentPane().setBackground(new Color(60, 63, 65));

        Font customFont = new Font("Arial", Font.BOLD, 16);

        ageCheckLabel = new JLabel("Are you 18+ years old?");
        ageCheckLabel.setFont(customFont);
        ageCheckLabel.setForeground(Color.WHITE);
        ageCheckLabel.setBounds(50, 30, 200, 30);
        
        yesButton = new JButton("Yes");
        yesButton.setBounds(50, 70, 80, 30);
        noButton = new JButton("No");
        noButton.setBounds(140, 70, 80, 30);

        birthYearLabel = new JLabel("Enter your birth year:");
        birthYearLabel.setFont(customFont);
        birthYearLabel.setForeground(Color.WHITE);
        birthYearLabel.setBounds(50, 30, 200, 30);

        birthYearField = new JTextField(4);
        birthYearField.setBounds(50, 70, 80, 30);

        submitButton = new JButton("Submit");
        submitButton.setBounds(140, 70, 80, 30);

        yesButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                getContentPane().add(birthYearLabel);
                getContentPane().add(birthYearField);
                getContentPane().add(submitButton);
                revalidate();
                repaint();
            }
        });

        noButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

			submitButton.addActionListener(new ActionListener() {
            
			public void actionPerformed(ActionEvent e) {
			try {
					int birthYear = Integer.parseInt(birthYearField.getText());
					int currentYear = Year.now().getValue();
					int age = currentYear - birthYear;

            if (age >= 18 && age <=80) {
				AgeVerificationApp.this.setVisible(false);
                HomePage hP = new HomePage();
                hP.setVisible(true);
                
			}
				else if (age >80){
					JOptionPane.showMessageDialog(null,"You are too old to be veporizzed !!");
				}
             else {
                JOptionPane.showMessageDialog(null, "Sorry, you must be 18+ to gain access...");
                System.exit(0);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid birth year!!!");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
});

        getContentPane().add(ageCheckLabel);
        getContentPane().add(yesButton);
        getContentPane().add(noButton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setTitle("Age Verification");
        setLocationRelativeTo(null);
    }

    
}