package ru.pangaia.jsnake;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.Properties;

public class Config {
    private int resolution_x;
    public int getResolution_x() {
        return resolution_x;
    }

    private int resolution_y;
    public int getResolution_y() {
        return resolution_y;
    }

    private boolean fullscreen;
    public boolean isFullscreen() {
        return fullscreen;
    }


    public Config(String file) {
        try {
            readConfig(file);
        } catch (IOException x) {
            System.out.println("Error reading config file. Exiting...");
            System.exit(1);
        }
    }

    private void readConfig(String file) throws IOException {
        String path = Paths.get("").toAbsolutePath().toString();
                System.out.println("path is: " + path);

        var configFile = new File(path + File.separator + file);
                System.out.println("configfile exists: " + configFile.exists());

        Properties props = new Properties();
        props.load(new InputStreamReader(new FileInputStream(configFile)));
        resolution_x = Integer.parseInt(props.get("resolution_x").toString());
                System.out.println(resolution_x);
        resolution_y = Integer.parseInt(props.get("resolution_y").toString());
                System.out.println(resolution_y);
        fullscreen = Boolean.parseBoolean(props.get("fullscreen").toString());
    }
}
