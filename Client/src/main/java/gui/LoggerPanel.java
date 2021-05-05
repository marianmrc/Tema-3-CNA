package gui;

import javax.swing.*;
import java.awt.*;

public class LoggerPanel extends JPanel {
    private final String[] listLabels;
    private int index;

    public LoggerPanel() {
        listLabels = new String[1000];

        JList<String> list = new JList<>(listLabels);
        list.setVisible(true);

        index = 0;

        setBackground(Color.cyan);

        add(list);
    }

    public void newLog(String name, boolean connected) {
        if (connected) {
            listLabels[index] = name + " has connected";
        }
        else {
            listLabels[index] = name + " has disconnected";
        }
        index++;
    }
}
