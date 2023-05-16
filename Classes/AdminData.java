package Classes;

import Interfaces.IUserDataInterface;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

public class AdminData extends JFrame implements IUserDataInterface {

    private Container c;
    private JLabel title;
    private JButton refreshBtn, deleteBtn, backBtn;
    private JTable table;
    private DefaultTableModel model;
    private ImageIcon icon;
    private Cursor cursor;
    private JScrollPane scroll;

    private String[] column = { "User Name", "Password" };
    private String[] row = new String[2];

    

    public AdminData() {
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1065, 650);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("Retro Vape Shop");

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/iconF.png"));
        this.setIconImage(icon.getImage());

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Fonts
        Font f1 = new Font("Segoe UI Black", Font.BOLD, 32);
        Font f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        title = new JLabel("Admin Information");
        title.setBounds(330, 10, 450, 35);
        title.setFont(f1);
        c.add(title);

        // JButtons
        refreshBtn = new JButton("Refresh");
        refreshBtn.setBounds(800, 100, 184, 50);
        refreshBtn.setFont(f2);
        refreshBtn.setCursor(cursor);
        refreshBtn.setForeground(Color.WHITE);
        refreshBtn.setBackground(Color.decode("#2E75B6"));
        c.add(refreshBtn);

        deleteBtn = new JButton("Delete");
        deleteBtn.setBounds(800, 200, 184, 50);
        deleteBtn.setFont(f2);
        deleteBtn.setCursor(cursor);
        deleteBtn.setForeground(Color.WHITE);
        deleteBtn.setBackground(Color.decode("#2E75B6"));
        c.add(deleteBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(800, 300, 184, 50);
        backBtn.setFont(f2);
        backBtn.setCursor(cursor);
        backBtn.setForeground(Color.WHITE);
        backBtn.setBackground(Color.decode("#2E75B6"));
        c.add(backBtn);

        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        Font tableFont = new Font("Segoe UI", Font.PLAIN, 20);
        table.setFont(tableFont);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(220);
        table.getColumnModel().getColumn(1).setPreferredWidth(220);

        scroll = new JScrollPane(table);
        scroll.setBounds(50, 96, 700, 300);
        scroll.setBackground(Color.WHITE);
        c.add(scroll);

        refreshBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                refreshData();
            }
        });

        deleteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                deleteData();
            }
        });

        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                goBack();
            }
        });

        refreshData();
    }

    public void refreshData() {
        String file = ".\\Data\\admin_data.txt";
        model.setRowCount(0);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while ((reader.readLine()) != null) {
                totalLines++;
            }
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);

                if (line.length() >= 5) {
                    String x = line.substring(0, 5);

                    if (x.equals("Admin")) {
                        row[0] = line.substring(6); // User Name
                        row[1] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(9); // Password
                        model.addRow(row);
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void deleteData() {
        if (table.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a user to delete", "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

            String file = ".\\Data\\admin_data.txt";
            String atemp = ".\\Data\\atemp.txt";

            File oldFile = new File(file);
            File newFile = new File(atemp);

            int q = 0;

            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));

                int totalLines = 0;
                while (reader.readLine() != null) {
                    totalLines++;
                }
                reader.close();

                for (int i = 0; i < totalLines; i++) {
                    String line = Files.readAllLines(Paths.get(file)).get(i);
                    if (line.length() >= 5) {
                        String x = line.substring(0, 5);

                        if (x.equals("Admin")) {
                            String userName = Files.readAllLines(Paths.get(file)).get(i);

                            if (userName.length() >= 6 && userName.substring(6).equals(removeUser)) {
                                q = i;
                            }
                        }
                    }
                }
            } catch (IOException ex) {
                return;
            }

            try {
                FileWriter fw = new FileWriter(atemp, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                BufferedReader reader = new BufferedReader(new FileReader(file));
                int totalLines = 0;
                while (reader.readLine() != null) {
                    totalLines++;
                }
                reader.close();

                for (int j = 0; j < totalLines; j++) {
                    String line = Files.readAllLines(Paths.get(file)).get(j);
                    if (line.length() >= 5) {

                        if (q != 0 && (j == q || j == (q + 2))) {
                            String userName = Files.readAllLines(Paths.get(file)).get(j);
                            pw.println("#Removed! " + userName);
                        } else {
                            String userName = Files.readAllLines(Paths.get(file)).get(j);
                            pw.println(userName);
                        }
                    }
                }
                pw.flush();
                pw.close();
                fr.close();
                br.close();
                bw.close();
                fw.close();

            } catch (IOException ex) {
                // System.out.print(ex);
            }

            oldFile.delete();
            File dump = new File(file);
            newFile.renameTo(dump);

            refreshData();
        }
    }

    public void goBack() {
        setVisible(false);
        new AdminDashBoard();
    }

    public static void main(String[] arg) {
        AdminData frame = new AdminData();
        frame.setVisible(true);
    }
}
