import javax.swing.JButton;
import javax.swing.JLabel;

public class interactiveA {
    public static void interact(JLabel label, String text,JButton buttonA,JButton buttonB) {
        if (text.contains("Enter")) {
            label.setText(
                    "<html> Allright you entered the Blue One. <br> you go further <br> and see the same again <br> a red Door and a Blue Door <br> which one do you Enter now? </html>");
        }
        if (text.contains("Blue one")) {
            label.setText(
                    "<html> Allright you entered the Blue One again. <br> you go further <br> now you see a new Door <br> theres a message at the Door <br> 'Idiots not allowed!' <br> what do you do? </html>");
                    buttonA.setText("Enter");
                    buttonB.setText("Go Back");
        }
        if(text.contains("Idiots")){
            label.setText("You are a Braaiiin :)");
            buttonA.setText("Memo is so Cool");
            buttonB.setText("Memo is the Best!");
        }
    }
}
