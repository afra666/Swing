import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    private JPanel myPanel;
    private JLabel label_score;
    private JLabel label_img;
    int i=0;
    public App() {
        label_img.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
//                label_img.setBounds((int)(Math.random()*10%10*50),(int)(Math.random()*10%10*50),60,60);
//                i++;
//                label_score.setText(String.valueOf(i));
            }
        });
    }

    void go(){
//        label_img.setIcon(new ImageIcon("/Users/Mac/mouse2.gif"));
        
        JFrame frame = new JFrame("App");
        frame.setBounds(100,100,800,600);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
