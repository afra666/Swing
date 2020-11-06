package pac;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        JFrame frame=new JFrame("我的小程序");
        JPanel myPanel=new JPanel();
        ImageIcon img_src=new ImageIcon("/Users/Mac/123.png");
        JLabel img_lable=new JLabel(img_src,JLabel.CENTER);
        myPanel.add(img_lable);
        frame.add(myPanel);
        frame.setVisible(true);
    }
}
