package Car.Rental.System;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    JTextField uid;
    JPasswordField upin;
    JLabel web;
    JButton user,admin,clear;
    Login() {
        super("Car Rental System");

//        ImageIcon image11 = new ImageIcon(ClassLoader.getSystemResource("Cars/Logo.png"));
//        Image image22 = image11.getImage().getScaledInstance(1540, 820, Image.SCALE_SMOOTH);
//        ImageIcon image33 = new ImageIcon(image22);
//        JLabel image4 = new JLabel(image33);
//        image4.setBounds(0, 0, 1540, 820);
//        add(image4);

        web = new JLabel("VEHICLE RENTAL SYSTEM");
        web.setFont(new Font("Arial",Font.BOLD,50));
        web.setBounds(460,120,800,80);
        add(web);

        JLabel id = new JLabel("USER NAME : ");
        id.setBounds(500,280,200,40);
        id.setFont(new Font("Arial",Font.BOLD,26));
        add(id);

        uid = new JTextField();
        uid.setBounds(740,280,400,40);
        uid.setFont(new Font("Arial",Font.BOLD,16));
        add(uid);

        JLabel pin = new JLabel("PIN : ");
        pin.setFont(new Font("Arial",Font.BOLD,26));
        pin.setBounds(530,340,100,40);
        add(pin);

        upin = new JPasswordField();
        upin.setBounds(740,340,400,40);
        upin.setFont(new Font("Arial",Font.BOLD,16));
        add(upin);

        user = new JButton("SIGN IN");
        user.setBounds(500,500,200,60);
        user.setFont(new Font("Arial",Font.BOLD,26));
        add(user);

        admin = new JButton("SIGN UP");
        admin.setBounds(900,500,200,60);
        admin.setFont(new Font("Arial",Font.BOLD,26));
        add(admin);

        clear = new JButton("CLEAR");
        clear.setBounds(700,500,200,60);
        clear.setFont(new Font("Arial",Font.BOLD,26));
        add(clear);

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("Cars/backbg.png"));
        Image image2 = image1.getImage().getScaledInstance(1540, 820, Image.SCALE_SMOOTH);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(0, 0, 1540, 820);
        add(image);

        setLayout(null);
        setSize(1540, 820);
        setLocation(0, 0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
