package it524.thread.example;

import java.awt.EventQueue;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AlarmClock extends JFrame {

    private JPanel contentPane;
    private JLabel lblHour;
    private JLabel lblMinute;
    public JLabel lblSecond;
    private JComboBox comboBoxHour;
    private JComboBox comboBoxMinute;
    private JButton btnSetAlarm;
    private JLabel lblAlarm;
    private int alarm_hour;
    private int alarm_minute;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AlarmClock frame = new AlarmClock();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public AlarmClock() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 295, 203);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblHour = new JLabel("HH");
        lblHour.setBounds(87, 35, 61, 16);
        contentPane.add(lblHour);

        lblMinute = new JLabel("MM");
        lblMinute.setBounds(139, 35, 61, 16);
        contentPane.add(lblMinute);

        lblSecond = new JLabel("SS");
        lblSecond.setBounds(198, 35, 61, 16);
        contentPane.add(lblSecond);

        comboBoxHour = new JComboBox();
        comboBoxHour.setBounds(87, 63, 69, 27);
        contentPane.add(comboBoxHour);

        comboBoxMinute = new JComboBox();
        comboBoxMinute.setBounds(160, 63, 69, 27);
        contentPane.add(comboBoxMinute);

        btnSetAlarm = new JButton("Set Alarm");
        btnSetAlarm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_btnSetAlarm_actionPerformed(e);
            }
        });
        btnSetAlarm.setBounds(87, 102, 117, 29);
        contentPane.add(btnSetAlarm);

        lblAlarm = new JLabel("Alarm!");
        lblAlarm.setForeground(Color.RED);
        lblAlarm.setBounds(122, 146, 61, 16);
        contentPane.add(lblAlarm);

        lblAlarm.setVisible(false);
        setHours();
        setMinutes();

        Thread thread = new Thread(){
            public void run(){
                int hour = LocalDateTime.now().getHour();
                int minute = LocalDateTime.now().getMinute();
                int second = LocalDateTime.now().getSecond();
                lblHour.setText(String.valueOf(hour));
                lblMinute.setText(String.valueOf(minute));
                while(true) {
                    second++;
                    if(checkAlarm(minute, hour)){
                        activateAlarm();
                    }
                    try {
                        Thread.sleep(1000);
                        lblSecond.setText(String.valueOf(second));

                        if(second == 59) {
                            Thread.sleep(1000);
                            second = 0;
                            lblMinute.setText(String.valueOf(++minute));
                        } else if (minute == 59){
                            minute = 0;
                            lblHour.setText(String.valueOf(++hour));
                        } if (hour == 24) {
                            hour = 0;
                            lblHour.setText(String.valueOf(0));
                        }

                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }
            }
        };

        thread.start();

    }

    public void setHours() {


        for (int hour = 0; hour < 24; hour++) {
            comboBoxHour.addItem(hour);
        }

    }

    public void setMinutes () {
        for (int minute = 0; minute < 60; minute++) {
            comboBoxMinute.addItem(minute);
        }
    }

    protected void do_btnSetAlarm_actionPerformed(ActionEvent e) {
        alarm_minute = (int) comboBoxMinute.getSelectedItem();
        alarm_hour = (int) comboBoxHour.getSelectedItem();

        btnSetAlarm.setEnabled(false);
        comboBoxHour.setEnabled(false);
        comboBoxMinute.setEnabled(false);

        JOptionPane.showMessageDialog(this, "Next alarm set for " + alarm_hour + ":" + alarm_minute);
    }

    public boolean checkAlarm(int m, int h ) {
        if (m == alarm_minute && h == alarm_hour)
            return true;

        return false;
    }

    public void activateAlarm() {
        Thread thread_alarm = new Thread(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                int count = 0;
                while (true) {
                    count++;
                    if (count == 60)
                        break;
                    try {
                        Thread.sleep(500);
                        if (count % 2 == 0)
                            lblAlarm.setVisible(false);

                        else
                            lblAlarm.setVisible(true);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        };

        thread_alarm.start();
    }
}



