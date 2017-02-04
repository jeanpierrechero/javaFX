/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author educacionit
 */
public class JavaFXApplication1 extends Application {

    public Stage primaryStage;
    private AnchorPane rootLayout;

    @Override
    public void start(Stage stage) throws Exception {
        // Load root layout from fxml file.
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/javafxapplication1/FXMLDocument.fxml"));
        rootLayout = (AnchorPane) loader.load();

        // Give the controller access to the main app.
        FXMLDocumentController controller = loader.getController();
        controller.setMainApp(this);
        primaryStage = stage;
        Scene scene = new Scene(rootLayout);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
