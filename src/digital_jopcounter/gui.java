package digital_jopcounter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

/**
 * gui.java is responsible for user interface using JAVA SWING
 * @author Ujjal Suttra Dhar <ujjalsuttradhar@gmail.com>
 */
public class gui {

    JFrame frm;
    JButton reset, count, start, exit;
    JLabel ponchototto,mohamontro,mc,cc;
    int counter = 0,mcounter=0;

    /**
     * setStatus() changes the status portion of the UI according to current value of counters
     */
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
        frm.add(start);
        start.setBounds(10, 10, 100, 25);
       
        

        count = new JButton("Count");
        count.setVisible(false);
        frm.add(count);
        count.setBounds(10, 260, 100, 25);
        
        reset = new JButton("Reset");
        reset.setVisible(false);
        frm.add(reset);
        reset.setBounds(200, 260, 100, 25);
       
        exit = new JButton("Exit");
        frm.add(exit);
        exit.setBounds(400, 260, 100, 25);

        ponchototto = new JLabel(new ImageIcon("ponchototto.png"));
        ponchototto.setVisible(false);
        frm.add(ponchototto);
        ponchototto.setBounds(0, 0, 250, 88);
          
        mohamontro = new JLabel(new ImageIcon("mohamontro.png"));
        mohamontro.setVisible(false);
        frm.add(mohamontro);
        mohamontro.setBounds(1, 170, 220, 88);
        
        mc = new JLabel("");
        mc.setVisible(false);
        frm.add(mc);
        mc.setBounds(35, 120, 400, 15);
       
        cc = new JLabel("");
        cc.setVisible(false);
        frm.add(cc);
        cc.setBounds(35, 140 , 400, 15);
        
        
        


        /*Actionlistenet for start button*/
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter = 0;
                ponchototto.setVisible(true);
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
        frm.setResizable(false);
    }
} //end of class
