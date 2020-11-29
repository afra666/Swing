import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==e.VK_UP)   { label_txt.setText("↑"); }
                if(e.getKeyCode()==e.VK_DOWN) { label_txt.setText("↓"); }
                if(e.getKeyCode()==e.VK_LEFT) { label_txt.setText("←"); }
                if(e.getKeyCode()==e.VK_RIGHT){ label_txt.setText("→"); }
            }
        });
    }
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        frame.setVisible(true);
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) { new App().go(); }
}
