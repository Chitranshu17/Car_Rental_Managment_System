package Car.Rental.System;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class Registration extends JFrame {

    JTextField textname,textEmail,textUname,textPassword,textbgroup,textphone,textcity,textpin;
    JButton Register;
    JDateChooser datechooser;
    JRadioButton r1,r2,r3;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);
    Registration() {

        JLabel web = new JLabel("REGISTRATION FORM "+first);
        web.setFont(new Font("Arial",Font.BOLD,50));
        web.setBounds(450,100,800,80);
        add(web);

        JLabel name = new JLabel("Name : ");
        name.setBounds(480,240,100,30);
        name.setFont(new Font("Arial",Font.BOLD,26));
        add(name);

        textname = new JTextField();
        textname.setBounds(600,240,480,30);
        textname.setFont(new Font("Arial",Font.BOLD,14));
        add(textname);

        JLabel ename = new JLabel("Email : ");
        ename.setBounds(480,290,100,30);
        ename.setFont(new Font("Arial",Font.BOLD,26));
        add(ename);

        textEmail = new JTextField();
        textEmail.setBounds(600,290,480,30);
        textEmail.setFont(new Font("Arial",Font.BOLD,14));
        add(textEmail);

        JLabel uname = new JLabel("User name : ");
        uname.setBounds(480,340,180,30);
        uname.setFont(new Font("Arial",Font.BOLD,26));
        add(uname);

        textUname = new JTextField();
        textUname.setBounds(680,340,400,30);
        textUname.setFont(new Font("Arial",Font.BOLD,14));
        add(textUname);

        JLabel pass = new JLabel("Password : ");
        pass.setBounds(480,400,180,30);
        pass.setFont(new Font("Arial",Font.BOLD,26));
        add(pass);

        textPassword = new JTextField();
        textPassword.setBounds(680,400,400,30);
        textPassword.setFont(new Font("Arial",Font.BOLD,14));
        add(textPassword);

        Register = new JButton("Register");
        Register.setFont(new Font("Arial",Font.BOLD,24));
        Register.setBounds(1150,540,300,60);
        add(Register);

        JLabel gender1 = new JLabel("Gender : ");
        gender1.setBounds(480,450,180,30);
        gender1.setFont(new Font("Arial",Font.BOLD,26));
        add(gender1);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Arial",Font.BOLD,16));
        r1.setBounds(690,455,100,30);
        r1.setOpaque(false);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Arial",Font.BOLD,16));
        r2.setBounds(800,455,100,30);
        r2.setOpaque(false);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Arial",Font.BOLD,16));
        r3.setBounds(910,455,100,30);
        r3.setOpaque(false);
        add(r3);

        JLabel bgroup = new JLabel("Blood Group : ");
        bgroup.setBounds(480,500,200,30);
        bgroup.setFont(new Font("Arial",Font.BOLD,26));
        add(bgroup);

        textbgroup = new JTextField();
        textbgroup.setBounds(680,500,400,30);
        textbgroup.setFont(new Font("Arial",Font.BOLD,14));
        add(textbgroup);

        ButtonGroup button = new ButtonGroup();
        button.add(r1);
        button.add(r2);
        button.add(r3);

        JLabel date = new JLabel("D.O.B : ");
        date.setBounds(480,550,100,30);
        date.setFont(new Font("Arial",Font.BOLD,26));
        add(date);

        datechooser = new JDateChooser();
        datechooser.setBounds(600,550,480,30);
        datechooser.setFont(new Font("Arial",Font.BOLD,14));
        add(datechooser);

        JLabel phone = new JLabel("Phone : ");
        phone.setBounds(480,600,150,30);
        phone.setFont(new Font("Arial",Font.BOLD,26));
        add(phone);

        textphone = new JTextField();
        textphone.setBounds(650,600,430,30);
        textphone.setFont(new Font("Arial",Font.BOLD,14));
        add(textphone);

        JLabel city = new JLabel("City : ");
        city.setBounds(480,650,100,30);
        city.setFont(new Font("Arial",Font.BOLD,26));
        add(city);

        textcity = new JTextField();
        textcity.setBounds(600,650,480,30);
        textcity.setFont(new Font("Arial",Font.BOLD,14));
        add(textcity);

        JLabel pin = new JLabel("Pin Code : ");
        pin.setBounds(480,700,150,30);
        pin.setFont(new Font("Arial",Font.BOLD,26));
        add(pin);

        textpin = new JTextField();
        textpin.setBounds(650,700,430,30);
        textpin.setFont(new Font("Arial",Font.BOLD,14));
        add(textpin);







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
        new Registration();
    }
}
