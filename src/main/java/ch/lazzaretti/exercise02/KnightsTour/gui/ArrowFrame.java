package ch.lazzaretti.exercise02.KnightsTour.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by flazz on 02.10.2016.
 */
public class ArrowFrame extends JFrame{
    public void build(GuiSettings settings){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add ( new ArrowPanel(settings), BorderLayout.CENTER );

        setSize ( settings.getWindowWidth(),settings.getWindowHeight() );

        setVisible(true);
    }
}
