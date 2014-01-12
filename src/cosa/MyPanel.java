/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cosa;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Alumno CG
 */
public class MyPanel extends JPanel{

    @Override
    public void paint(Graphics g) {
        try{
            Image imagen = new ImageIcon(getClass().getResource("/resouce/fondo.jpg")).getImage();
            setOpaque(false);
            g.drawImage(imagen, 0 , 0, this);
        }
        catch (Exception e){
            super.paint(g);
        }
        super.paint(g);
    }
    
    
}
