/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook.controllers;

import com.mycompany.addressbook.App;
import com.mycompany.addressbook.gestionerubrica.Contatto;
import com.mycompany.addressbook.rubrica.InterfacciaRubrica;
import com.mycompany.addressbook.rubrica.Rubrica;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.collections.FXCollections;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Popup;

/**
 * @file RubricaController.java
 * @class RubricaController
 * @brief Controller Scena principale
 * 
 * Questa classe controller gestisce le interazioni con l'utente relative alle operazioni di ricerca, eliminazione o visualizzazione in dettaglio e non dei contatti elencati nella rubrica, 
 * e inoltre le operazioni di salvataggio o importazione di rubriche all'interno di essa.
 * 
 * @author Quaranta Davide 
 */
public class RubricaController implements Initializable {

    @FXML
    private MenuItem leggiFileBtn;
    @FXML
    private MenuItem scriviFileBtn;
    @FXML
    private MenuItem salvaEsciBtn;
    @FXML
    private MenuItem esciBtn;
    @FXML
    private TextField fieldRicerca;
    @FXML
    private Button aggiungiBtn;
    @FXML
    private TableView<Contatto> tableRubrica;
    @FXML
    private TableColumn<Contatto,String> cognomeClm;
    @FXML
    private TableColumn<Contatto,String> nomeClm;
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
    private MenuItem salvataggioManualeBtn;
    /**
     * @brief attributo usato per istanziare un oggetto di tipo InterfacciaRubrica
     */
    private static InterfacciaRubrica rubrica = new Rubrica();
    /**
     * 
     * @brief lista osservabile che permette di visualizzare sulla Scena tutti i contatti inseriti e le operazioni che vengono effettuate su di essi.
     */
    private ObservableList<Contatto> lista;
    /**
     * @brief metodo che restituisce l'attributo di tipo InterfacciaRubrica.
     * 
     * 
     * @return attributo InterfacciaRubrica
     */
    
    public static InterfacciaRubrica getInterfacciaRubrica(){
        return rubrica;
    }
    
    
    
    /**
     *  
     * @brief metodo che permette di inizializzare il controller legato al file della Scena Rubrica.fxml.
     *
     * 
     * 
     * @param[in] url è un parametro al quale viene passato il path relativo della Scena che deve mostrare.
     * Nel nostro caso quindi rappresenterà il path del File Rubrica.fxml a cui si associa tale Controller.
     * Altrimenti, in caso di posizione non nota, avrà valore null.
     * 
     *
     * @param[in] rb è un parametro che gestisce le risorse utilizzate per localizzare l'oggetto radice,
     * oppure null se l'oggetto radice non è stato localizzato. 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lista = FXCollections.observableArrayList(rubrica.getLista());
        nomeClm.setCellValueFactory( new PropertyValueFactory("nome"));
        cognomeClm.setCellValueFactory( new PropertyValueFactory("cognome"));

        tableRubrica.setItems(lista);
        
        
    }    

    /**
     * @brief permette la lettura di un file, grazie al metodo \ref GestoreFile::leggiFile(String nomefile) "leggiFile" di GestoreFile.
     * 
     * permette di selezionare un file all'interno del dispositivo e di leggerlo in modo tale da poter importare una Rubrica esterna salvata su file.
     * Ciò ci permette di non visualizzare più la Rubrica corrente ma quella caricata dal file.
     * 
     * @param[in] event è un parametro che cattura l'evento legato all'azione del click del tasto leggiFileBtn,
     * e fornisce informazioni utili per l'evento, che è possibile sfruttare all'interno del metodo. 
     */
    @FXML
    private void leggiFileBtnAction(ActionEvent event) {
     
    }
    /**
     * @brief permette la scrittura su file della Rubrica, grazie al metodo \ref GestoreFile::ScriviFile(String nomefile) "ScriviFile" di GestoreFile.
     * 
     * permette di salvare il contenuto della Rubrica all'interno di un file, che possiamo nominare come vogliamo e possiamo posizionare dove vogliamo nel dispositivo corrente.
     * 
     * 
     * 
     * @param[in] event è un parametro che cattura l'evento legato all'azione del click del tasto scriviFileBtn,
     * e fornisce informazioni utili per l'evento, che è possibile sfruttare all'interno del metodo. 
     */
    @FXML
    private void scriviFileBtnAction(ActionEvent event) {
        
    }
    /**
     * @brief permette di salvare le modifiche su un file e di chiudere l'applicazione.
     * 
     * permette di effettuare la scrittura del file di Default per la Rubrica e di uscire dall'applicazione.
     * 
     * @post il contenuto attuale della Rubrica viene salvato e viene chiusa l'applicazione.
     * @param[in] event è un parametro che cattura l'evento legato all'azione del click del tasto salvaEsciBtn,
     * e fornisce informazioni utili per l'evento, che è possibile sfruttare all'interno del metodo. 
     */
    @FXML
    private void salvaEsciBtnAction(ActionEvent event) {
      
    }
    /**
     * 
     * @brief permette di uscire dall'applicazione, senza salvare le modifiche effettuate durante la sessione corrente.
     * @post l'applicazione viene chiusa.
     * @param[in] event è un parametro che cattura l'evento legato all'azione del click del tasto esciBtn,
     * e fornisce informazioni utili per l'evento, che è possibile sfruttare all'interno del metodo. 
     */
    @FXML
    private void esciBtnAction(ActionEvent event) {
      exit();
    }
    /**
     * 
     * @brief permette di ricercare un contatto all'interno della Rubrica.
     * 
     *
     * @post viene mostrato il risultato della ricerca.
     * 
     * @param[in] event è un parametro che cattura l'evento legato all'azione del popolamento del TextField fieldRicerca,
     * e fornisce informazioni utili per l'evento, che è possibile sfruttare all'interno del metodo. 
     */
    @FXML
    private void ricercaAction(ActionEvent event) {
       
    }
    /**
     * @brief permette di aggiungere un contatto in Rubrica e di visualizzarlo al suo interno, grazie al metodo \ref InterfacciaRubrica::aggiungiContatto(Contatto c) "aggiungiContatto" .
     * 
     * Permette di visualizzare il contatto aggiunto all'interno della rubrica.
     * 
     * @post il contatto è visibile nella rubrica presente nella Scena.
     * @param[in] event è un parametro che cattura l'evento legato all'azione del click del tasto aggiungiBtn,
     * e fornisce informazioni utili per l'evento, che è possibile sfruttare all'interno del metodo. 
     */
    @FXML
    private void aggiungiContattoBtnAction(ActionEvent event) throws IOException {
        App.setRootAndGetLoader("AggiungiModifica");
        lista.setAll(rubrica.getLista());
    }
    /**
     * 
     * @brief permette di rimuovere e non visualizzare più un Contatto dalla Rubrica mostrata, grazie al metodo in InterfacciaRubrica \ref InterfacciaRubrica::eliminaContatto(Contatto c) "eliminaContatto"
     * 
     * @pre ricercare il contatto da voler eliminare.
     * @post contatto non più presente e visualizzabile nella rubrica.
     * @param[in] event è un parametro che cattura l'evento legato all'azione del click del tasto eliminaBtn,
     * e fornisce informazioni utili per l'evento, che è possibile sfruttare all'interno del metodo. 
     */
    @FXML
    private void eliminaContattoBtnAction(ActionEvent event) {
        int selectedIndex = tableRubrica.getSelectionModel().getSelectedIndex();
        if(selectedIndex == -1){
            //mostrare un popup di avvertenza
        }
        rubrica.eliminaContatto(lista.remove(selectedIndex));
    }
    /**
     * @brief permette di modificare le informazioni di un Contatto, grazie all'uso del metodo \ref InterfacciaRubrica::modificaContatto(Contatto c) "modificaContatto".
     * 
     * Permette la modifica di un contatt,o visibile nella Rubrica mostrata nella Scena. 
     * 
     * @pre ricercare il contatto da voler modificare.
     * @post modifica visibili nella Rubrica della Scena.
     * @param[in] event è un parametro che cattura l'evento legato all'azione del click del tasto modificaBtn,
     * e fornisce informazioni utili per l'evento, che è possibile sfruttare all'interno del metodo. 
     */
    @FXML
    private void modificaContattoBtnAction(ActionEvent event) {
        
    }
    /**
     * @brief permette il Salvataggio Manuale della Rubrica durante la sessione, grazie all'uso del metodo \ref GestoreFile::scriviFile(String nomefile) "scriviFile" in GestoreFile.
     * 
     * Permette di salvare il contenuto della Rubrica, in maniera manuale, durante la sessione. 
     * @post rubrica salvata sul File di Default.
     * @param[in] event è un parametro che cattura l'evento legato all'azione del click del tasto salvataggioManualeBtn,
     * e fornisce informazioni utili per l'evento, che è possibile sfruttare all'interno del metodo. 
     */
    @FXML
    private void salvataggioManualeBtnAction(ActionEvent event){
        
    }
    
}
