package exercise02.KnightsTour.gui;

import exercise02.KnightsTour.logic.Coordinate;

import java.awt.*;
import java.awt.geom.Path2D;

/**
 * Created by flazz on 02.10.2016.
 */
public class EasyArrow implements Arrow {

    GuiSettings settings;

    public EasyArrow(GuiSettings settings) {
        this.settings = settings;
    }

    @Override
    public void draw(Graphics2D g, Coordinate from, Coordinate to) {
        draw(g,from,to,Color.BLUE);
    }

    @Override
    public void draw(Graphics2D g, Coordinate from, Coordinate to, Color c) {
        Path2D.Float path = new Path2D.Float();
        int setItInTheMiddle = settings.pixelFactor/2;
        path.moveTo ( from.x*settings.pixelFactor+setItInTheMiddle, from.y*settings.pixelFactor+setItInTheMiddle );
        path.lineTo ( to.x*settings.pixelFactor+setItInTheMiddle,to.y*settings.pixelFactor+setItInTheMiddle );

        g.setColor ( c );
        g.draw ( path );
    }


}
