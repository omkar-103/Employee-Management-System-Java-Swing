package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {

    JLabel heading;

    Splash() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        add(heading);

        
//        two Image Add hai
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front1.png"));
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));

        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);

        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);

        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);

        // Timer for blinking heading
        Timer timer = new Timer(500, new ActionListener() {
            boolean visible = true;

            public void actionPerformed(ActionEvent e) {
                heading.setVisible(visible);
                visible = !visible;
            }
        });
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login(); // Assuming Login is another JFrame
    }

    public static void main(String args[]) {
        new Splash();
    }
}
