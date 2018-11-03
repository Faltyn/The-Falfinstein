package cz.gameengine.cellularautomaton;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * Created by Vladimir Faltyn on 3.11.2018.
 */

public class CellularAutomaton extends Application {
  
  @Override
  public void start(Stage primaryStage) throws Exception {
    Group group = new Group();
    Scene scene = new Scene(group, 500, 200);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  
  
  public static void main(String[] args) {
    launch(args);
  }
}

