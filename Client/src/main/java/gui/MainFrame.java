package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final LoggerPanel loggerPanel;
    private final ChatTextPanel chatTextPanel;
    private final ConnectedPanel connectedPanel;
    private final TextInputPanel textInputPanel;

    public MainFrame() {
        super("Chat");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(480, 640));

        loggerPanel = new LoggerPanel();
        chatTextPanel = new ChatTextPanel();
        connectedPanel = new ConnectedPanel();
        textInputPanel = new TextInputPanel();

        add(loggerPanel, BorderLayout.NORTH);
        add(chatTextPanel, BorderLayout.CENTER);
        add(connectedPanel, BorderLayout.WEST);
        add(textInputPanel, BorderLayout.SOUTH);
    }
}
