package schoolsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

public class admissions extends JFrame
{
    JPanel p1;
    JComboBox ca;
  
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JRadioButton male,female;
    JButton b1,b2;
    Font f1=new Font("times new roman",Font.BOLD,15);
    Font f2=new Font("arial",Font.BOLD,20);
    Font f3=new Font("arial",Font.BOLD,30);
    Font f4=new Font("arial",Font.PLAIN,60);
    Font f6=new Font("arial",Font.PLAIN,250);
    Font f5=new Font("Times new roman",Font.BOLD,90);
    JTable table;
  
    admissions()
    {
    
        p1=new JPanel();
        p1.setBounds(0,0,1920,40);
        p1.setBackground(Color.ORANGE);
        p1.setLayout(null);
        add(p1);
        
        JLabel label=new JLabel("Admissions of students");
        label.setBounds(900,8,500,20);
        label.setForeground(Color.BLACK);
        label.setFont(f2);
        p1.add(label);
        
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
                new mainpage().setVisible(true);
                dispose();
            }
        });
        
        JPanel p2=new JPanel();
        p2.setBounds(0,0,400,1080);
        p2.setLayout(null);
        //p2.setBackground(new Color(128,0,0));
        p2.setBackground(Color.WHITE);
        p2.setForeground(new Color(40,198,250));
        add(p2);
        
        
        
        JLabel t=new JLabel("Total");
        t.setBounds(120,130,350,80);
        t.setFont(f4);
        t.setForeground(Color.BLACK);
        p2.add(t);
        
        JLabel all=new JLabel("Admissions");
        all.setBounds(60,200,350,80);
        all.setFont(f4);
        all.setForeground(Color.BLACK);
        p2.add(all);
        
       
        
        JLabel no=new JLabel();
        no.setBounds(50,500,350,200);
        no.setForeground(Color.BLACK);
        no.setFont(f6);
        p2.add(no);
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select count(*) from NURSERY ";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
            int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);
            
        }catch(Exception ex){System.out.print(ex);};
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("images/dps.png"));
        Image i0=i.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i11=new ImageIcon(i0);
        JLabel l=new JLabel("");
        l.setIcon(i11);
        l.setBounds(430,50,200,200);
        add(l);
        
         JLabel label1=new JLabel("Delhi Public School");
        label1.setBounds(850,80,900,80);
        label1.setForeground(Color.BLACK);
        label1.setFont(f5);
        add(label1);
        
        JLabel sc=new JLabel("Saharanpur Zila,New Delhi 110084,Near Saharanpur Metro Station");
        sc.setBounds(750,170,1000,50);
        sc.setForeground(Color.BLACK);
        sc.setFont(f3);
        add(sc);
        
         JLabel name=new JLabel("Name of the Candidate");
         name.setBounds(430,370,400,40);
         name.setFont(f3);
         name.setForeground(Color.BLACK);
         add(name);
      
         t1=new JTextField();
         t1.setBounds(800,370,300,40);
         t1.setFont(f3);
         t1.setForeground(Color.BLACK);
         add(t1);
        
         JLabel sex=new JLabel("Sex");
         sex.setBounds(1300,370,100,40);
         sex.setFont(f3);
         sex.setForeground(Color.BLACK);
         add(sex);
         
        male=new JRadioButton("Male");
        male.setBackground(new Color(40,198,250));
        male.setBounds(1400,370,100,40);
        male.setFocusable(false);
        male.setFont(f2);
        add(male);
        male.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                if(male.isSelected())
                {
                    male.setSelected(true);
                    female.setSelected(false);
                }
                if(!male.isSelected())
                {
                    male.setSelected(false);
                    female.setSelected(true);
                }
            }
        });
       
        female=new JRadioButton("Female");
        female.setBackground(new Color(40,198,250));
        female.setBounds(1500,370,100,40);
        female.setFocusable(false);
        female.setFont(f2);
        add(female);
        female.addMouseListener(new MouseAdapter()
                {
                    public void mouseClicked(MouseEvent me)
                    {
                       if(female.isSelected())
                       {
                            male.setSelected(false);
                            female.setSelected(true);
                       }
                       if(!female.isSelected())
                       {
                            male.setSelected(true);
                            female.setSelected(false);
                       }
                    }
                });
        
         
         JLabel fat=new JLabel("Fathers Name");
         fat.setBounds(430,440,300,40);
         fat.setFont(f3);
         fat.setForeground(Color.BLACK);
         add(fat);
         
         t2=new JTextField();
         t2.setBounds(800,440,300,40);
         t2.setFont(f3);
         t2.setForeground(Color.BLACK);
         add(t2);
         
         JLabel add=new JLabel("Address");
         add.setBounds(430,510,300,40);
         add.setFont(f3);
         add.setForeground(Color.BLACK);
         add(add);
         
         t4=new JTextField();
         t4.setBounds(800,510,1100,40);
         t4.setFont(f3);
         t4.setForeground(Color.BLACK);
         add(t4);
         
         JLabel tel=new JLabel("Phone  Number");
         tel.setBounds(430,580,300,40);
         tel.setFont(f3);
         tel.setForeground(Color.BLACK);
         add(tel);
         
         t5=new JTextField();
         t5.setBounds(800,580,300,40);
         t5.setFont(f3);
         t5.setForeground(Color.BLACK);
         add(t5);
         
         JLabel dob=new JLabel("Date Of Birth(D.O.B)");
         dob.setBounds(430,650,300,40);
         dob.setFont(f3);
         dob.setForeground(Color.BLACK);
         add(dob);
         
         t6=new JTextField();
         t6.setBounds(800,650,300,40);
         t6.setFont(f3);
         t6.setForeground(Color.BLACK);
         add(t6);
         
         JLabel reg=new JLabel("Registration Number");
         reg.setBounds(430,720,300,40);
         reg.setFont(f3);
         reg.setForeground(Color.BLACK);
         add(reg);
         
         t7=new JTextField();
         t7.setBounds(800,720,300,40);
         t7.setFont(f3);
         t7.setForeground(Color.BLACK);
         add(t7);
         
         JLabel fe=new JLabel("Fees");
         fe.setBounds(430,890,100,40);
         fe.setFont(f3);
         fe.setForeground(Color.BLACK);
         add(fe);
         
         t8=new JTextField();
         t8.setBounds(530,890,150,40);
         t8.setFont(f3);
         t8.setForeground(Color.BLACK);
         add(t8);
         
         b1=new JButton("Submit");
         b1.setBackground(Color.ORANGE);
         b1.setFont(f2);
         b1.setForeground(Color.BLACK);
         b1.setFocusable(false);
         b1.setBounds(1000,1000,200,40);
         add(b1);
         
         JLabel alt=new JLabel("Alternative Number");
         alt.setBounds(1300,580,300,40);
         alt.setFont(f3);
         alt.setForeground(Color.BLACK);
         add(alt);
         
         t9=new JTextField();
         t9.setBounds(1600,580,300,40);
         t9.setFont(f3);
         t9.setForeground(Color.BLACK);
         add(t9);
         
         JLabel mot=new JLabel("Mothers Name");
         mot.setBounds(1300,440,300,40);
         mot.setFont(f3);
         mot.setForeground(Color.BLACK);
         add(mot);
         
         t3=new JTextField();
         t3.setBounds(1600,440,300,40);
         t3.setFont(f3);
         t3.setForeground(Color.BLACK);
         add(t3);
         
         JLabel clas=new JLabel("Admission in Class");
         clas.setBounds(1300,250,300,40);
         clas.setFont(f3);
         clas.setForeground(Color.BLACK);
         add(clas);
         
         ca=new JComboBox();
        ca.setForeground(new Color(0,0,0));
        ca.addItem("Nursery");
        ca.addItem("UKG");
        ca.addItem("1st-A");
        ca.addItem("1st-B");
        ca.addItem("1st-C");
        ca.addItem("2nd-A");
        ca.addItem("2nd-B");
        ca.addItem("2nd-C");
        ca.addItem("3rd-A");
        ca.addItem("3rd-B");
        ca.addItem("3rd-C");
        ca.addItem("4th-A");
        ca.addItem("4th-B");
        ca.addItem("4th-C");
        ca.addItem("5th-A");
        ca.addItem("5th-B");
        ca.addItem("5th-C");
        ca.addItem("6th-A");
        ca.addItem("6th-B");
        ca.addItem("6th-C");
        ca.addItem("7th-A");
        ca.addItem("7th-B");
        ca.addItem("7th-C");
        ca.addItem("8th-A");
        ca.addItem("8th-B");
        ca.addItem("8th-C");
        ca.addItem("9th-A");
        ca.addItem("9th-B");
        ca.addItem("9th-C");
        ca.addItem("10th- A");
        ca.addItem("10th-B");
        ca.addItem("!0th-C");
        ca.addItem("11th-A");
        ca.addItem("11th-B");
        ca.addItem("11th-C");
        ca.addItem("12th-A");
        ca.addItem("12th-B");
        ca.addItem("12th-C");
        ca.setFont(f2);
        ca.setBackground(Color.WHITE);
        ca.setBounds(1610,250,300,40);
        add(ca);
        ;
         
        
           
                b1.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae1)
                    {
                         try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    String str1="insert  into NURSERY values(?,?,?,?,?,?,?,?,?,?,?)";
                    pst=con.prepareStatement(str1);
                    pst.setString(1, ca.getSelectedItem().toString());
                    pst.setString(2, t1.getText());
                    pst.setString(3, t2.getText());
                    pst.setString(4, t3.getText());
                    pst.setString(5, t4.getText());
                    pst.setString(6, t5.getText());
                    pst.setString(7, t9.getText());
                    pst.setString(8,t6.getText());
                    pst.setString(9, t7.getText());
                    pst.setString(10,t8.getText());
                     if(male.isSelected())
                    {
                        pst.setString(11, "Male");
                    }
                    if(!male.isSelected())
                    {
                        pst.setString(11, "Female");
                    }
                    int a=pst.executeUpdate();
                    pst.close();
                    con.close();
                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);
                    t4.setText(null);
                    t5.setText(null);
                    t6.setText(null);
                    t7.setText(null);
                    t8.setText(null);
                    t9.setText(null);
                    b1.setVisible(false);

                }catch(Exception ex){System.out.println(ex);};
                    }
                });
                
        
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(40,198,250));
        setUndecorated(true);
        
    }
    public static void main(String args[])
    {
    new admissions().setVisible(true);
     }
}
