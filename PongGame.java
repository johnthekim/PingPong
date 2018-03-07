import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PongGame extends JComponent implements ActionListener, MouseMotionListener{

private int ballX=400;
private int ballY=150;
private int paddleX=0;
private int ballYSpeed=7;
private in ballXSpeed=5;

public static void main(String[]args{
JFrame window= new JFrame("Pong Game");
window.add(new Game());
window.pack();
window.setDefaultCLoseOperation(WindowConstants.EXIT_ON_CLOSE);
window.setLocationRelativeTo(null);
window.setVisible(true);

Timer t= new Timer(100, game);
t.start();
window.addMouseMotionListener(game);
}
public Dimension getPreferredSize(){
return new Dimension(800, 600);
}
@override
protected void paintComponent(Graphics g){
//draw sky
g.setColor(new Color(170, 223, 224));
g.fillRect(0,0,800,600);
//draw paddle
g.setColor(new Color(110, 61, 23));
g.fillRect(100, 510, 150, 15);
//draw ball
g.setColor(new Color(155, 93,169));
g.fillOval(ballX, ballY, 30,30);
}
@override
public void actionPerformed(ActionEvent e){
ball X=ballX+ballXSpeed;
ballY=ballY+ballYSpeed;
if(ballX>= paddleX&& ballX<= paddleX+ 150&& ballY>=510){
ballYSpeed=-7;
}
if(ballX>=800-30){
ballXSpeed=-5;
}
if(ballX<=0){
ballXSpeed=5;
}
if(ballY<=0){
ballYSpeed=7;
}repaint();

}
@override
public void mouseDragged(MouseEvent e{
}
@override
public void mouseMoved(MouseEvent e){
paddleX=e.getX()-75;
repaint();
}
}
