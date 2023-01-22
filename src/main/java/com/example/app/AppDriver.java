package com.example.app;

import com.example.lib.gui.GUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

/**
 * App driver.
 *
 * @author Myself
 */
public final class AppDriver {

    /** The logger for this class. */
    private static final Logger logger = LoggerFactory.getLogger(AppDriver.class);

    /**
     * Private Constructor.
     */
    private AppDriver() {
    }

    /**
     * Main method.
     *
     * @param args Command line arguments
     */
    public static void main(final String[] args) {
        logger.info("hello info");

        GUI GUI = new GUI();
        GUI.init();
        GUI.setSize(800, 450);
        GUI.setTitle("Title");
        GUI.setVisible(true);
        GUI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
