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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import sun.security.util.Password;

public class FXMLController implements Initializable {
    
    @FXML
    private AnchorPane Todo;
    
    @FXML
    private ImageView Visor;
    
    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnAcceder;

    @FXML
    private Label lblEntidad;

    @FXML
    void accionAcceder(ActionEvent event) {
        try{
            
            String usuario="admin";
            String password="123";
            String pass=new String(txtPassword.getText());
            if(txtUsuario.getText().equals(usuario) && pass.equals(password)){
                //Dirigete al stage actual y toma la escena actual (valga la redundancia)
                Stage stage = (Stage) btnAcceder.getScene().getWindow(); 
                //Cierra el stage actual
                //stage.close();
                //Léeme el source del archivo que te digo fxml y te pongo el path
                FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("/fxml/Far.fxml"));
                Parent root1= (Parent)fxmlLoader.load();
                
                //Y ahora dentro del Stage cambias a la escena que anteriormente hemos leído y metido en root1
                stage.setScene(new Scene(root1));
                
                // Y ahora le digo que me muestres el stage
                stage.show();
            }else{
                JOptionPane.showMessageDialog(null, "Contraseña o nombre de usuario incorrecto");
            }
        }catch(Exception ex){
            System.out.println("Ocurrió un error, lo sentimos");
        }
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        /*System.out.println("You clicked me!");
        label.setText("Hello World!");*/
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
