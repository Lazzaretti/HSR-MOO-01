package ch.lazzaretti.exercise02.KnightsTour.gui;

import ch.lazzaretti.exercise02.KnightsTour.logic.Way;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

/**
 * Created by flazz on 02.10.2016.
 */
public class ArrowPanel extends JPanel{

    GuiSettings settings;

    public ArrowPanel(GuiSettings settings){
        super();
        this.settings = settings;
    }

    public void paintComponent ( Graphics g ) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint ( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );

        g2d.setColor ( Color.WHITE );
        g2d.fillRect ( 0, 0, settings.getWindowWidth(),settings.getWindowHeight() );

        paintBoard(g2d);
        paintArrows(g2d);
    }

    protected void paintBoard(Graphics2D g){
        g.setColor(Color.black);
        int height = settings.getWindowHeight();
        int width = settings.getWindowWidth();
        Path2D.Float path = new Path2D.Float();

        for(int x=0; x<=settings.width; x++) {
            int xPx = x * settings.pixelFactor;
            path.moveTo(xPx, 0);
            path.lineTo(xPx, height);
        }

        for(int y=0; y<=settings.width; y++) {
            int yPx = y * settings.pixelFactor;
            path.moveTo(0, yPx);
            path.lineTo(width, yPx);
        }

        g.draw ( path );
    }

    protected void paintArrows(Graphics2D g){
        for(Way way : settings.ways){
            for(int i=0;i<way.size()-1;i++){
                Arrow arrow = new EasyArrow(settings);
                arrow.draw( g, way.get(i), way.get(i+1) );
            }
        }
    }

}
