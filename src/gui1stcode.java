//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;
public class gui1stcode {
    public static void main(String[] args) {
        Runnable GUITask = new Runnable() {
            @Override
            public void run() {
                MakeGUI();
            }
        };
        SwingUtilities.invokeLater(GUITask);
    }
    static void MakeGUI()
    {
        JFrame frame = new JFrame("Hello World Gui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 600));
        JLabel label = new JLabel("Vivek at this time you are creating something so carry on and don't sit back");
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }
}