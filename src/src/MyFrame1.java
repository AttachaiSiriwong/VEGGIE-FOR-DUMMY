import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame1 extends JFrame implements ActionListener {
    JButton btt1_1, btt1_2, bt3 ;
    JFrame frame1;
    JLabel veget_Lab;
    JPanel redPanel;
    MyFrame1() {
        redPanel = new JPanel();
//        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,500,100);
        redPanel.setLayout(new BorderLayout());

        veget_Lab = new JLabel();
        veget_Lab.setText("Vegie for dummy");
        veget_Lab.setHorizontalAlignment(JLabel.CENTER);
        veget_Lab.setVerticalAlignment(JLabel.CENTER);

        /*button1*/
        btt1_1 = new JButton();
        btt1_1.setBounds(100,100,150,100);
        btt1_1.addActionListener(this);
        btt1_1.setText("Button 1 ");
        btt1_1.setFocusable(false);
        /*button1*/

        /*button2*/
        btt1_2 = new JButton();
        btt1_2.setBounds(100,250,150,100);
        btt1_2.addActionListener(this);
        btt1_2.setText("Button 2");
        btt1_2.setFocusable(false);
        /*button2*/

        frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        frame1.setSize(500,500);
        frame1.setVisible(true);
//        frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame1.add(redPanel);
        redPanel.add(veget_Lab);
        frame1.add(btt1_1);
        frame1.add(btt1_2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btt1_1) {
            frame1.dispose();
            MyFrame2 secframe = new MyFrame2();
        }
        if(e.getSource() == btt1_2) {
            frame1.dispose();
            MyFrame2 secFrame = new MyFrame2();
        }
    }
}
