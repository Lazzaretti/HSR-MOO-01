package exercise02.KnightsTour;

import exercise02.KnightsTour.gui.ArrowFrame;
import exercise02.KnightsTour.gui.GuiSettings;
import exercise02.KnightsTour.logic.KnightsTour;
import exercise02.KnightsTour.logic.KnightsTourFindAWay;
import exercise02.KnightsTour.logic.Settings;

import javax.swing.*;

/**
 * Created by flazz on 02.10.2016.
 */
public class GuiExecuter {
    public static void main(String[] args){
        GuiSettings settings = new GuiSettings(2,2,8,8);
        KnightsTour tour = new KnightsTourFindAWay(settings);
        settings.ways = tour.find();

        SwingUtilities.invokeLater (new Runnable () {
            @Override
            public void run() {
                ArrowFrame frame = new ArrowFrame();
                frame.build(settings);
            }
        });
    }
}
