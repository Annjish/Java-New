import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class Firstprogram extends Applet{
    @Override
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawLine(20,30,20,300);
        g.drawRect(70,100,30,30);
        g.fillRect(170,100,30,30);
        g.drawOval(70,200,30,30);
    }
}