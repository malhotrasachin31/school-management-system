package schoolsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Choice extends JFrame
{
   
         JPanel p1,p2,p3;
         JButton b1,b2;
         JTextField t1;
         JPasswordField p;
    Font f1=new Font("times new roman",Font.BOLD,15);
    Font f2=new Font("arial",Font.BOLD,20);
    Font f3=new Font("arial",Font.BOLD,30);
    Font f4=new Font("arial",Font.PLAIN,60);
    Font f5=new Font("times new roman",Font.PLAIN,100);
    JTable table;
   
     Choice()
    {
         p1=new JPanel();
        p1.setBounds(0,0,1920,40);
        p1.setBackground(Color.ORANGE);
        p1.setLayout(null);
        add(p1);
        
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/first.png"));
        Image i2=i1.getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel();
        l1.setBounds(1885,5,30,30);
        l1.setIcon(i3);
        p1.add(l1);
        p1.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
               System.exit(0);
            }
        });
        
        
        JLabel label=new JLabel("DELHI PUBLIC SCHOOL MANAGEMENT SYSTEM, SAHARANPUR VILLAGE");
        label.setBounds(650,8,800,20);
        label.setForeground(Color.BLACK);
        label.setFont(f2);
        p1.add(label);
        
          ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("images/dps.png"));
         Image i0=i.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
         ImageIcon i11=new ImageIcon(i0);
        JLabel l=new JLabel("");
        l.setIcon(i11);
        l.setBounds(20,50,200,200);
        add(l);
       
         JLabel label1=new JLabel("Delhi Public School");
        label1.setBounds(620,80,1000,100);
        label1.setForeground(Color.BLACK);
        label1.setFont(f5);
        add(label1);
        
        JLabel sc=new JLabel("Saharanpur Zila,New Delhi 110084,Near Saharanpur Metro Station");
        sc.setBounds(550,170,1000,50);
        sc.setForeground(Color.BLACK);
        sc.setFont(f3);
        add(sc);
        
        b1=new JButton("Login as a Teacher");
        b1.setFont(f2);
        b1.setForeground(Color.BLACK);
        b1.setFocusable(false);
        b1.setBounds(700,250,300,40);
        b1.setBackground(Color.ORANGE);
        add(b1);
         b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
             
                new login2().setVisible(true);
                dispose();
            
            }
        });
        
     
    
        b2=new JButton("Login as an Administrator");
        b2.setFont(f2);
        b2.setForeground(Color.BLACK);
        b2.setFocusable(false);
        b2.setBounds(1000,250,300,40);
        b2.setBackground(Color.ORANGE);
        add(b2);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new login().setVisible(true);
                dispose();
            }
        });
        
        ImageIcon ia=new ImageIcon(ClassLoader.getSystemResource("images/dps2.png"));
         Image ia0=ia.getImage().getScaledInstance(1870,800,Image.SCALE_DEFAULT);
         ImageIcon ia1=new ImageIcon(ia0);
        JLabel la=new JLabel("");
        la.setIcon(ia1);
        la.setBounds(25,300,1870,750);
        add(la);
        
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2=new SimpleDateFormat("E");
        String time=sdf2.format(d);
        String date=sdf.format(d);
        
        JLabel l9=new JLabel();
        l9.setText(time);
        l9.setBounds(1620,58,150,40);
        l9.setForeground(Color.ORANGE);
        l9.setFont(f3);
        add(l9);
        
        JLabel l5=new JLabel();
        l5.setText(date);
        l5.setForeground(Color.BLACK);
        l5.setFont(f3);
        l5.setBounds(1720,58,200,40);
        add(l5);
        
        
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(40,198,250));
        setUndecorated(true);
    }
    public static void main(String args[])
    {
        new Choice().setVisible(true);
    }
}
