import javax.swing.*;
public class frame {
    public static void main(String args[])
    {
      JFrame a=new JFrame("Window");
      JLabel b=new JLabel("this is label");
      a.add(b);
      a.setSize(1000,1000);
      a.setVisible(true);
    }
}
