package com.example.grasshopperfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Ellipse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class HelloController {
    @FXML
    private  Ellipse grasshopper;
    @FXML
    private  Ellipse frog;

    @FXML
    void jump(ActionEvent event) throws FileNotFoundException, InterruptedException {
        Scanner sc = new Scanner(new File("INPUT"));
        int n = sc.nextInt();
        int xb = sc.nextInt();
        int yb = sc.nextInt();
        frog.setCenterX(xb);
        frog.setCenterY(yb);
        int[][] coords = new int[n][2];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            coords[i][0] = x;
            coords[i][1] = y;
        }
        Grasshopper g = new Grasshopper(grasshopper, n, coords);
            g.start();
        }

    }

