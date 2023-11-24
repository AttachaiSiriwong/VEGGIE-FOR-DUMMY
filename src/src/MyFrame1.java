import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame1 extends JFrame implements ActionListener {
    JButton btt1_1, btt1_2;
    JFrame frame1;
    JLabel veget_Label;
    JPanel namePanel, bttPanel;
    MyFrame1() {
        namePanel = new JPanel();
//        redPanel.setBackground(Color.red);
        namePanel.setBounds(0,0,500,100);//set namePanel size
        namePanel.setLayout(new BorderLayout());

        bttPanel = new JPanel();
        bttPanel.setBackground(Color.red);
        bttPanel.setBounds(0,100,500,400);
        bttPanel.setLayout(new BorderLayout());

        veget_Label = new JLabel();
        veget_Label.setText("Vegie for dummy");
        veget_Label.setHorizontalAlignment(JLabel.CENTER);
        veget_Label.setVerticalAlignment(JLabel.CENTER);

        /*button1*/
        btt1_1 = new JButton();
        btt1_1.setBounds(100,100,150,100);
        btt1_1.addActionListener(this);
        btt1_1.setText("Button 1 ");
        btt1_1.setFocusable(false);
//        btt1_1.setHorizontalAlignment(JButton.NORTH);
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
        frame1.add(namePanel);
        frame1.add(bttPanel);
        namePanel.add(veget_Label);
//        bttPanel.add(btt1_1);
        frame1.add(btt1_1);
        frame1.add(btt1_2);
    }//MyFrame1
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btt1_1) {
            frame1.dispose();
            MyFrame2 secFame = new MyFrame2();
        }
        if(e.getSource() == btt1_2) {
            frame1.dispose();
            MyFrame2 secFrame = new MyFrame2();
        }//if 2
    }//ActionListener
}//class

/*shift + Fn + F6 to rename Variable all of file*/