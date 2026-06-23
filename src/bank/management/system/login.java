package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class login extends JFrame implements ActionListener {

    JLabel lebel1, lebel2, lebel3;
    JLabel bankLabel, cardLabel;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, button2, button3;

    BackgroundPanel backgroundPanel;

    Image bankImage;
    Image cardImage;

    final int BASE_WIDTH = 850;
    final int BASE_HEIGHT = 480;

    double scale = 1.0;
    int offsetX = 0;
    int offsetY = 0;

    login() {
        super("bank management system");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(850, 480));
        setResizable(true);

        ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        backgroundPanel = new BackgroundPanel(bgIcon.getImage());
        backgroundPanel.setLayout(null);
        setContentPane(backgroundPanel);

        bankImage = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")).getImage();
        cardImage = new ImageIcon(ClassLoader.getSystemResource("icon/card.png")).getImage();

        bankLabel = new JLabel();
        backgroundPanel.add(bankLabel);

        cardLabel = new JLabel();
        backgroundPanel.add(cardLabel);

        lebel1 = new JLabel("welcome to ATM");
        lebel1.setForeground(Color.WHITE);
        backgroundPanel.add(lebel1);

        lebel2 = new JLabel("Card no:");
        lebel2.setForeground(Color.WHITE);
        backgroundPanel.add(lebel2);

        textField2 = new JTextField(15);
        backgroundPanel.add(textField2);

        lebel3 = new JLabel("PIN:");
        lebel3.setForeground(Color.WHITE);
        backgroundPanel.add(lebel3);

        passwordField3 = new JPasswordField(15);
        backgroundPanel.add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.addActionListener(this);
        backgroundPanel.add(button1);

        button2 = new JButton("CLEAR");
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.addActionListener(this);
        backgroundPanel.add(button2);

        button3 = new JButton("SIGN UP");
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.addActionListener(this);
        backgroundPanel.add(button3);

        backgroundPanel.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                resizeComponents();
            }
        });

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

        SwingUtilities.invokeLater(this::resizeComponents);
    }

    private void calculateScale() {
        int panelWidth = backgroundPanel.getWidth();
        int panelHeight = backgroundPanel.getHeight();

        scale = Math.min(
                panelWidth / (double) BASE_WIDTH,
                panelHeight / (double) BASE_HEIGHT
        );

        int scaledWidth = (int) (BASE_WIDTH * scale);
        int scaledHeight = (int) (BASE_HEIGHT * scale);

        offsetX = (panelWidth - scaledWidth) / 2;
        offsetY = (panelHeight - scaledHeight) / 2;
    }

    private int sx(int value) {
        return offsetX + (int) Math.round(value * scale);
    }

    private int sy(int value) {
        return offsetY + (int) Math.round(value * scale);
    }

    private int ss(int value) {
        return Math.max(1, (int) Math.round(value * scale));
    }

    private ImageIcon scaledIcon(Image image, int width, int height) {
        Image scaled = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);
    }
    private void resizeComponents() {
    calculateScale();

    // Common alignment values
    int labelX = 150;
    int fieldX = 365;
    int fieldW = 260;
    int fieldH = 32;

    int btnY = 320;
    int btnW = 120;
    int btnH = 35;
    int gap = 20;

    // Bank icon
    bankLabel.setBounds(sx(375), sy(20), ss(100), ss(100));
    bankLabel.setIcon(scaledIcon(bankImage, ss(100), ss(100)));

    // Heading
    lebel1.setBounds(sx(250), sy(120), ss(400), ss(45));
    lebel1.setFont(new Font("AvantGarde", Font.BOLD, ss(36)));

    // Card no label
    lebel2.setBounds(sx(labelX), sy(190), ss(200), ss(40));
    lebel2.setFont(new Font("Raleway", Font.BOLD, ss(34)));

    // Card no input box
    textField2.setBounds(sx(fieldX), sy(195), ss(fieldW), ss(fieldH));
    textField2.setFont(new Font("Arial", Font.BOLD, ss(16)));

    // PIN label
    lebel3.setBounds(sx(labelX), sy(250), ss(200), ss(40));
    lebel3.setFont(new Font("AvantGarde", Font.BOLD, ss(34)));

    // PIN input box
    passwordField3.setBounds(sx(fieldX), sy(255), ss(fieldW), ss(fieldH));
    passwordField3.setFont(new Font("Arial", Font.BOLD, ss(16)));

    // SIGN IN button - starts exactly under input box
    button1.setBounds(sx(fieldX), sy(btnY), ss(btnW), ss(btnH));
    button1.setFont(new Font("Arial", Font.BOLD, ss(14)));

    // CLEAR button - same row
    button2.setBounds(sx(fieldX + btnW + gap), sy(btnY), ss(btnW), ss(btnH));
    button2.setFont(new Font("Arial", Font.BOLD, ss(14)));

    // SIGN UP button - same width as input box
    button3.setBounds(sx(fieldX), sy(375), ss(fieldW), ss(btnH));
    button3.setFont(new Font("Arial", Font.BOLD, ss(14)));

    // Card image
    cardLabel.setBounds(sx(660), sy(335), ss(110), ss(110));
    cardLabel.setIcon(scaledIcon(cardImage, ss(110), ss(110)));

    backgroundPanel.repaint();
}

    public void actionPerformed(ActionEvent e) {
        try {
             if (e.getSource() == button1) {
                Conn c = new Conn();

                String cardno = textField2.getText();
                String pin = String.valueOf(passwordField3.getPassword());

                String q = "select * from login where card_number ='" + cardno + "' and pin='" + pin + "'";
                ResultSet resultSet = c.statement.executeQuery(q);

                if (resultSet.next()) {
                    setVisible(false);
                    new main_Class(pin);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect card number or pin");
                }

            } else if (e.getSource() == button2) {
                textField2.setText("");
                passwordField3.setText("");

            } else if (e.getSource() == button3) {
                new signup();
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    class BackgroundPanel extends JPanel {
        Image backgroundImage;

        BackgroundPanel(Image backgroundImage) {
            this.backgroundImage = backgroundImage;
            setBackground(new Color(230, 230, 230));
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            calculateScale();

            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(
                    RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR
            );

            g2.drawImage(
                    backgroundImage,
                    offsetX,
                    offsetY,
                    ss(BASE_WIDTH),
                    ss(BASE_HEIGHT),
                    this
            );
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
