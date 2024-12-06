package com.mycompany.addressbook;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * @file AggiungiModificaController.java
 * @class AggiungiModificaController
 * @brief Controller Scena secondaria
 * 
 * Questa classe controller gestisce le interazioni con l'utente relative alle operazioni di 
 * aggiunta e modifica dei contatti all'interno della Rubrica.
 * 
 * @author Davide Quaranta
 */
public class AggiungiModificaController implements Initializable {

    @FXML
    private Label labelTitle;
    @FXML
    private TextField nomeField;
    @FXML
    private TextField cognomeField;
    @FXML
    private TextField tel1Field;
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
    @FXML
    private Button confermaBtn;
    @FXML
    private Button annullaBtn;

    /**
     *  
     * @brief è un Metodo che permette di inizializzare il controller legato al file della Scena(AggiungiModifica.fxml).
     *
     * 
     * 
     * @param[in] url è un parametro al quale viene passato il path relativo della Scena che viene mostrata.
     * Nel nostro caso quindi rappresenterà il path del File AggiungiModifica.fxml a cui si associa tale Controller.
     * Altrimenti, in caso di posizione non nota, avrà valore null.
     * 
     *
     * @param[in] rb è un parametro che gestisce le risorse utilizzate per localizzare l'oggetto radice,
     * oppure null se l'oggetto radice non è stato localizzato. 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }
    /**
     * 
     * @brief è il metodo legato all'azione del click del bottone denominato confermaBtn nella Scena.
     * 
     * Tale metodo permette di confemare le operazioni effettuate sulla rubrica, visibile nella Scena (Rubrica.fxml).
     * Nello specifico le operazioni di Aggiunta e modifica di un contatto. Infine permette l'ordinamento di essi e il ritorno alla Scena Rubrica.fxml .
     * 
     * @pre l'utente ha accesso alla Scena (AggiungiModifica.fxml), grazie al click del bottone "Aggiungi nuovo Contatto" o "modifica".
     * 
     * @post viene modificato il contatto selezionato, oppure viene aggiunto il nuovo contatto alla rubrica.
     * 
     * @param[in] event è un parametro che cattura l'evento legato all'azione del click del tasto confermaBtn,
     * e fornisce informazioni utili per l'evento, che è possibile sfruttare all'interno del metodo. 
     */
    @FXML
    private void confermaBtnAction(ActionEvent event) {
    }
    /**
     * 
     * @brief è il metodo legato all'azione del click del bottone denominato annullaBtn nella Scena.
     * 
     * Tale metodo permette di annullare le operazioni di aggiunta o modifica di contatti all'interno della rubrica, visibile nella Scena (Rubrica.fxml), e infine permette il ritorno alla Scena Rubrica.fxml .
     * 
     * @pre l'utente ha accesso alla Scena (AggiungiModifica.fxml), grazie al click del bottone "Aggiungi nuovo Contatto" o "modifica".
     * 
     * @post ciò che viene effettuato sulla seconda scena quindi modifica delle informazioni di un contatto, o aggiunta di un nuovo contatto, non si riflette sulla Rubrica.
     * 
     * @param[in] event è un parametro che cattura l'evento legato all'azione del click del tasto annullaBtn,
     * e fornisce informazioni utili per l'evento, che è possibile sfruttare all'interno del metodo. 
     */
    @FXML
    private void annullaBtnAction(ActionEvent event) {
    }
    
}
