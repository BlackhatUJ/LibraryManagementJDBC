import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.*;

class add extends JFrame implements ActionListener
{ JTextField f1,f2;
    JButton b1;
    JLabel l1;

    public add ()
    {   f1= new JTextField(40);
         f2= new JTextField(40);
         b1= new JButton("OK");
         l1= new JLabel("result");
        add(f1);
        add(f2);
        add(b1);
        add(l1);
        b1.addActionListener(this);

        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int num1= Integer.parseInt(f1.getText());
        int num2=Integer.parseInt(f2.getText());
        int value= num1+num2;

    }
}
public class addgui {
    public static void main(String[] args) {
        add a1= new add();
    }
    
}
