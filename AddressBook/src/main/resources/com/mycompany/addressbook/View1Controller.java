/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author david
 */
public class View1Controller implements Initializable {

    @FXML
    private MenuItem salvataggioBtn;
    @FXML
    private MenuItem leggiFileBtn;
    @FXML
    private MenuItem scriviFileBtn;
    @FXML
    private MenuItem salvaEEsciBtn;
    @FXML
    private MenuItem esciBtn;
    @FXML
    private TextField fieldRicerca;
    @FXML
    private Button aggiungiBtn;
    @FXML
    private TableColumn<Contatto, String> cognomeClm;
    @FXML
    private TableColumn<Contatto, String> nomeClm;
    @FXML
    private Label labelNomeView;
    @FXML
    private Label labelCognomeView;
    @FXML
    private Label labelNum1View;
    @FXML
    private Label labelNum2View;
    @FXML
    private Label labelNum3View;
    @FXML
    private Label labelMail1View;
    @FXML
    private Label labelMail2View;
    @FXML
    private Label labelMail3View;
    @FXML
    private Button eliminaBtn;
    @FXML
    private Button modificaBtn;
    @FXML
    private TableView<Contatto> tableRubrica;

    private static InterfacciaRubrica rubrica = new Rubrica();// è necessario inizializzare in linea
    private ObservableList<Contatto> lista;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public static InterfacciaRubrica getRubrica(){
        return rubrica;
    }
    
    @FXML
    private void salvataggioBtnAction(ActionEvent event) {
    }

    @FXML
    private void leggiFileBtnAction(ActionEvent event) {
    }

    @FXML
    private void scriviFileBtnAction(ActionEvent event) {
    }

    @FXML
    private void salvaEEsciBtnAction(ActionEvent event) {
    }

    @FXML
    private void esciBtnAction(ActionEvent event) {
    }

    @FXML
    private void ricercaAction(ActionEvent event) {
    }

    @FXML
    private void aggiungiContattoBtnAction(ActionEvent event) {
    }

    @FXML
    private void eliminaContattoBtnAction(ActionEvent event) {
    }

    @FXML
    private void modificaContattoBtnAction(ActionEvent event) {
    }
    
}
