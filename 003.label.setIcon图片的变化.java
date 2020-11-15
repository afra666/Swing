import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    private JPanel myPanel;
    private JLabel label_01;
    private JTextArea textArea1;


    public App() {
        label_01.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                label_01.setIcon(new ImageIcon("img/2.jpg"));
            }
        });
    }

    void go() {
        label_01.setIcon(new ImageIcon("img/123.png"));
        JFrame frame = new JFrame("App");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App().go();
    }
}
