
package com.javafx.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application
{
    //Comment to see the diference between the branches in netbeans
    @Override
    public void start(Stage arg0) throws Exception
    {
        Button btn1=new Button("Hello world");
        StackPane root=new StackPane();
        root.getChildren().add(btn1);
        Scene scene=new Scene(root,600,400);
        arg0.setScene(scene);
        arg0.setTitle("First JavaFx Application");
        arg0.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
