import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_background=new JLabel();
    List<JLabel> frogList =new ArrayList<>();
    JLabel label_score=new JLabel();
    JTextArea textArea_UserInput=new JTextArea();
    JLabel label_win=new JLabel();
    int flag=0;
    int x1=399,y1=256,x2=356,y2=100,x3=560,y3=20;
    int  score=0,score1=0,score2=0,score3=0;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                textArea_UserInput.append(String.valueOf(e.getKeyChar()));


                if (textArea_UserInput.getText().equals("hello")
                        ){

                    frogList.get(flag).setBounds(x1,y1,128,128);
                    textArea_UserInput.setText("");

                }
                if (textArea_UserInput.getText().equals("world")
                         ){
                    frogList.get(flag).setBounds(x2,y2,128,128);
                    textArea_UserInput.setText("");
                }
                if (textArea_UserInput.getText().equals("hi")){
                    frogList.get(flag).setBounds(x3+flag*50,y3,128,128);
                    textArea_UserInput.setText("");
                }
                if(textArea_UserInput.getText().equals("hello")
                        ||textArea_UserInput.getText().equals("world")
                        ||textArea_UserInput.getText().equals("hi")
                        ){
                    textArea_UserInput.setText("");
                }
                if(frogList.get(0).getX()==x3){
                    flag=1;
                }
                if(frogList.get(1).getX()==x3+50){
                    flag=2;
                }if(frogList.get(2).getX()==x3+50+50){
                    flag=3;

                    label_win.setVisible(true);

                }
                label_score.setFont(new Font("宋体",Font.BOLD,30));
                label_score.setText("得分："+String.valueOf(flag));

            }
        });

    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL9 = App.class.getResource("img/win.png");

        label_win.setIcon(new ImageIcon(imgURL9));
        label_win.setBounds(150,50,500,500);
        myPanel.add(label_win);

        label_win.setVisible(false);
        textArea_UserInput.setText("");
        textArea_UserInput.setBounds(0,0,300,50);
        myPanel.add(textArea_UserInput);


        for (int i = 0; i < 3; i++) {
            frogList.add(new JLabel());
            myPanel.add(frogList.get(i));
        }
        java.net.URL imgURL2 = App.class.getResource("img/frog.png");
        for (int i = 0; i < 3; i++) {
            frogList.get(i).setIcon(new ImageIcon(imgURL2));
            frogList.get(i).setBounds(0+i*128,430,128,128);
        }


        java.net.URL imgURL = App.class.getResource("img/background.png");
        label_background.setIcon(new ImageIcon(imgURL));
        label_background.setBounds(0,0,1024,600);
label_score.setFont(new Font("宋体",Font.BOLD,30));
        label_score.setText("得分：0");
        label_score.setBounds(200,0,200,50);
        myPanel.add(label_score);


        myPanel.add(label_background);




        //
        JFrame frame = new JFrame("青蛙过河");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,600);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
        textArea_UserInput.setVisible(false);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
