package schoolsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class attendence2 extends JFrame
{
    Font f1=new Font("times new roman",Font.BOLD,15);
    Font f2=new Font("arial",Font.BOLD,20);
    Font f3=new Font("arial",Font.BOLD,30);
    Font f4=new Font("arial",Font.PLAIN,60);
    Font f5=new Font("Times new roman",Font.BOLD,90);
    
    JTextField t1,t2,t3,t4;
    JButton b1;
    JPanel p1;
    
    attendence2()
    {
         p1=new JPanel();
        p1.setBounds(0,0,1310,30);
        p1.setBackground(Color.ORANGE);
        p1.setLayout(null);
        add(p1);
        
        JLabel label=new JLabel("Teachers Attendence");
        label.setBounds(550,4,500,24);
        label.setForeground(Color.BLACK);
        label.setFont(f2);
        p1.add(label);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/first.png"));
        Image i2=i1.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel();
        l1.setBounds(1285,5,20,20);
        l1.setIcon(i3);
        p1.add(l1);
        p1.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
               new mainpage2().setVisible(true);
                dispose();
            }
        });
        
        JLabel day= new JLabel("Enter the Name");
        day.setBounds(20,50,250,35);
        day.setForeground(Color.WHITE);
        day.setFont(f3);
        add(day);
        
        t1=new JTextField();
        t1.setBounds(320,50,200,35);
        t1.setFont(f2);
        t1.setForeground(Color.BLACK);
        t1.setBackground(Color.WHITE);
        add(t1);
        
        JLabel date=new JLabel("Date");
        date.setBounds(20,110,220,35);
        date.setForeground(Color.WHITE);
        date.setFont(f3);
        add(date);
        
        t2=new JTextField();
        t2.setBounds(320,110,200,35);
        t2.setFont(f2);
        t2.setForeground(Color.BLACK);
        t2.setBackground(Color.WHITE);
        add(t2);   
        
        JLabel time=new JLabel("Time");
        time.setBounds(20,170,220,35);
        time.setForeground(Color.WHITE);
        time.setFont(f3);
        add(time); 
        
        t3=new JTextField();
        t3.setBounds(320,170,200,35);
        t3.setFont(f2);
        t3.setForeground(Color.BLACK);
        t3.setBackground(Color.WHITE);
        add(t3);  
        
        JLabel oc=new JLabel("Day");
        oc.setBounds(20,230,300,35);
        oc.setForeground(Color.WHITE);
        oc.setFont(f3);
        add(oc);
        
        t4=new JTextField();
        t4.setBounds(320,230,200,35);
        t4.setFont(f2);
        t4.setForeground(Color.BLACK);
        t4.setBackground(Color.WHITE);
        add(t4);  
        
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2=new SimpleDateFormat("E");
        SimpleDateFormat sdf3=new SimpleDateFormat("HH:mm:ss");
        String dat=sdf.format(d);
        String dat2=sdf2.format(d);
        String dat3=sdf3.format(d);
        System.out.println(dat);
        t2.setText(dat);
        t4.setText(dat2);
        t3.setText(dat3);
        System.out.println(dat2);
        System.out.println(dat3);
        
        b1=new JButton("Submit");
        b1.setBackground(Color.ORANGE);
        b1.setFont(f2);
        b1.setForeground(Color.BLACK);
        b1.setFocusable(false);
        b1.setBounds(170,320,200,30);
        add(b1);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                
                
                try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    String str="insert  into ATTENDENCEOFT values(?,?,?,?)";
                    pst=con.prepareStatement(str);
                    pst.setString(1, t1.getText());
                    pst.setString(2, t2.getText());
                    pst.setString(3, t3.getText());
                    pst.setString(4, t4.getText());
                    int a=pst.executeUpdate();
                    pst.close();
                    con.close();
                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);
                    t4.setText(null);
            }catch(Exception ex){System.out.println(ex);};
            
            }
        });
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("images/attend.jpg"));
        Image i5=i4.getImage().getScaledInstance(770, 390, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel();
        l2.setBounds(540,30,770,390);
        l2.setIcon(i6);
        add(l2);
        
        setSize(1310,400);
        setLocation(300,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(32,178,170));
        setUndecorated(true);
    }
 public static void main(String args[])
 {
     new attendence2().setVisible(true);
 }
}
