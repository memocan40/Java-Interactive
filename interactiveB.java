import javax.swing.JButton;
import javax.swing.JLabel;

public class interactiveB {
    public static void interact(JLabel label, String text, JButton buttonA, JButton buttonB) {
        if (text.contains("go further")) {
            System.out.println(2);
            label.setText(
                    "<html> Allright you entered the Red One <br> you go further <br> now you see a new Door <br> theres a message at the Door <br> 'Idiots not allowed!' <br> what do you do? </html>");
            buttonA.setText("Enter");
            buttonB.setText("Go Back");
        }
        if (text.contains("Idiots")) {
            label.setText("You are a Idiot :)");
            buttonA.setText("You are a Idiot :)");
            buttonB.setText("You are a Idiot :)");
        }
        if (text.contains("Enter")) {
            System.out.println(1);
            label.setText(
                    "<html> Allright you entered the Red One. <br> you go further <br> and see the same again <br> a red Door and a Red Door <br> which one do you Choose now? </html>");
        }

    }
}
