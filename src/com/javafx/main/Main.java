
package com.javafx.main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{
    //Comment to see the diference between the branches in netbeans
    @Override
    public void start(Stage arg0) throws Exception
    {
        Parent root=FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene=new Scene(root);
        arg0.setScene(scene);
        arg0.setTitle("First JavaFx Application");
        arg0.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
