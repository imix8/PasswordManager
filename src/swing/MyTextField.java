package swing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JTextField;


public class MyTextField extends JTextField{
    public MyTextField(){
        setBorder(javax.swing.BorderFactory.createEmptyBorder(5,5,5,5));
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(isFocusOwner()){
            g.setColor(new Color(46, 134, 193));
            g.drawRect(0, 0, getWidth()-1, getHeight()-1);
            g.drawRect(1, 1, getWidth()-3, getHeight()-3);
        }
        else{
            g.setColor(new Color (93, 109, 126));
            g.drawRect(0, 0, getWidth()-1, getHeight()-1);
        }
    }
   
    private void initBorder(){
        int left=5;
        int right=5;
        setBorder(javax.swing.BorderFactory.createEmptyBorder(5,left,5,right));
    }
}