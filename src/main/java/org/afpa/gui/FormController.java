package org.afpa.gui;

import javafx.beans.value.ChangeListener;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;

public class FormController {

    public Slider redSlider;
    public Slider greenSlider;
    public Slider blueSlider;
    public Pane bluePane;
    public Pane greenPane;
    public Pane redPane;
    public Pane mainPane;
    double red = 0;
    double green =0;
    double blue = 0;

    public void initialize(){

        //noinspection unchecked
        redSlider.valueProperty().addListener((ChangeListener) (observable, oldValue, newValue) -> {

            red = redSlider.getValue();
            mainPane.setStyle("-fx-background-color: RGB("+red+","+green+","+blue+")");
        });

        //noinspection unchecked
        blueSlider.valueProperty().addListener((ChangeListener) (observable, oldValue, newValue) -> {

            blue = blueSlider.getValue();
            mainPane.setStyle("-fx-background-color: RGB("+red+","+green+","+blue+")");
        });

        //noinspection unchecked
        greenSlider.valueProperty().addListener((ChangeListener) (observable, oldValue, newValue) -> {

            green = greenSlider.getValue();
            mainPane.setStyle("-fx-background-color: RGB("+red+","+green+","+blue+")");
        });
    }
}
