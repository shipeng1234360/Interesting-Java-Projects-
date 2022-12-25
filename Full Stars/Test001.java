import java.awt.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//满天星
public class Test001 {
public static void main(String[] args){
//  System.out.println("HUJun");
Frame w =new Frame();

w.setSize(1024,768);
w.setBackground(Color.BLACK);


MyPanel mp =new MyPanel();
w.add(mp);
//加监听，使得关闭按钮有效  
w.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e){
   System.exit(0);
  }
});

w.setVisible(true);



}
}
class MyPanel extends Panel{
public void paint(Graphics g){

g.setColor(Color.WHITE);
for(int i=0;i<300;i++){
g.drawString("*", (int)(Math.random()*1024), (int)(Math.random()*768));
}

g.setColor(Color.YELLOW);
g.fillOval(200, 100, 100, 100);
g.setColor(Color.BLACK);
g.fillOval(200, 100, 69, 69);
//  g.drawArc(50, 50, 300, 300, 0, 180);
}


}
