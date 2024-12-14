package com.mycompany.addressbook;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


/**
 * @class App
 * @brief Classe main per l'avvio dell'applicazione rubrica telefonica.
 *
 * Questa classe gestisce l'avvio dell'applicazione e il caricamento dell'interfaccia utente.
 *
 * @author Moscariello Davide
 *
 */

public class App extends Application {

    private static Scene scene;

    /**
     * @brief Avvia l'applicazione.
     *
     * Questo metodo viene chiamato automaticamente all'avvio dell'applicazione.
     * Imposta e mostra la scena principale definita nel file FXML, grazie ai metodi richiamati.
     *
     * @param stage rappresenta la finestra dell'applicazione.
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Rubrica"), 1000, 800);
        stage.setTitle("AddressBook");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @brief Imposta la configurazione radice della scena corrente.
     *
     * Questo metodo consente di cambiare la Scena mostrata dall'applicazione
     * caricando un nuovo file FXML.
     * 
     * @param[in] fxml Il nome del file FXML da caricare.
     * @return ritorna la risorsa ottenuta dal file fxml.
     */
    public static FXMLLoader setRootAndGetLoader(String fxml) throws IOException{
        FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        scene.setRoot(loader.load());
        return loader; // Ritorna il loader per ottenere il controller
    }


    /**
     * @brief Carica un file FXML e restituisce il nodo radice.
     *
     * Questo metodo utilizza FXMLLoader per caricare un file FXML e restituisce
     * Il nodo radice del layout caricato.
     *
     * @param[in] fxml Il nome del file FXML da caricare.
     * @return Il nodo radice del layout caricato.
     */
    private Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * @brief Punto di ingresso principale dell'applicazione.
     *
     * Questo metodo avvia l'applicazione JavaFX.
     *
     * @param[in] args vettore che presenta al suo interno tutti i dati passati da riga di comando.
     */
    public static void main(String[] args) {
        launch();
    }

}