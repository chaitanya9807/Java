import java.applet.Applet;
import java.awt.*;

public class applets  extends Applet{
    public void paint(Graphics y){
        setBackground(Color.BLUE);
        y.setColor(Color.red);
        y.setFont(Font.getFont(Font.SERIF));
        y.drawString("Made By Chaitanya Sharma",20,80);
    }
}
