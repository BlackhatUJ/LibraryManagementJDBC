
import javax.swing.JFrame;
import javax.swing.JLabel;
import java. awt. FlowLayout;
//import javax.swing.LayoutStyle;

class abc extends JFrame
{
public abc()
{
    setLayout(new FlowLayout()); //flowlayout, gridlayout, null  to add the another text/ lable in the window
    
JLabel l= new JLabel("hello world");
JLabel l1= new JLabel("ujjwal");

add(l);
add(l1);
   setVisible(true);
    setSize(800, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to make the exit button working
}
}
public class gui {
    public static void main(String[] args) {
        abc a1= new abc();
        
    }

    
}
