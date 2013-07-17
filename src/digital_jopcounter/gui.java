package digital_jopcounter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

/**
 * gui.java is responsible for user interface Developped by JAVA SWING
 * @author Ujjal Suttra Dhar
 */
public class gui {

    JFrame frm;
    JButton reset, count, start, exit;
    JLabel ponchototto,mohamontro,ponchototto1,mohamontro1,mc,cc;
    final String pnc    = "Jaya Sri-Krishna-Chaitanya\nPrabhu Nityananda";
    final String pnc1   = "Sri-Adwaita Gadadhara Shrivasadi-Gaura-Bhakta-Vrinda";
    final String mhmnt  = "Hare Krishna Hare Krishna Krishna Krishna Hare Hare";
    final String mhmnt1 = "Hare Rama Hara Rama Rama Rama Hare Hare।";
    int counter = 0,mcounter=0;

    private void setStatus(){
       mc.setText(mcounter+" টি মালা জপ শেষ।");
                cc.setText(counter+" বার জপ শেষ।");
            
    
    }
     
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

        ponchototto = new JLabel(new ImageIcon("ponchototto.png"));
        ponchototto.setVisible(false);

        mohamontro = new JLabel(new ImageIcon("mohamontro.png"));
        mohamontro.setVisible(false);

        ponchototto1 = new JLabel(pnc1);
        ponchototto1.setVisible(false);

        mohamontro1 = new JLabel(mhmnt1);
        mohamontro1.setVisible(false);
        
        mc = new JLabel("");
        mc.setVisible(false);
        
        cc = new JLabel("");
        cc.setVisible(false);
        
        frm.add(start);
        frm.add(count);
        frm.add(reset);
        frm.add(ponchototto);
        //frm.add(ponchototto1);
        frm.add(mohamontro);
       // frm.add(mohamontro1);
        frm.add(mc);
        frm.add(cc);
        
        frm.add(exit);


        start.setBounds(10, 10, 100, 25);
        ponchototto.setBounds(0, 0, 250, 88);
      //  ponchototto1.setBounds(5, 30, 400, 25);
        mc.setBounds(35, 120, 400, 15);
        cc.setBounds(35, 140 , 400, 15);
        
        count.setBounds(10, 260, 100, 25);
        
        mohamontro.setBounds(1, 170, 220, 88);
       // mohamontro1.setBounds(10, 200, 400, 25);
        reset.setBounds(200, 260, 100, 25);
        exit.setBounds(400, 260, 100, 25);



        /*Actionlistenet for start button*/
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter = 0;
                ponchototto.setVisible(true);
                ponchototto1.setVisible(true);
                count.setText("Count (0)");
                count.setVisible(true);
                start.setVisible(false);
                reset.setVisible(true);
                mc.setVisible(true);
                cc.setVisible(true);
                setStatus();

            }
        });


        /*Actionlistenet for reset button*/
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                
                
                counter  = 0;
                //mcounter = 0;
                
                //ponchototto.setVisible(false);
                //ponchototto1.setVisible(false);
                
                //mohamontro.setVisible(false);
                //mohamontro1.setVisible(false);
                
                //count.setText("Count (0)");
                //count.setVisible(false);
                
                //start.setVisible(true);
                //reset.setVisible(false);
                count.setText("Count (0)");
                setStatus();
             }
        });


        /*ActionListener for count button*/
        count.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;

                
                
                if (counter >= 108) {
                    mcounter++;
                    counter=0;
                    JOptionPane.showMessageDialog(null, "You have completed 1 mala more.");

                }
                 setStatus();
             
                count.setText("Count (" + counter + ")");
                ponchototto.setVisible(true);
                mohamontro.setVisible(true);
                ponchototto1.setVisible(true);
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
