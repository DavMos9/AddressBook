package com.mycompany.addressbook.controllers;

import com.mycompany.addressbook.App;
import com.mycompany.addressbook.gestionerubrica.Contatto;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
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
 * @author Quaranta Davide 
 */
public class AggiungiModificaController/* implements Initializable*/ {

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

    private Contatto contatto;
    
    public Contatto getContatto(){
        return this.contatto;
    }
    public void setContatto(Contatto c){
        contatto = c;
    }
    /**
     *  
     * 
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
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }*/
    
    
    public void setField(Contatto temp){
        if(temp == null){ // null -> aggiuntaContatto
            labelTitle.setText("Aggiungi Nuovo Contatto");
            
        }else{  // notNull -> modificaContatto
            labelTitle.setText("Modifica Contatto");
            nomeField.setText(temp.getNome());
            cognomeField.setText(temp.getCognome());
            tel1Field.setText(temp.getTel()[0]);
            tel2Field.setText(temp.getTel()[1]);
            tel3Field.setText(temp.getTel()[2]);
            mail1Field.setText(temp.getMail()[0]);
            mail2Field.setText(temp.getMail()[1]);
            mail3Field.setText(temp.getMail()[2]);
            
        }
        
        setContatto(temp);
        
    }
    
    /**
     * 
     * @brief è il metodo legato all'azione del click del bottone denominato confermaBtn nella Scena.
     * 
     * Tale metodo permette di confemare le operazioni effettuate sulla rubrica, visibile nella Scena principale Rubrica.fxml.
     * Nello specifico le operazioni di Aggiunta e modifica di un contatto. Infine permette l'ordinamento di essi e il ritorno alla Scena principale.
     * 
     * @pre l'utente ha accesso alla Scena (AggiungiModifica.fxml), grazie al click del bottone "Aggiungi nuovo Contatto" o "modifica" presenti nella scena principale.
     * 
     * @post viene modificato il contatto selezionato(garantito dalle post condizioni dei metodi set nella classe Contatto), oppure viene aggiunto il nuovo contatto alla rubrica.
     * 
     * @param[in] event è un parametro che cattura l'evento legato all'azione del click del tasto confermaBtn,
     * e fornisce informazioni utili per l'evento, che è possibile sfruttare all'interno del metodo. 
     */
    @FXML
    private void confermaBtnAction(ActionEvent event) throws IOException{
        if(getContatto() == null){ // null -> aggiungiContatto
            //il controllo della precondizione che nome o cognome sia valorizzato viene effettuato nel costruttore di Contatto.
            
            if(nomeField.getText().equals("") && cognomeField.getText().equals("")){ //mostra popup per precondizione
                alert();
            }else{
                Contatto c = new Contatto(nomeField.getText(),cognomeField.getText(),tel1Field.getText(),tel2Field.getText(),tel3Field.getText(),mail1Field.getText(),mail2Field.getText(),mail3Field.getText());
                RubricaController.getInterfacciaRubrica().aggiungiContatto(c);
                RubricaController.getInterfacciaRubrica().ordina();
                App.setRootAndGetLoader("Rubrica");
                assert RubricaController.getInterfacciaRubrica().getCollezione().contains(c);
            }
        }else{
            if(nomeField.getText().equals("") && cognomeField.getText().equals("")){
                alert();
            }else{
                Contatto temp = new Contatto(nomeField.getText(),cognomeField.getText(),tel1Field.getText(),tel2Field.getText(),tel3Field.getText(),mail1Field.getText(),mail2Field.getText(),mail3Field.getText());
                RubricaController.getInterfacciaRubrica().modificaContatto(getContatto(), temp);
                RubricaController.getInterfacciaRubrica().ordina();

                App.setRootAndGetLoader("Rubrica");
            }
        }
    }
    
    private void alert(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Attenzione");
        alert.setHeaderText("il contatto deve presentare almeno il nome o il cognome");
        alert.showAndWait();
    }
    /**
     * 
     * @brief è il metodo legato all'azione del click del bottone denominato annullaBtn nella Scena.
     * 
     * Tale metodo permette di annullare le operazioni di aggiunta o modifica di contatti all'interno della rubrica, visibile nella Scena principale, e infine permette il ritorno ad essa .
     * 
     * @pre l'utente ha accesso alla Scena AggiungiModifica.fxml, grazie al click del bottone "Aggiungi nuovo Contatto" o "modifica" presenti nella scena principale.
     * 
     * @post ciò che viene effettuato sulla seconda scena quindi modifica delle informazioni di un contatto, o aggiunta di un nuovo contatto, non si riflette sulla Rubrica.
     * 
     * @param[in] event è un parametro che cattura l'evento legato all'azione del click del tasto annullaBtn,
     * e fornisce informazioni utili per l'evento, che è possibile sfruttare all'interno del metodo. 
     */
    @FXML
    private void annullaBtnAction(ActionEvent event) throws IOException{
        App.setRootAndGetLoader("Rubrica");
    }
    
}
