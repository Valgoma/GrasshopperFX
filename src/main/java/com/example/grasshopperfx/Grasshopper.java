package com.example.grasshopperfx;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;

public class Grasshopper extends Thread{
    Ellipse grasshopper;
    int x;
    int y;
    int kolvo;
    int [][] coords;

    public Grasshopper(Ellipse grasshopper, int kolvo, int[][] coords) {
        this.grasshopper = grasshopper;
        this.kolvo = kolvo;
        this.coords = coords;
    }

    @Override
    public void run() {
        try {
                for (int i=0; i<kolvo; i++) {
                    sleep(1000);
                    grasshopper.setCenterX(coords[i][0]);
                    grasshopper.setCenterY(coords[i][1]);
                }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


