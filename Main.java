package com.company;

import java.awt.*;

@SuppressWarnings({"BusyWait"})
public class Main {

    public static void main(String[] args) {
        jiggleMyPickle.GUI();
        final int FIVE_SECONDS = 5000;
        int xBase =960;
        int yBase =540;
        int xEdit = xBase-100;
         while(true) {
            try {
                Robot yeetBoi = new Robot();
                yeetBoi.mouseMove(xBase,yBase);
                Thread.sleep(FIVE_SECONDS);
                yeetBoi.mouseMove(xEdit, yBase);
                Thread.sleep(FIVE_SECONDS);
            } catch (AWTException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}