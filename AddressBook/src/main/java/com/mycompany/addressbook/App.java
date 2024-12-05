package com.mycompany.addressbook;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


/**
 * @class App
 * @brief Classe principale per l'applicazione rubrica telefonica.
 *
 * Questa classe gestisce l'avvio dell'applicazione e il caricamento dell'interfaccia utente.
 *
 * @author Moscariello
 *
 */

public class App extends Application {

    private static Scene scene;

    /**
     * @brief Avvia l'applicazione.
     *
     * Questo metodo viene chiamato automaticamente all'avvio dell'applicazione.
     * Imposta la scena principale definita nel file FXML.
     *
     * @param stage La scena principale dell'applicazione.
     * @throws IOException Se il file FXML non può essere caricato.
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Progetto"), 1000, 800);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @brief Imposta la configurazione radice della scena corrente.
     *
     * Questo metodo consente di cambiare la configurazione principale dell'applicazione
     * caricando un nuovo file FXML.
     *
     * @param fxml Il nome del file FXML da caricare.
     * @throws IOException Se il file FXML non può essere caricato.
     */

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }


    /**
     * @brief Carica un file FXML e restituisce il nodo radice.
     *
     * Questo metodo utilizza FXMLLoader per caricare un file FXML e restituire
     * la configurazione radice definito in esso.
     *
     * @param fxml Il nome del file FXML da caricare.
     * @return Il nodo radice del layout caricato.
     * @throws IOException Se il file FXML non può essere caricato.
     */

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * @brief Punto di ingresso principale dell'applicazione.
     *
     * Questo metodo avvia l'applicazione JavaFX.
     *
     * @param args Argomenti della riga di comando.
     */

    public static void main(String[] args) {
        launch();
    }

}