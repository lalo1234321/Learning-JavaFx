
package com.javafx.main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
        Button btn=new Button("Click me");
        Button exitBtn=new Button("Exit");
        exitBtn.setOnAction(e -> {
            System.out.println("The program is closing");
            System.exit(0);
        });
        btn.setOnAction(new EventHandler<ActionEvent>()
        { 
            @Override
            public void handle(ActionEvent arg0)
            {
                System.out.println("You clicked the button");
            }
        });
        VBox root=new VBox();
        root.getChildren().addAll(btn,exitBtn);  
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
