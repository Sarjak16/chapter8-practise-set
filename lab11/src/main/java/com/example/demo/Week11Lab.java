package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.animation.RotateTransition;
import javafx.util.Duration;

public class Week11Lab extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();

        // Circle
        Circle circle = new Circle(150, 150, 50);
        circle.setFill(Color.BLUE);

        // Line
        Line line = new Line(50, 300, 300, 300);
        line.setStroke(Color.GREEN);

        // Triangle
        Polygon triangle = new Polygon(400.0, 200.0, 450.0, 300.0, 350.0, 300.0);
        triangle.setFill(Color.ORANGE);

        // Image
        Image image = new Image("https://via.placeholder.com/150");
        ImageView imageView = new ImageView(image);
        imageView.setX(100);
        imageView.setY(350);

        // Rotation animation
        RotateTransition rotate = new RotateTransition(Duration.seconds(3), circle);
        rotate.setByAngle(360);
        rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.play();

        root.getChildren().addAll(circle, line, triangle, imageView);

        Scene scene = new Scene(root, 600, 600);
        primaryStage.setTitle("JavaFX Week 11 Lab");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
