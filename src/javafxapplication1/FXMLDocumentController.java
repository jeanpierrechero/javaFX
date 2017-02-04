/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author educacionit
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private Label label1,label2,label3;
    
    @FXML
    private TextField txt_nombre; 
    
    @FXML
    private TextField txt_apellido; 
    
    @FXML
    private TextField txt_dni; 
    
    @FXML
    private TextArea txt_area; 
    
    private JavaFXApplication1 main;
    
    
    
    @FXML
    private void nuevoFormulario(ActionEvent event) {
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_dni.setText("");
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        try {
            label1.setText(txt_nombre.getText());
            label2.setText(txt_apellido.getText());
            label3.setText(txt_dni.getText());
            
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/javafxapplication1/Pantalla2.fxml"));
            AnchorPane internalWindow = (AnchorPane) loader.load();
         
            
            Scene scene = new Scene(internalWindow);
            main.primaryStage.setScene(scene);
            main.primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void setMainApp(JavaFXApplication1 main) {
        this.main = main;
    }
    
}
