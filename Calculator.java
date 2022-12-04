


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator
{

    Calculator() {


        JFrame h = new JFrame();
        TextField t;
        h.setTitle("Add Number");
        h.setSize(600,500);

        Label p=new Label("****SMALL CALCULATOR****");
        p.setBounds(140,10,150,40);

        Label j=new Label("Enter the FNumber-");
        j.setBounds(50,80,100,20);

        TextField wf=new TextField();

        wf.setBounds(180,80,100,20);

        Label i=new Label("Enter the SNumber -");
        i.setBounds(50,110,130,20);

        TextField y=new TextField();

        y.setBounds(180,110,100,20);
        h.add(j);
        h.add(wf);
        h.add(i);
        h.add(y);
        h.add(p);

        JButton b=new JButton("ADD");
        b.setBounds(160,180,80,20);

        h.add(b);


        // Label u=new Label("");
        //u.setBounds(100,250,130,20);
        // h.add(u);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n=Integer.parseInt(wf.getText());
                int m=Integer.parseInt(y.getText());
                int c=n+m;
                JOptionPane.showMessageDialog(y,c+":Add");
                //u.setText("Result is ="+c);
            }
        });


        JButton d=new JButton("Multiple");
        d.setBounds(280,180,80,20);

        h.add(d);

        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n=Integer.parseInt(wf.getText());
                int m=Integer.parseInt(y.getText());
                int c=n*m;
                JOptionPane.showMessageDialog(y,c+":Multiple");
                //u.setText("Result is ="+c);
            }
        });




        JButton cd=new JButton("Divide");
        cd.setBounds(400,180,80,20);

        h.add(cd);

        cd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n=Integer.parseInt(wf.getText());
                int m=Integer.parseInt(y.getText());
                int c=n/m;
                JOptionPane.showMessageDialog(y,c+":Divide");
                //u.setText("Result is ="+c);
            }
        });







        JButton df=new JButton("Subs");
        df.setBounds(50,180,80,20);

        h.add(df);

        df.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n=Integer.parseInt(wf.getText());
                int m=Integer.parseInt(y.getText());
                int c=n-m;
                JOptionPane.showMessageDialog(y,c+":Subs");
                //u.setText("Result is ="+c);
            }
        });





        h.setLayout(null);
        h .setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        h.setVisible(true);


    }



}

