/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 * FXML Controller class
 *
 * @author david
 */
public class ProgettoController implements Initializable {

    @FXML
    private TextField fieldRicerca;
    @FXML
    private Button aggiungiBtn;
    @FXML
    private Button eliminaBtn;
    @FXML
    private Button modificaBtn;
    @FXML
    private MenuItem salvataggioManuale;
    @FXML
    private MenuItem leggiFile;
    @FXML
    private MenuItem scriviFile;
    @FXML
    private MenuItem chiudiSalva;
    @FXML
    private MenuItem chiudiSenzaSalvare;
    @FXML
    private MenuItem doc;
    @FXML
    private TableView<Contatto> tableRubrica;
    @FXML
    private TableColumn<Contatto, String> nomeClm;
    @FXML
    private TableColumn<Contatto,String> cognomeClm;
    @FXML
    private Label labelNome;
    @FXML
    private Label labelCognome;
    @FXML
    private Label labelNum1;
    @FXML
    private Label labelNum2;
    @FXML
    private Label labelNum3;
    @FXML
    private Label labelMail1;
    @FXML
    private Label labelMail2;
    @FXML
    private Label labelMail3;

    
    private static InterfacciaRubrica rubrica = new Rubrica();// è necessario inizializzare in linea
    private ObservableList<Contatto> lista;
    
    public static InterfacciaRubrica getRubrica(){
        return rubrica;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void ricerca(ActionEvent event){
        
    }
    
    @FXML
    private void aggiungiContatto(ActionEvent event) throws IOException{
        
        
    }

    @FXML
    private void eliminaContatto(ActionEvent event){
    }

    @FXML
    private void modificaContatto(ActionEvent event){
        
    }

    @FXML
    private void leggiFileScanner(ActionEvent event) {
    }

    @FXML
    private void scriviFileScanner(ActionEvent event) {
    }

    @FXML
    private void chiudiSalvaAction(ActionEvent event) {
    }

    @FXML
    private void chiudiSenzaSalvare(ActionEvent event) {
    }

    @FXML
    private void documentazione(ActionEvent event) {
    }
    
}
