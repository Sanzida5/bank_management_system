package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class signup2 extends JFrame implements ActionListener {

    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan;
    JRadioButton r1, r2, e1, e2;
    JButton next;
    String formno;

    signup2(String formno) {

        super("APPLICATION FORM");
        this.formno = formno;

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel l1 = new JLabel("Page 2:");
        l1.setBounds(300, 30, 600, 40);
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        JLabel formLabel = new JLabel("Form No: " + formno);
        formLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        formLabel.setForeground(Color.BLACK);
        formLabel.setBounds(700, 40, 350, 35);
        add(formLabel);

        JLabel l3 = new JLabel("Religion:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 120, 150, 30);
        add(l3);

        String religion[] = {"Select", "Hindu", "Muslim", "Christian", "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252, 208, 76));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350, 120, 320, 30);
        add(comboBox);

        JLabel l4 = new JLabel("Category:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 170, 150, 30);
        add(l4);

        String category[] = {"Select", "General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(252, 208, 76));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350, 170, 320, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income:");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100, 220, 150, 30);
        add(l5);

        String income[] = {"Select", "<1,50,000", "<2,50,000", "5,00,000", "Up to 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252, 208, 76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350, 220, 320, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational:");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100, 270, 150, 30);
        add(l6);

        String educational[] = {"Select", "Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Other"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(252, 208, 76));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350, 270, 320, 30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100, 340, 150, 30);
        add(l7);

        String occupation[] = {"Select", "Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(252, 208, 76));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350, 340, 320, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("ID Number:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 390, 150, 30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD, 18));
        textPan.setBounds(350, 390, 320, 30);
        add(textPan);

        JLabel l9 = new JLabel("Senior Citizen:");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 490, 180, 30);
        add(l9);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(252, 208, 76));
        r1.setBounds(350, 490, 100, 30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(252, 208, 76));
        r2.setBounds(460, 490, 100, 30);
        add(r2);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(r1);
        seniorGroup.add(r2);

        JLabel l10 = new JLabel("Existing Account:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 540, 220, 30);
        add(l10);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBackground(new Color(252, 208, 76));
        e1.setBounds(350, 540, 100, 30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBackground(new Color(252, 208, 76));
        e2.setBounds(460, 540, 100, 30);
        add(e2);

        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(e1);
        existingGroup.add(e2);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570, 540, 100, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(252, 208, 76));

        setSize(850, 750);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String religion = (String) comboBox.getSelectedItem();
        String category = (String) comboBox2.getSelectedItem();
        String income = (String) comboBox3.getSelectedItem();
        String education = (String) comboBox4.getSelectedItem();
        String occupation = (String) comboBox5.getSelectedItem();

        String idNumber = textPan.getText().trim();

        String seniorCitizen = null;
        if (r1.isSelected()) {
            seniorCitizen = "Yes";
        } else if (r2.isSelected()) {
            seniorCitizen = "No";
        }

        String existingAccount = null;
        if (e1.isSelected()) {
            existingAccount = "Yes";
        } else if (e2.isSelected()) {
            existingAccount = "No";
        }

        try {
            if (religion.equals("Select")) {
                JOptionPane.showMessageDialog(null, "Please select Religion");
                return;
            }

            if (category.equals("Select")) {
                JOptionPane.showMessageDialog(null, "Please select Category");
                return;
            }

            if (income.equals("Select")) {
                JOptionPane.showMessageDialog(null, "Please select Income");
                return;
            }

            if (education.equals("Select")) {
                JOptionPane.showMessageDialog(null, "Please select Education");
                return;
            }

            if (occupation.equals("Select")) {
                JOptionPane.showMessageDialog(null, "Please select Occupation");
                return;
            }

            if (idNumber.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter ID Number");
                return;
            }

            if (seniorCitizen == null) {
                JOptionPane.showMessageDialog(null, "Please select Senior Citizen option");
                return;
            }

            if (existingAccount == null) {
                JOptionPane.showMessageDialog(null, "Please select Existing Account option");
                return;
            }

            Conn c = new Conn();

            String q = "insert into signup2 values('" + formno + "', '" + religion + "', '" + category + "', '" + income + "', '" + education + "', '" + occupation + "', '" + idNumber + "', '" + seniorCitizen + "', '" + existingAccount + "')";

            c.statement.executeUpdate(q);

            setVisible(false);
            new signup3(formno);

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new signup2("");
    }
}
