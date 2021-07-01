package ru.pangaia.jsnake;

import ru.pangaia.jsnake.ui.GameFrame;

public class JsankeApp {
    private static String version = "v0.1";
    private static String config = "jsnake.conf";

    public static void main(String[] args) {
        System.out.println("Hello! This is Jsnake game " + version);
        var conf = new Config(config);
        var mainframe = new GameFrame(conf);
        mainframe.setVisible(true);
    }
}
