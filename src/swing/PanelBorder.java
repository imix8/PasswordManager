package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLayeredPane;


public class PanelBorder extends JLayeredPane{
    public PanelBorder(){
    }
    protected void paintComponenet(Graphics grphcs){
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(new Color (255, 0, 0));
        g2.fillRoundRect(0,0,getWidth(), getHeight(), 25, 25);
    }
}
