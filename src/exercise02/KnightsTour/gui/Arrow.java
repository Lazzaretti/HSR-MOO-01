package exercise02.KnightsTour.gui;

import exercise02.KnightsTour.logic.Coordinate;

import java.awt.*;

/**
 * Created by flazz on 02.10.2016.
 */
public interface Arrow{
        void draw(Graphics2D g, Coordinate from, Coordinate to);

        void draw(Graphics2D g, Coordinate from, Coordinate to, Color c);
}
