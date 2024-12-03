/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.resources.com.mycompany.addressbook;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author david
 */
public class Progetto2Controller implements Initializable {

    @FXML
    private TextField nomeField;
    @FXML
    private TextField cognomeField;
    @FXML
    private TextField tel1Field;
    @FXML
    private Button confermaBtn;
    @FXML
    private TextField tel2Field;
    @FXML
    private TextField tel3Field;
    @FXML
    private TextField mail1Field;
    @FXML
    private TextField mail2Field;
    @FXML
    private TextField mail3Field;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }

    @FXML
    private void confermaAggiuntaContatto(ActionEvent event) throws IOException {
        
        
    }
    
    
}
