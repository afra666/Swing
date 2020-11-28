import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_ball=new JLabel();
    JLabel label_background=new JLabel();
    JLabel label_basket=new JLabel();
    JLabel label_score=new JLabel();
    int x,y;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    label_ball.setBounds(x,y-=10,100,100);
                    myPanel.repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    label_ball.setBounds(x,y+=10,100,100);
                    myPanel.repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    label_ball.setBounds(x-=10,y,100,100);
                    myPanel.repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    label_ball.setBounds(x+=10,y,100,100);
                    myPanel.repaint();
                }
                if (x==100&&y==100){
                   label_score.setText("得分：1");
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        label_score.setBounds(20,20,200,50);
        label_score.setText("得分：0");
        myPanel.add(label_score);
        java.net.URL imgURL2 = App.class.getResource("img/ball.gif");
        label_ball.setIcon(new ImageIcon(imgURL2));
        label_ball.setBounds(0,0,100,100);
        myPanel.add(label_ball);

        java.net.URL imgURL1 = App.class.getResource("img/basket.jpg");
        label_basket.setIcon(new ImageIcon(imgURL1));
        label_basket.setBounds(100,100,100,100);
        myPanel.add(label_basket);


        java.net.URL imgURL0 = App.class.getResource("img/background.jpg");
        label_background.setIcon(new ImageIcon(imgURL0));
        label_background.setBounds(0,0,1000,800);
        myPanel.add(label_background);

        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,0,1000,800);
        //frame.pack();
        frame.setVisible(true);
        //激活键盘焦点
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
