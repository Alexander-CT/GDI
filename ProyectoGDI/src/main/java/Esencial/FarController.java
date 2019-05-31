/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esencial;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ADM667
 */
public class FarController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private AnchorPane Todo;
    
    @FXML
    private Button btnVolver;
    
    @FXML
    void accionVolver(ActionEvent event) {
        try{
            //Dirigete al stage actual y toma la escena actual (valga la redundancia)
            Stage stage = (Stage) btnVolver.getScene().getWindow(); 
            //Cierra el stage actual
            //stage.close();
            //Léeme el source del archivo que te digo fxml y te pongo el path
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("/fxml/Scene.fxml"));
            Parent root1= (Parent)fxmlLoader.load();
 
            //Y ahora dentro del Stage cambias a la escena que anteriormente hemos leído y metido en root1
            stage.setScene(new Scene(root1));
            
            // Y ahora le digo que me muestres el stage
            stage.show();
 
        }catch(Exception ex){
            System.out.println("Ocurrió un error, lo sentimos");
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
