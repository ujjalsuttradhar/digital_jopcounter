package digital_jopcounter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

/**
 * gui.java is responsible for user interface developped by JAVA SWING
 *
 * @author Ujjal Suttra Dhar
 */
public class gui {

    JFrame frm;
    JButton reset, count, start,exit;
    JLabel ponchototto, mohamontro, ponchototto1, mohamontro1;
    final String pnc = "জয় শ";
    final String mhmnt = "হরে কৃষ্ণ হরে কৃষ্ণ কৃষ্ণ কৃষ্ণ হরে হরে";
    final String pnc1 = "";
    final String mhmnt1 = "হরে রাম হরে রাম রাম রাম হরে হরে।";
    int counter = 0;

    public gui() {

        frm = new JFrame("Digital Chanting");
        frm.setSize(500, 320);
        frm.setLayout(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            frm.setContentPane(new JLabel(new ImageIcon("krishna.jpg")));
        } catch (Exception e) {
        }

        start = new JButton("Start");

        count = new JButton("Count");
        count.setVisible(false);

        reset = new JButton("Reset");
        reset.setVisible(false);

        exit = new JButton("Exit");
        
        ponchototto = new JLabel(pnc);
        ponchototto.setVisible(false);

        mohamontro = new JLabel(mhmnt);
        mohamontro.setVisible(false);

        ponchototto1 = new JLabel(pnc1);
        ponchototto1.setVisible(false);

        mohamontro1 = new JLabel(mhmnt1);
        mohamontro1.setVisible(false);

        frm.add(start);
        frm.add(count);
        frm.add(reset);
        frm.add(ponchototto);
        frm.add(mohamontro);
        frm.add(mohamontro1);
        frm.add(exit);
        
        
        start.setBounds(100, 10, 100, 25);
        ponchototto.setBounds(30, 35, 300, 25);
        ponchototto1.setBounds(30, 35, 300, 25);
        count.setBounds(100, 150, 100, 25);
        mohamontro.setBounds(30, 175, 300, 25);
        mohamontro1.setBounds(30, 200, 300, 25);
        reset.setBounds(100, 220, 100, 25);
        exit.setBounds(100, 250, 100, 25);



        /*Actionlistenet for start button*/
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter = 0;
                ponchototto.setVisible(true);
                count.setText("Count (0)");
                count.setVisible(true);
                start.setVisible(false);
                reset.setVisible(true);

            }
        });


        /*Actionlistenet for reset button*/
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter = 0;
                ponchototto.setVisible(false);
                mohamontro.setVisible(false);
                mohamontro1.setVisible(false);
                count.setText("Count (0)");
                count.setVisible(false);
                start.setVisible(true);
                reset.setVisible(false);


            }
        });


        /*ActionListener for count button*/
        count.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;
                
                if(counter>=128)
                {
                    JOptionPane.showMessageDialog(null, "এক মালা সম্পুর্ণ হল");
                
                }
                
                count.setText("Count (" + counter + ")");
                ponchototto.setVisible(true);
                mohamontro.setVisible(true);
                //     ponchototto.setVisible(true);
                mohamontro1.setVisible(true);

            }
        });

        /*ActionListener for Exit button*/
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

      

        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
    }
} //end of class
