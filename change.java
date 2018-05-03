package NEW;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class change extends JFrame{

    public JButton jbtnAdd = new JButton("<--");
    public JButton jbtnLess = new JButton("-->");
    public JButton bye = new JButton("EXIT");
    public JLabel label = new JLabel("~_~");
    public JTextField field = new JTextField();
    public int x = 1;
    public int face = 1;

    public change(){
        ha();
    }
    private void ha(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//

        this.setLayout(null);  //讓底下設定的location可以照設定擺設

        this.setLocation(100,50);        //視窗在螢幕何處
        this.setSize(800,600);  //視窗的長寬

        jbtnAdd.setLocation(50,60);
        jbtnAdd.setSize(140,40);  //Add按鈕xy長寬

        jbtnLess.setLocation(200,60);
        jbtnLess.setSize(140,40);  //Less按鈕xy長寬

        label.setBounds(x,200,200,200);

        field.setBounds(200,140,140,40);

        bye.setBounds(350,60,140,40);

        this.add(jbtnAdd);
        this.add(jbtnLess);
        this.add(label);
        this.add(field);
        this.add(bye);

        jbtnAdd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                face--;
                if (face == 0){
                    face = 3;
                }
                switch (face){
                    case 1:
                        label.setText("~_~");
                        break;
                    case 2:
                        label.setText("0_0");
                        break;
                    case 3:
                        label.setText(">_<");
                        break;
                }
                x-=Integer.parseInt(field.getText()); //字串轉數字
                label.setLocation(x,200);  //**
            }
        });

        jbtnLess.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                face++;
                if (face == 4){
                    face = 1;
                }
                switch (face){
                    case 1:
                        label.setText("~_~");
                        break;
                    case 2:
                        label.setText("0_0");
                        break;
                    case 3:
                        label.setText(">_<");
                        break;
                }
                x+=Integer.parseInt(field.getText());
                label.setLocation(x,200);  //**
            }
        });

        bye.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);  //*********************************
            }
        });


    }
}
