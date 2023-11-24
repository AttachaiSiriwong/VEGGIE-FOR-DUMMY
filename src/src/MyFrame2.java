import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame2 extends JFrame implements ActionListener {
        JFrame frame2;
        JLabel label1;
        JButton btt2_1;
    MyFrame2(){
        label1 = new JLabel();
        label1.setBounds(0,0,500,100);
        label1.setFont(Font.getFont("comic Sans"));
        label1.setText("U click it. Now go back");

        btt2_1 = new JButton();
        btt2_1.setBounds(120,120,150,100);
        btt2_1.addActionListener(this);
        btt2_1.setText("Go back");
        btt2_1.setFocusable(false);

        frame2 = new JFrame();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null);
        frame2.setSize(500,500);
        frame2.setVisible(true);
//        frame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame2.add(label1);
        frame2.add(btt2_1);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btt2_1) {
            frame2.dispose();
            MyFrame1 firstFrame = new MyFrame1();
        }
    }
}
