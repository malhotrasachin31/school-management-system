package schoolsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;

public class classreports2 extends JFrame 
{
    JPanel p1,p2,p3;
    JLabel per;
    String set;
     Font f1=new Font("times new roman",Font.BOLD,15);
    Font f2=new Font("arial",Font.BOLD,20);
    Font f3=new Font("arial",Font.BOLD,30);
    Font f4=new Font("arial",Font.PLAIN,60);
     Font f6=new Font("arial",Font.PLAIN,250);
    Font f5=new Font("Times new roman",Font.BOLD,90);
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JComboBox ca,cb;
    JTextField a,b,c,d,e,f,g,h;
    JTextField aa,bb,cc,a4,a5,a6,a7,a8;
    JTextField x,y;
    JButton b1,b2,b3;
    
    classreports2()
    {
          p1=new JPanel();
        p1.setBackground(Color.ORANGE);
        p1.setBounds(0,0,1920,30);
        p1.setLayout(null);
        add(p1);
        
         
        JLabel label=new JLabel("Class Reports And Results of Delhi Public School");
        label.setBounds(800,0,600,30);
        label.setForeground(Color.BLACK);
        label.setFont(f2);
        p1.add(label);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/first.png"));
        Image i2=i1.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel();
        l1.setBounds(1895,5,20,20);
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
        
         JLabel label1=new JLabel("Delhi Public School");
        label1.setBounds(650,50,900,60);
        label1.setForeground(Color.BLACK);
        label1.setFont(f5);
        add(label1);
        
        JLabel sc=new JLabel("Saharanpur Zila,New Delhi 110084,Near Saharanpur Metro Station");
        sc.setBounds(550,120,1000,50);
        sc.setForeground(Color.BLACK);
        sc.setFont(f3);
        add(sc);
        
         ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("images/dps.png"));
         Image i0=i.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
         ImageIcon i11=new ImageIcon(i0);
        JLabel l=new JLabel("");
        l.setIcon(i11);
        l.setBounds(20,50,120,120);
        add(l);
        
        p2=new JPanel();
        p2.setBackground(Color.WHITE);
        p2.setBounds(10,180,1900,700);
        p2.setLayout(null);
        add(p2);
        
        JLabel result=new JLabel("Class Results");
        result.setBounds(300,10,400,70);
        result.setFont(f4);
        result.setForeground(Color.BLACK);
        p2.add(result);
        
         ca=new JComboBox();
        ca.setForeground(new Color(0,0,0));
        ca.addItem("Nursery");
        ca.addItem("U.K.G");
        ca.addItem("1st A");
        ca.addItem("1st B");
        ca.addItem("1st C");
        ca.addItem("2nd A");
        ca.addItem("2nd B");
        ca.addItem("2nd C");
        ca.addItem("3rd A");
        ca.addItem("3rd B");
        ca.addItem("3rd C");
        ca.addItem("4th A");
        ca.addItem("4th B");
        ca.addItem("4th C");
        ca.addItem("5th A");
        ca.addItem("5th B");
        ca.addItem("5th C");
        ca.addItem("6th A");
        ca.addItem("6th B");
        ca.addItem("6th C");
        ca.addItem("7th A");
        ca.addItem("7th B");
        ca.addItem("7th C");
        ca.addItem("8th A");
        ca.addItem("8th B");
        ca.addItem("8th C");
        ca.addItem("9th A");
        ca.addItem("9th B");
        ca.addItem("9th C");
        ca.addItem("11th A");
        ca.addItem("11th B");
        ca.addItem("11th C");
        ca.setFont(f2);
        ca.setBackground(Color.WHITE);
        ca.setBounds(1110,20,300,30);
        ca.setBackground(Color.WHITE);
        p2.add(ca);
        
        cb=new JComboBox();
        cb.setBackground(Color.WHITE);
        cb.setBounds(1110,60,300,30);
        cb.addItem("Term one");
        cb.addItem("Term two");
        cb.setFont(f2);
        cb.setBackground(Color.WHITE);
        p2.add(cb);
        
        JLabel name=new JLabel("Name of the Student");
        name.setBounds(100,100,310,30);
        name.setFont(f3);
        p2.add(name);
        
        t1=new JTextField();
        t1.setBounds(450,100,350,30);
        t1.setFont(f2);
        p2.add(t1);
        
        JLabel rollno=new JLabel("Roll number");
        rollno.setBounds(100,150,310,30);
        rollno.setFont(f3);
        p2.add(rollno);
        
        t2=new JTextField();
        t2.setBounds(450,150,350,30);
        t2.setFont(f2);
        p2.add(t2);
        
        JLabel sub=new JLabel("Marks of 1st Subject");
        sub.setBounds(100,250,350,30);
        sub.setFont(f3);
        p2.add(sub);
        
        JLabel one=new JLabel("FA-1(out of 50)");
        one.setBounds(460,230,200,20);
        one.setForeground(Color.RED);
        p2.add(one);
        
        JLabel two=new JLabel("FA-2(out of 50)");
        two.setBounds(580,230,200,20);
        two.setForeground(Color.RED);
        p2.add(two);
        
        JLabel three=new JLabel("SA-1(out of 100)");
         three.setBounds(700,230,200,20);
        three.setForeground(Color.RED);
        p2.add(three);
        
         t3=new JTextField();
        t3.setBounds(450,250,100,30);
        t3.setFont(f2);
        p2.add(t3);
        
         JLabel sub2=new JLabel("Marks of 2nd Subject");
        sub2.setBounds(100,300,350,30);
        sub2.setFont(f3);
        p2.add(sub2);
        
         t4=new JTextField();
        t4.setBounds(450,300,100,30);
        t4.setFont(f2);
        p2.add(t4);
        
         JLabel sub3=new JLabel("Marks of 3rd Subject");
        sub3.setBounds(100,350,350,30);
        sub3.setFont(f3);
        p2.add(sub3);
        
         t5=new JTextField();
        t5.setBounds(450,350,100,30);
        t5.setFont(f2);
        p2.add(t5);
        
         JLabel sub4=new JLabel("Marks of 4th Subject");
        sub4.setBounds(100,400,350,30);
        sub4.setFont(f3);
        p2.add(sub4);
        
         t6=new JTextField();
        t6.setBounds(450,400,100,30);
        t6.setFont(f2);
        p2.add(t6);
        
         JLabel sub5=new JLabel("Marks of 5th Subject");
        sub5.setBounds(100,450,350,30);
        sub5.setFont(f3);
        p2.add(sub5);
        
         t7=new JTextField();
        t7.setBounds(450,450,100,30);
        t7.setFont(f2);
        p2.add(t7);
        
         JLabel sub6=new JLabel("Marks of 6th Subject");
        sub6.setBounds(100,500,350,30);
        sub6.setFont(f3);
        p2.add(sub6);
        
         t8=new JTextField();
        t8.setBounds(450,500,100,30);
        t8.setFont(f2);
        p2.add(t8);
        
         JLabel t=new JLabel("Total Marks Obtained");
        t.setBounds(100,550,350,30);
        t.setFont(f3);
        p2.add(t);
         
         t9=new JTextField();
        t9.setBounds(450,550,100,30);
        t9.setEditable(false);
        t9.setFont(f2);
        p2.add(t9);
        
         JLabel ot=new JLabel("Out Off");
        ot.setBounds(100,600,350,30);
        ot.setFont(f3);
        p2.add(ot);
        
        double total=300.00;
        String out=String.valueOf(total);
        
         t10=new JTextField();
        t10.setBounds(450,600,100,30);
        t10.setFont(f2);
        t10.setEditable(false);
        t10.setText(out);
        p2.add(t10);
        
        per=new JLabel();
        per.setBounds(830,250,350,250);
        per.setBackground(Color.WHITE);
        per.setFont(f5);
        p2.add(per);
        
        per.setForeground(Color.BLACK);
        p2.add(per);
        
        b1=new JButton("Get Total");
        b1.setBounds(150,650,200,30);
        b1.setFont(f1);
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.ORANGE);
        b1.setFocusable(false);
        p2.add(b1);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                int a1=Integer.parseInt(t3.getText());
                int b1=Integer.parseInt(t4.getText());
                int c1=Integer.parseInt(t5.getText());
                int d1=Integer.parseInt(t6.getText());
                int e1=Integer.parseInt(t7.getText());
                int f1=Integer.parseInt(t8.getText()); 
                
                float total=a1+b1+c1+d1+e1+f1;
                String t=String.valueOf(total);
                t9.setText(t);
                
                int a2=Integer.parseInt(a.getText());
                int b2=Integer.parseInt(b.getText());
                int c2=Integer.parseInt(c.getText());
                int d2=Integer.parseInt(d.getText());
                int e2=Integer.parseInt(e.getText());
                int f2=Integer.parseInt(f.getText()); 
                
                 float total2=a2+b2+c2+d2+e2+f2;
                String t2=String.valueOf(total2);
                g.setText(t2);
                
                 int a3=Integer.parseInt(aa.getText());
                int b3=Integer.parseInt(bb.getText());
                int c3=Integer.parseInt(cc.getText());
                int d3=Integer.parseInt(a4.getText());
                int e3=Integer.parseInt(a5.getText());
                int f3=Integer.parseInt(a6.getText()); 
                
                 float total3=a3+b3+c3+d3+e3+f3;
                String t3=String.valueOf(total3);
                a7.setText(t3);
                
                float total4=total+total2+total3;
                String get=String.valueOf(total4);
                x.setText(get);
                
                float x1=Float.parseFloat(x.getText());
                float x2=Float.parseFloat(y.getText());
                
                float per1=x1/x2*100;
                set=String.valueOf(per1);
                per.setText(set+"%");
            }
        });
        
        a=new JTextField();
        a.setBounds(570,250,100,30);
        a.setFont(f2);
        p2.add(a);
        
         b=new JTextField();
        b.setBounds(570,300,100,30);
        b.setFont(f2);
        p2.add(b);
        
         c=new JTextField();
        c.setBounds(570,350,100,30);
        c.setFont(f2);
        p2.add(c);
        
         d=new JTextField();
        d.setBounds(570,400,100,30);
        d.setFont(f2);
        p2.add(d);
        
         e=new JTextField();
        e.setBounds(570,450,100,30);
        e.setFont(f2);
        p2.add(e);
        
         f=new JTextField();
        f.setBounds(570,500,100,30);
        f.setFont(f2);
        p2.add(f);
        
         ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("images/res.jpg"));
        Image i5=i4.getImage().getScaledInstance(770, 550, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel();
        l2.setBounds(1110,100,770,550);
        l2.setIcon(i6);
        p2.add(l2);
        
         g=new JTextField();
        g.setBounds(570,550,100,30);
        g.setFont(f2);
        g.setEditable(false);
        p2.add(g);
        
         h=new JTextField();
        h.setBounds(570,600,100,30);
        h.setFont(f2);
        h.setEditable(false);
        h.setText("300.0");
        p2.add(h);
        
         aa=new JTextField();
        aa.setBounds(690,250,100,30);
        aa.setFont(f2);
        p2.add(aa);
        
         bb=new JTextField();
        bb.setBounds(690,300,100,30);
        bb.setFont(f2);
        p2.add(bb);
        
         cc=new JTextField();
        cc.setBounds(690,350,100,30);
        cc.setFont(f2);
        p2.add(cc);
        
         a4=new JTextField();
        a4.setBounds(690,400,100,30);
        a4.setFont(f2);
        p2.add(a4);
        
         a5=new JTextField();
        a5.setBounds(690,450,100,30);
       a5.setFont(f2);
        p2.add(a5);
        
         a6=new JTextField();
        a6.setBounds(690,500,100,30);
        a6.setFont(f2);
        p2.add(a6);
        
         a7=new JTextField();
        a7.setBounds(690,550,100,30);
        a7.setFont(f2);
        a7.setEditable(false);
        p2.add(a7);
        
         a8=new JTextField();
        a8.setBounds(690,600,100,30);
        a8.setFont(f2);
        a8.setEditable(false);
        a8.setText("600.0");
        p2.add(a8);
        
        x=new JTextField();
        x.setBounds(810,550,100,30);
        x.setFont(f2);
        x.setEditable(false);
        p2.add(x);
        
        
        
         y=new JTextField();
        y.setBounds(810,600,100,30);
        y.setFont(f2);
        y.setEditable(false);
        y.setText("1200.0");
        p2.add(y);
        
        b2=new JButton("Show Classes Report");
        b2.setBounds(1580,20,300,30);
        b2.setFont(f1);
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.ORANGE);
        b2.setFocusable(false);
        p2.add(b2);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new classreport2().setVisible(true);
                dispose();
            }
        });
        
        p3=new JPanel();
        p3.setBackground(Color.WHITE);
        p3.setBounds(10,890,1900,180);
        p3.setLayout(null);
        add(p3);
        
        b3=new JButton("Add Resultl");
        b3.setBounds(450,650,200,30);
        b3.setFont(f1);
        b3.setForeground(Color.BLACK);
        b3.setBackground(Color.ORANGE);
        b3.setFocusable(false);
        p2.add(b3);
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                 try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    String str="insert  into RESULT values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    pst=con.prepareStatement(str);
                    pst.setString(1, t1.getText());
                    pst.setString(2, ca.getSelectedItem().toString());
                    pst.setString(3, t2.getText());
                    pst.setString(4, t3.getText());
                    pst.setString(5, t4.getText());
                    pst.setString(6, t5.getText());
                    pst.setString(7, t6.getText());
                    pst.setString(8, t7.getText());
                    pst.setString(9, t8.getText());
                    pst.setString(10, a.getText());
                    pst.setString(11, b.getText());
                    pst.setString(12, c.getText());
                    pst.setString(13, d.getText());
                    pst.setString(14, e.getText());
                    pst.setString(15, f.getText());
                    pst.setString(16, aa.getText());
                    pst.setString(17, bb.getText());
                    pst.setString(18, cc.getText());
                    pst.setString(19, a4.getText());
                    pst.setString(20, a5.getText());
                    pst.setString(21, a6.getText());
                    pst.setString(22, cb.getSelectedItem().toString());
                    pst.setString(23, x.getText());
                    pst.setString(24,set);
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
     new classreports2().setVisible(true);
 }
}
