package schoolsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class login2 extends JFrame implements ActionListener
{
    JPanel p1;
    JButton b1,b2;
    JTextField t1;
    JPasswordField p;
     Font f1=new Font("arial",Font.BOLD,20);
    Font f2=new Font("arial",Font.BOLD,18);
    Font f3=new Font("arial",Font.BOLD,12);
    login2()
    {
        p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,700,50);
        p1.setBackground(Color.BLACK);
        add(p1);
        
        JLabel l6=new JLabel("LOGIN-FORM");
        l6.setBounds(300,7,300,30);
        l6.setForeground(Color.CYAN);
        l6.setFont(f1);
        p1.add(l6);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/3.png"));
        Image i2=i1.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel("first");
        l1.setBounds(10,7,30,30);
        l1.setIcon(i3);
        p1.add(l1);
          
        l1.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e1)
            {
                  new Choice().setVisible(true);
                  dispose();
            }
        });
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("images/log.png"));
        Image i5=i4.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel("second");
        l2.setBounds(10,90,250,250);
        l2.setIcon(i6);
        add(l2);
        
        JLabel l3=new JLabel("Username");
        l3.setBounds(300,90,100,30);
        l3.setFont(f1);
        add(l3);
        
        JLabel l4=new JLabel("Password");
        l4.setBounds(300,140,100,30);
        l4.setFont(f1);
        add(l4);
        
        t1=new JTextField();
        t1.setBounds(420,90,250,30);
        t1.setFont(f2);
        add(t1);
        
        p=new JPasswordField();
        p.setBounds(420,140,250,30);
        p.setFont(f2);
        add(p);
        
        b1=new JButton("Login");
        b1.setBounds(420,200,100,30);
        b1.setFocusable(false);
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLACK);
        b1.setFont(f1);
        add(b1);
        b1.addActionListener(this);
        
        
        
      
        
        setLayout(null);
        getContentPane().setBackground(Color.ORANGE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,400);
        setLocation(600,300);
        setUndecorated(true);
    }    
public static void main(String [] args)
    {
         new login2().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String s=e.getActionCommand();
        if(s.equals("Login"))
        {
        String username=t1.getText();
                
                String password=p.getText();
                try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/school management system", "sachin", "sachin");
                    PreparedStatement pst=null;
                    ResultSet rs=null;
                    String str="select * from login2 where name=?";
                    pst=conn.prepareStatement(str);
                    pst.setString(1, username);
                    rs=pst.executeQuery();
                    if(rs.next())
                    {
                     String pass=rs.getString("password");
                     if(password.equals(pass))
                     {
                         new mainpage2().setVisible(true);
                         dispose();
                     }
                     else
                     {
                         t1.setText(null);
                         p.setText(null);
                     }
                    }
                }catch(Exception ex)
                {
                    System.out.println(ex);
                }
    }
        if(s.equals("Cancel"))
        {
            dispose();
        }
    }
}
