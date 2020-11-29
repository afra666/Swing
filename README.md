# Swing
---
1.创建一个Swing GUI  
2.猜数字游戏  
3.打地鼠  
4.大家来找茬  
##  模板

##  App.java
```
import javax.swing.*;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    //构造方法
    public App() {

    }
    //显示窗体方法
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
```

##  鼠标和键盘监听
###  鼠标监听器
```
xxxxxxxxxxx.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
```
###  键盘监听器
```
xxxxxxxxx.addKeyListener(new KeyAdapter() {
  @Override
  public void keyPressed(KeyEvent e) {
      super.keyPressed(e);
  }
});
```

##  方式1,静态引用
#### 推荐。不可用于动态引用。
``` 
/*此方式共四行代码，文件目录树为
        src/App.java
        src/img/plane0.png
 */
        
        java.net.URL imgURL = App.class.getResource("img/plane0.png");
        label_goodPlane.setIcon(new ImageIcon(imgURL));
        label_goodPlane.setBounds(100,100,128,128);
        myPanel.add(label_goodPlane);
        
 ```
       
##  方式2,静态引用
####  不推荐，仅供测试使用。不可用于动态引用。
```  
  /*此方式共三行代码，文件目录树为
        src/App.java
        src/img/plane0.png
 */     
        label_goodPlane.setIcon(new ImageIcon("src/img/plane0.png"));
        label_goodPlane.setBounds(100,100,128,128);
        myPanel.add(label_goodPlane);
```
##  方式3 动态引用
#### 使用ImageIO类进行引用，一般用于g.drawImage()绘图方法中。推荐。刷新频率约1000fps
```
/*此方法需要抛出IO异常,共2行代码，文件目录树为
        src/App.java
        src/img/img/ball.gif
 */
//声明
BufferedImage myImg;

//引用
myImg=ImageIO.read(this.getClass().getResourceAsStream("img/ball.gif"));
```
