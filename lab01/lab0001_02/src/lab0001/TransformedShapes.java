package lab0001;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.AffineTransform;


public class TransformedShapes extends JPanel {


    private Graphics2D g2; 

    private void resetTransform() {
        g2.setTransform(new AffineTransform());
    }

    private void square() {
        g2.fillRect(-50,-50,100,100);
    }

    //-----------------------------------------------------------------------------------

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //wyg³adza


        g2.translate(300,230);
        g2.setColor(Color.RED);
        g2.scale(1.5,0.1);
        square();
        resetTransform();
        
        
        g2.translate(300,300);
        g2.setColor(Color.RED);
        g2.rotate(Math.PI/3.5);
        g2.scale(0.1,2);
        square();
        resetTransform();
        
        
        g2.translate(300,370);
        g2.setColor(Color.RED);
        g2.scale(1.5,0.1);
        square();
        resetTransform();
    }
    //--------------------------------------------------------------------------------------

    public TransformedShapes() {
        setPreferredSize(new Dimension(600,600) );
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
    }

    public static void main(String[] args)  {
        JFrame window = new JFrame("Drawing With Transforms");
        window.setContentPane(new TransformedShapes());
        window.pack();
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation( (screen.width - window.getWidth())/2, (screen.height - window.getHeight())/2 );
        window.setVisible(true);
    }

}