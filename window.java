package javaprograms;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window implements ActionListener {
    JButton jb;
    JButton jb1;

    public window() {
        JFrame jf = new JFrame();
        jf.setSize(500, 500);
        jf.setLayout(null);

        JLabel jl = new JLabel("This is a label");
        jl.setBounds(200, 150, 150, 50);
        jf.add(jl);

        
        jb = new JButton("Click 1");
        jb.setBounds(200, 200, 100, 40);
        jb.addActionListener(this);
        jf.add(jb);

        jb1 = new JButton("Click 2");
        jb1.setBounds(200, 250, 100, 40);
        jb1.addActionListener(this);
        jf.add(jb1);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new window();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jb) {
            System.out.println("hello");
        } 
        else if (e.getSource() == jb1) {
            System.out.println("Bye bye");
        }
    }
}