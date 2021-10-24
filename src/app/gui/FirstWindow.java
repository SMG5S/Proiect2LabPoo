package app.gui;

import app.classes.Alcoolica;
import app.classes.Persoana;
import app.classes.Suc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class FirstWindow implements ActionListener {
    private JFrame jfr = new JFrame("FirstWindow");
    public JLabel lb = new JLabel("Dati numele persoanei:");
    private JPanel jp = new JPanel();
    private JTextField txtf = new JTextField(5);
    private JLabel lb2 = new JLabel("Bani cash:");
    private JPanel jp2 = new JPanel();
    private JTextField txtf2 = new JTextField(5);
    private JLabel lb3 = new JLabel("Card:");
    private JPanel jp3 = new JPanel();
    private JTextField txtf3 = new JTextField(5);
    private JPanel jp4 = new JPanel();
    private JButton bt = new JButton("Continue");
    FirstWindow()
    {
          bt.setFocusable(false);
          bt.addActionListener(this);
          jfr.setLayout(new GridLayout(4,3));
          jp.setLayout(new GridLayout());
          jp.add(lb);
          jp.add(txtf);
          jp2.setLayout(new GridLayout());
          jp2.add(lb2);
          jp2.add(txtf2);
          jp3.setLayout(new GridLayout());
          jp3.add(lb3);
          jp3.add(txtf3);
          jp4.add(bt);
          //jfr.add(bt);
          jfr.add(jp);
          jfr.add(jp2);
          jfr.add(jp3);
          jfr.add(jp4);
          jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          jfr.setSize(300,220);
          jfr.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt)
        {
            if(txtf.getText().equals("")&& txtf2.getText().equals("") && txtf3.getText().equals(""))
            {
                bt.setText("The textfields are empty");
            }
            else if(txtf.getText().equals("") || txtf2.getText().equals("") || txtf3.getText().equals(""))
            {
                bt.setText("Try again!");
            }
            else
            {
                jfr.dispose();
                String nume = txtf.getText();
                float cash;
                float card;
                try {
                    cash = Float.parseFloat(txtf2.getText());
                    card = Float.parseFloat(txtf3.getText());
                }
                catch(NumberFormatException n)
                {
                    cash=0;
                    card=0;
                    System.out.println("Type float numbers not characters!");
                }
                Persoana p = new Persoana(nume,cash,card);
                System.out.println(p.toString());
                Scanner sc = new Scanner(System.in);
                System.out.println("Numarul de bauturi alcoolice:");
                int nr_de_bauturi_alcoolice = sc.nextInt();
                System.out.println("Numarul de sucuri:");
                int nr_de_sucuri = sc.nextInt();
                Suc s= new Suc();
                Suc[] sucuri= new Suc[nr_de_sucuri];;
                Alcoolica a = new Alcoolica();;
                Alcoolica[] bauturi_alcoolice = new Alcoolica[nr_de_bauturi_alcoolice];
                if(nr_de_bauturi_alcoolice==0)
                {
                    s.instantiereBauturi(sucuri,sc,nr_de_sucuri);
                }
                else if(nr_de_sucuri==0)
                {
                    a.instantiereBauturi(bauturi_alcoolice,sc,nr_de_bauturi_alcoolice);
                }
                else
                {
                    s.instantiereBauturi(sucuri,sc,nr_de_sucuri);
                    a.instantiereBauturi(bauturi_alcoolice,sc,nr_de_bauturi_alcoolice);
                }
                float total_b=0;float total_s = 0;
                total_b = a.notadePlata(bauturi_alcoolice,p,total_b,nr_de_bauturi_alcoolice);
                total_s = s.notadePlata(sucuri,p,total_s,nr_de_sucuri);
                float totalul = total_b + total_s;
                System.out.println("Nota de plata este in valoare de " + totalul + " lei");
                p.platestenotadePlata(sc,totalul);
            }
        }

    }
}
