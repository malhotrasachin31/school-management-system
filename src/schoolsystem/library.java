package schoolsystem;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import net.proteanit.sql.DbUtils;

public class library extends JFrame
{
    JPanel p1,p2,p3,p4,p5,p6,p7,p8;
    JButton ba;
    JButton att,att2,eve;
    JTable event,table5;
    Font f1=new Font("times new roman",Font.BOLD,15);
     Font fa=new Font("Arial",Font.BOLD,15);
     Font fb=new Font("Arial",Font.BOLD,25);
    Font f2=new Font("arial",Font.BOLD,20);
    Font f3=new Font("arial",Font.BOLD,30);
    Font f4=new Font("arial",Font.PLAIN,60);
    Font f5=new Font("arial",Font.PLAIN,100);
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,ta,tb,tc;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    
    library()
    {
         p1=new JPanel();
        p1.setBounds(0,0,1920,40);
        p1.setBackground(Color.ORANGE);
        p1.setLayout(null);
        add(p1);
        
        JLabel label=new JLabel("Library Management System");
        label.setBounds(800,8,500,20);
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
     
        p3=new JPanel();
        p3.setLayout(null);
        p3.setBounds(810,60,350,150);
        p3.setBackground(new Color(40,198,250));
        add(p3);
        
      
        
        JLabel count=new JLabel("Total Books");
        count.setBounds(20,60,300,30);
        count.setForeground(Color.WHITE);
        count.setFont(f3);
        p3.add(count);
        
        JLabel no=new JLabel();
        no.setBounds(210,40,300,80);
        no.setForeground(Color.WHITE);
        no.setFont(f5);
        p3.add(no);
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select count(*) from LIBRARY ";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
            int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);
            
        }catch(Exception ex){System.out.print(ex);};
        
        
        p4=new JPanel();
        p4.setBounds(0,40,790,500);
        p4.setLayout(new GridLayout(1,1));
        p4.setBackground(Color.WHITE);
        add(p4);
        
        
        
        JTable table=new JTable();
        table.setFont(f2);
        table.setRowHeight(table.getColumnCount()+30);
        p4.add(table);
        
        p5=new JPanel();
        p5.setBounds(1180,60,350,150);
        p5.setLayout(null);
        p5.setBackground(new Color(0,204,102));
        add(p5);
        
       
        
        JScrollPane jsp=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        p4.add(jsp);
        
           JLabel no3=new JLabel();
        no3.setBounds(190,40,300,80);
        no3.setForeground(Color.WHITE);
        no3.setFont(f5);
        p5.add(no3);
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select count(*) from RETURN";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
            int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no3.setText(number);
            
        }catch(Exception ex){System.out.print(ex);};
        
        
     
        
        JLabel count3=new JLabel("Returned");
        count3.setBounds(20,60,300,30);
        count3.setForeground(Color.WHITE);
        count3.setFont(f3);
        p5.add(count3);
        
       
        
         p6=new JPanel();
        p6.setBounds(1550,60,350,150);
        p6.setLayout(null);
        p6.setBackground(new Color(204,0,0));
        add(p6);
        
         JLabel count4=new JLabel("Borrowed");
        count4.setBounds(20,60,300,30);
        count4.setForeground(Color.WHITE);
        count4.setFont(f3);
        p6.add(count4);
        
        JLabel no4=new JLabel();
        no4.setBounds(190,40,300,80);
        no4.setForeground(Color.WHITE);
        no4.setFont(f5);
        p6.add(no4);
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select count(*) from  BORROW";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
            int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no4.setText(number);
            
        }catch(Exception ex){System.out.print(ex);};
        
        
        
        
        p8=new JPanel();
        p8.setBounds(810,260,545,800);
        p8.setBackground(Color.WHITE);
        p8.setLayout(null);
        add(p8);
        
        JLabel teachers=new JLabel("Teachers Column");
        teachers.setBounds(50,10,500,70);
        teachers.setFont(f4);
        p8.add(teachers);
        
        JLabel name=new JLabel("Name");
        name.setBounds(60,100,200,30);
        name.setFont(f2);
        p8.add(name);
        
        t1=new JTextField();
        t1.setBounds(180,100,300,30);
        t1.setFont(f2);
        p8.add(t1);
        
        JLabel id=new JLabel("Book-ID");
        id.setBounds(60,150,200,30);
        id.setFont(f2);
        p8.add(id);
        
         t2=new JTextField();
        t2.setBounds(180,150,300,30);
        t2.setFont(f2);
        p8.add(t2);
        
        JLabel Date=new JLabel("Date");
        Date.setBounds(60,200,200,30);
        Date.setFont(f2);
        p8.add(Date);
        
         t3=new JTextField();
        t3.setBounds(180,200,300,30);
        t3.setFont(f2);
        p8.add(t3);
        
         JLabel bn=new JLabel("Book-Name");
        bn.setBounds(60,250,200,30);
        bn.setFont(f2);
        p8.add(bn);
        
         t4=new JTextField();
        t4.setBounds(180,250,300,30);
        t4.setFont(f2);
        p8.add(t4);
        
        JLabel a=new JLabel("Author");
        a.setBounds(60,300,200,30);
        a.setFont(f2);
        p8.add(a);
        
         t5=new JTextField();
        t5.setBounds(180,300,300,30);
        t5.setFont(f2);
        p8.add(t5);
        
        b1=new JButton("Borrow");
        b1.setBounds(280,350,200,30);
        b1.setFont(f1);
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.BLACK);
        b1.setFocusable(false);
        p8.add(b1);
        b1.addActionListener(new ActionListener()
        {
            String teach = "Teacher";
            public void actionPerformed(ActionEvent ae)
            {
                  try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    ResultSet rs=null;
                    String str="insert into BORROW values (?,?,?,?,?,?) ";
                    String st2="DELETE  FROM LIBRARY WHERE ID=?";
                   pst=con.prepareStatement(str);
                    pst.setString(1, t1.getText());
                    pst.setString(2, t2.getText());
                    pst.setString(3, teach);
                    pst.setString(4, t3.getText());
                    pst.setString(5, t4.getText());
                    pst.setString(6, t5.getText());
                    int a=pst.executeUpdate();
                   pst=con.prepareStatement(st2);
                   pst.setString(1, t2.getText());
                  
                   new library().setVisible(true);
                   dispose();
                   pst.executeUpdate();
                    pst.close();
                    con.close();
                   t1.setText(null);
                   t2.setText(null);
                   t3.setText(null);
                   t4.setText(null);
                   t5.setText(null);
                }catch(Exception ex){System.out.println(ex);};
            }
        });
        
        
         b2=new JButton("Return");
        b2.setBounds(60,350,200,30);
        b2.setFont(f1);
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.BLACK);
        b2.setFocusable(false);
        p8.add(b2);
        b2.addActionListener(new ActionListener()
        {
            String teach = "Teacher";
            public void actionPerformed(ActionEvent ae1)
            {
                  try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    ResultSet rs=null;
                   String str2="insert into RETURN values (?,?,?,?,?,?) ";
                    pst=con.prepareStatement(str2);
                    pst.setString(1, t1.getText());
                    pst.setString(2, t2.getText());
                    pst.setString(3, teach);
                    pst.setString(4, t3.getText());
                    pst.setString(5, t4.getText());
                    pst.setString(6, t5.getText());
                    int a=pst.executeUpdate();
                    
                  String str4="DELETE FROM BORROW WHERE BOOKID=?";
                   pst=con.prepareStatement(str4);
                   pst.setString(1, t2.getText());
                   new library().setVisible(true);
                   dispose();
                  int b= pst.executeUpdate();
                 
                    
                    pst.close();
                    con.close();
                    
                   t1.setText(null);
                   t2.setText(null);
                   t3.setText(null);
                   t4.setText(null);
                   t5.setText(null);
                }catch(Exception ex){System.out.println(ex);};
            }
        });
      
        
        p7=new JPanel();
        p7.setBounds(1365,260,535,800);
        p7.setBackground(Color.WHITE);
        p7.setLayout(null);
        add(p7);
       
          ImageIcon i111=new ImageIcon(ClassLoader.getSystemResource("images/lt.jpg"));
        Image i112=i111.getImage().getScaledInstance(600,300, Image.SCALE_DEFAULT);
        ImageIcon i113=new ImageIcon(i112);
        JLabel l111=new JLabel();
        l111.setBounds(0,500,600,300);
        l111.setIcon(i113);
        p8.add(l111);
        
           ImageIcon i1111=new ImageIcon(ClassLoader.getSystemResource("images/stl.jpg"));
        Image i1112=i1111.getImage().getScaledInstance(600,300, Image.SCALE_DEFAULT);
        ImageIcon i1113=new ImageIcon(i1112);
        JLabel l1111=new JLabel();
        l1111.setBounds(0,500,600,300);
        l1111.setIcon(i1113);
        p7.add(l1111);
        
          JLabel teachers1=new JLabel("Students Column");
        teachers1.setBounds(50,10,500,70);
        teachers1.setFont(f4);
        p7.add(teachers1);
        
        JLabel name1=new JLabel("Name");
        name1.setBounds(60,100,200,30);
        name1.setFont(f2);
        p7.add(name1);
        
        t6=new JTextField();
        t6.setBounds(180,100,300,30);
        t6.setFont(f2);
        p7.add(t6);
        
        JLabel id2=new JLabel("Book-ID");
        id2.setBounds(60,150,200,30);
        id2.setFont(f2);
        p7.add(id2);
        
         t7=new JTextField();
        t7.setBounds(180,150,300,30);
        t7.setFont(f2);
        p7.add(t7);
        
        JLabel Date2=new JLabel("Date");
        Date2.setBounds(60,200,200,30);
        Date2.setFont(f2);
        p7.add(Date2);
        
         t8=new JTextField();
        t8.setBounds(180,200,300,30);
        t8.setFont(f2);
        p7.add(t8);
        
         JLabel bn2=new JLabel("Book-Name");
        bn2.setBounds(60,250,200,30);
        bn2.setFont(f2);
        p7.add(bn2);
        
         t9=new JTextField();
        t9.setBounds(180,250,300,30);
        t9.setFont(f2);
        p7.add(t9);
        
        JLabel a2=new JLabel("Author");
        a2.setBounds(60,300,200,30);
        a2.setFont(f2);
        p7.add(a2);
        
         t10=new JTextField();
        t10.setBounds(180,300,300,30);
        t10.setFont(f2);
        p7.add(t10);
        
        b4=new JButton("Borrow");
        b4.setBounds(280,350,200,30);
        b4.setFont(f1);
        b4.setBackground(Color.ORANGE);
        b4.setForeground(Color.BLACK);
        b4.setFocusable(false);
        p7.add(b4);
        b4.addActionListener(new ActionListener()
        {
            String teach = "Student";
            public void actionPerformed(ActionEvent ae)
            {
                  try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    ResultSet rs=null;
                    String str="insert into BORROW values (?,?,?,?,?,?) ";
                    String st2="DELETE  FROM LIBRARY WHERE ID=?";
                   pst=con.prepareStatement(str);
                    pst.setString(1, t6.getText());
                    pst.setString(2, t7.getText());
                    pst.setString(3, teach);
                    pst.setString(4, t8.getText());
                    pst.setString(5, t9.getText());
                    pst.setString(6, t10.getText());
                    int a=pst.executeUpdate();
                   pst=con.prepareStatement(st2);
                   pst.setString(1, t7.getText());
                  
                   new library().setVisible(true);
                   pst.executeUpdate();
                    pst.close();
                    con.close();
                   t1.setText(null);
                   t2.setText(null);
                   t3.setText(null);
                   t4.setText(null);
                   t5.setText(null);
                }catch(Exception ex){System.out.println(ex);};
            }
        });
        
        
        
        
         b3=new JButton("Return");
        b3.setBounds(60,350,200,30);
        b3.setFont(f1);
        b3.setBackground(Color.ORANGE);
        b3.setForeground(Color.BLACK);
        b3.setFocusable(false);
        p7.add(b3);
        b3.addActionListener(new ActionListener()
        {
            String teach = "Student";
            public void actionPerformed(ActionEvent ae1)
            {
                  try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                    PreparedStatement pst=null;
                    ResultSet rs=null;
                   String str2="insert into RETURN values (?,?,?,?,?,?) ";
                    pst=con.prepareStatement(str2);
                    pst.setString(1, t6.getText());
                    pst.setString(2, t7.getText());
                    pst.setString(3, teach);
                    pst.setString(4, t8.getText());
                    pst.setString(5, t9.getText());
                    pst.setString(6, t10.getText());
                    int a=pst.executeUpdate();
                    
                  String str4="DELETE FROM BORROW WHERE BOOKID=?";
                   pst=con.prepareStatement(str4);
                   pst.setString(1, t7.getText());
                   new library().setVisible(true);
                  int b= pst.executeUpdate();
                   
                 
                    pst.close();
                    con.close();
                   t1.setText(null);
                   t2.setText(null);
                   t3.setText(null);
                   t4.setText(null);
                   t5.setText(null);
                }catch(Exception ex){System.out.println(ex);};
            }
        });
      
        
        att=new JButton("Show All Books");
        att.setBounds(810,220,350,25);
        att.setFocusable(false);
        att.setBackground(Color.ORANGE);
        att.setForeground(Color.BLACK);
        att.setFont(f1);
        add(att);
        att.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                 try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select * from LIBRARY ";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
           table.setModel(DbUtils.resultSetToTableModel(rs));
            /*int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);*/
            
        }catch(Exception ex){System.out.print(ex);};
            }
        });
        
         
       JPanel p6=new JPanel();
        p6.setBounds(0,630,790,430);
        p6.setBackground(Color.WHITE);
        p6.setLayout(null);
        add(p6);
        
          JLabel teachers21=new JLabel("ADD BOOKS");
        teachers21.setBounds(70,10,500,70);
        teachers21.setFont(f4);
        p6.add(teachers21);
        
        JLabel name21=new JLabel("Name");
        name21.setBounds(40,100,200,30);
        name21.setFont(f2);
        p6.add(name21);
        
        ta=new JTextField();
        ta.setBounds(180,100,250,30);
        ta.setFont(f2);
        p6.add(ta);
        
        JLabel id12=new JLabel("Book-ID");
        id12.setBounds(40,150,200,30);
        id12.setFont(f2);
        p6.add(id12);
        
         tb=new JTextField();
        tb.setBounds(180,150,250,30);
        tb.setFont(f2);
        p6.add(tb);
        
        JLabel Date12=new JLabel("Author");
        Date12.setBounds(40,200,200,30);
        Date12.setFont(f2);
        p6.add(Date12);
        
         tc=new JTextField();
        tc.setBounds(180,200,250,30);
        tc.setFont(f2);
        p6.add(tc);
        
        
        ba=new JButton("Add Books To Library");
        ba.setBounds(40,250,385,25);
        ba.setFocusable(false);
        ba.setBackground(Color.ORANGE);
        ba.setForeground(Color.BLACK);
        ba.setFont(f1);
        p6.add(ba);
        ba.addActionListener(new ActionListener()
        {
         public void actionPerformed(ActionEvent ae)
         {
             try{
                  Class.forName("org.apache.derby.jdbc.ClientDriver");
                  Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
                  PreparedStatement pst=null;
                  String str3="insert into LIBRARY values(?,?,?) ";
                   pst=con.prepareStatement(str3);
                   pst.setString(1, ta.getText());
                   pst.setString(2, tb.getText());
                   pst.setString(3, tc.getText());
                    int d=pst.executeUpdate();
                    dispose();
                    new library().setVisible(true);
                    ta.setText(null);
                    tb.setText(null);
                    tc.setText(null);
             }catch(Exception ex){System.out.println(ex);};
         }
        });
        
        
         b5=new JButton("Show All Return Books");
        b5.setBounds(10,550,375,25);
        b5.setFocusable(false);
        b5.setBackground(Color.ORANGE);
        b5.setForeground(Color.BLACK);
        b5.setFont(f1);
        add(b5);
         b5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select * from RETURN ";
            
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
           table.setModel(DbUtils.resultSetToTableModel(rs));
            /*int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);*/
            
        }catch(Exception ex){System.out.print(ex);};
            }
        });
        
        b6=new JButton("Show Returned Books By Students");
        b6.setBounds(10,590,375,25);
        b6.setFocusable(false);
        b6.setBackground(Color.ORANGE);
        b6.setForeground(Color.BLACK);
        b6.setFont(f1);
        add(b6);
        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select * from RETURN where STUDENTORTEACHER= 'Student' ";
            
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
           table.setModel(DbUtils.resultSetToTableModel(rs));
            /*int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);*/
            
        }catch(Exception ex){System.out.print(ex);};
            }
        });
        
        
        b7=new JButton("Show All Borrowed Books");
        b7.setBounds(410,590,375,25);
        b7.setFocusable(false);
        b7.setBackground(Color.ORANGE);
        b7.setForeground(Color.BLACK);
        b7.setFont(f1);
        add(b7);
        b7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select * from BORROW  ";
            
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
           table.setModel(DbUtils.resultSetToTableModel(rs));
            /*int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);*/
            
        }catch(Exception ex){System.out.print(ex);};
            }
        });
        
        
        b8=new JButton("Show Returned Books By Teachers");
        b8.setBounds(410,550,375,25);
        b8.setFocusable(false);
        b8.setBackground(Color.ORANGE);
        b8.setForeground(Color.BLACK);
        b8.setFont(f1);
        add(b8);
        b8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select * from RETURN where STUDENTORTEACHER= 'Teacher' ";
            
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
           table.setModel(DbUtils.resultSetToTableModel(rs));
            /*int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);*/
            
        }catch(Exception ex){System.out.print(ex);};
            }
        });
        
        
        att2=new JButton("Show Borrowed Books By Students");
        att2.setBounds(1180,220,350,25);
        att2.setFocusable(false);
        att2.setBackground(Color.ORANGE);
        att2.setForeground(Color.BLACK);
        att2.setFont(f1);
        add(att2);
        att2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select * from BORROW where TEACHERORSTUDENT= 'Student' ";
            
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
           table.setModel(DbUtils.resultSetToTableModel(rs));
            /*int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);*/
            
        }catch(Exception ex){System.out.print(ex);};
            }
        });
        
        
        eve=new JButton("Show Borrowed Books By Teachers");
        eve.setBounds(1550,220,350,25);
        eve.setFocusable(false);
        eve.setBackground(Color.ORANGE);
        eve.setForeground(Color.BLACK);
        eve.setFont(f1);
        add(eve);
        eve.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                 try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system","sachin","sachin");
            PreparedStatement pst=null;
            ResultSet rs=null;
            String str="select * from BORROW  where TEACHERORSTUDENT= 'Teacher' ";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            rs.next();
           table.setModel(DbUtils.resultSetToTableModel(rs));
            
            /*int cont=rs.getInt(1);
            String number=String.valueOf(cont);
            no.setText(number);*/
            
        }catch(Exception ex){System.out.print(ex);};
            }
        });
       
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
         getContentPane().setBackground(new Color(173,216,230));
        setUndecorated(true);
    }
    public static void main(String args[])
    {
        new library().setVisible(true);
    }
}
