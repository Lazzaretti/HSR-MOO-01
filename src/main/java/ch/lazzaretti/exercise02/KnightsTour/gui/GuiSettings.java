package ch.lazzaretti.exercise02.KnightsTour.gui;

import ch.lazzaretti.exercise02.KnightsTour.logic.Settings;

/**
 * Created by flazz on 02.10.2016.
 */
public class GuiSettings extends Settings{

    public GuiSettings() {
    }

    public GuiSettings(int startX, int startY) {
        super(startX, startY);
    }

    public GuiSettings(int startX, int startY, int mapWidth, int mapHeight) {
        super(startX, startY, mapWidth, mapHeight);
    }

    public int pixelFactor = 100;

    public int getWindowHeight() {
        return height * pixelFactor;
    }

    public int getWindowWidth() {
        return width * pixelFactor;
    }
}
