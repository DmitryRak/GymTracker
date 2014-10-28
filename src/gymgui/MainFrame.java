package gymgui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dmitry on 10/28/14.
 */
public class MainFrame {
    private JTabbedPane tabbedPane1;
    private JPanel EventPane;
    private JList eventList;
    private JButton addNewEventButton;
    private JPanel eventDetails;
    private JScrollPane eventScroller;
    private JComboBox years;
    private JComboBox monthes;
    private JPanel daysPane;

    public MainFrame(){
        JFrame frame = new JFrame("GymTracker");
        frame.setSize(new Dimension(1000,1000));
        frame.setContentPane(EventPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
}
