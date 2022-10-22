import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jframe {
    public static void showFrame() {
        JFrame frame = new JFrame("Memos Frame");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(new Insets(90, 90, 90, 90)));
        JLabel label = new JLabel(
                "<html>You Enter A Room And see 2 Doors. <br> A Blue one and a Red One.<br> Which one do you Enter?</html>");
        JButton buttonA = new JButton();
        JButton buttonB = new JButton();
        buttonA.setText("Blue");
        buttonB.setText("Red");
        panel.add(label);
        panel.add(buttonA);
        panel.add(buttonB);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonA.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                interactiveA.interact(label, label.getText(), buttonA, buttonB);
            }
        });
        buttonB.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                interactiveB.interact(label, label.getText(), buttonA, buttonB);

            }
        });
        frame.setVisible(true);
    }

}
