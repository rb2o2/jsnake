package ru.pangaia.jsnake.ui;

import ru.pangaia.jsnake.Config;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame(Config conf) {
        setSize(conf.getResolution_x(), conf.getResolution_y());
        if (conf.isFullscreen()) {
            setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
    }
}
