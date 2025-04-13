import javax.swing.*;

public class gui {
    public static void main(String[] args) {
        Runnable GUITask = new Runnable() {
            @Override
            public void run() {
                gui1stcode.MakeGUI();
            }
        };
        SwingUtilities.invokeLater(GUITask);
    }
}
