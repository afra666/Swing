//工程内目录树：img(123.png)|src(App.java)||

import javax.swing.*;

public class App {
    private JPanel myPanel;
    private JLabel label_01;


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



