package NEW;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class tem extends JFrame{
    public JButton test = new JButton("=");
    public JButton EXIT = new JButton("EXIT");
    public JTextField field = new JTextField();
    public JLabel label = new JLabel("華氏");
    public JLabel label1 = new JLabel("攝氏");
    public int x = 1;

    public tem(){
        xd();
    }
    public void xd(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(800,600);

        test.setBounds(400,200,140,40);

        field.setBounds(260,200,140,40);

        label.setBounds(220,200,140,40);

        label1.setBounds(560,200,140,40);

        EXIT.setBounds(500,300,140,40);

        this.add(test);
        this.add(field);
        this.add(label);
        this.add(label1);
        this.add(EXIT);

        test.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("攝氏" + (Integer.parseInt(field.getText())-32)*5/9 + "度");
            }
        });
        EXIT.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
//-32 *5/9