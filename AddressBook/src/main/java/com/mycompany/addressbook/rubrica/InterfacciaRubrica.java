package com.mycompany.addressbook.rubrica;

import com.mycompany.addressbook.gestionerubrica.Contatto;
import java.util.List;

/**
 *
 * @interface InterfacciaRubrica
 *
 * @brief Interfaccia di front-end per la gestione delle principali funzionalità della rubrica.
 *
 *
 * La classe InterfacciaRubrica definisce le seguenti operazioni sulla rubrica telefonica:
 * aggiungiContatto, modificaContatto, eliminaContatto, ricercaContatto.
 *
 * @author Sessa Domenico
 */
public interface InterfacciaRubrica {

    /**
     * @brief Aggiunge un contatto alla rubrica.
     *
     * Tale metodo accetta in ingresso un parametro di tipo Contatto e permette l'aggiunta di un nuovo contatto nella rubrica.
     *
     * @pre Per aggiungere un contatto è condizione necessaria che almeno uno dei due campi nome o cognome sia valorizzato.
     * 
     * @param c rappresenta il contatto da inserire
     */
    void aggiungiContatto(Contatto c);

    /**
     * @brief Modifica un contatto all'interno della rubrica.
     * 
     * Tale metodo accetta in ingresso un parametro di tipo Contatto e permette la modifica dei valori dei campi di un contatto presente nella rubrica.
     *
     * @pre Per far si che la modifica vada a buon fine, è condizione necessaria che almeno uno dei due campi nome o cognome sia valorizzato.
     * 
     * @param c rappresenta il contatto su cui effettuare le modifiche.
     */
    void modificaContatto(Contatto c);

    /**
     *@brief Elimina un contatto all'interno della rubrica.
     * 
     * Tale metodo accetta in ingresso un parametro di tipo Contatto e permette di eliminare (rimozione fisica) un contatto presente nella rubrica.
     * 
     * @param c rappresenta il contatto da eliminare
     */
    void eliminaContatto(Contatto c);


    /**
     * @brief Ricerca un contatto all'interno della rubrica.
     *
     * Tale metodo permette di ricercare nella rubrica il contatto il cui nome o cognome corrisponde o inizia con la stringa inserita nella ricerca.
     * 
     * @param c rappresenta il contatto da ricercare in rubrica.
     * @return viene restituito il contatto che soddisfa i criteri di ricerca.In assenza di corrispondenza viene restituito null.
     */
    Contatto ricercaContatto(Contatto c);
    
    /**
     * 
     * @brief Restituisce la lista dei contatti.
     * 
     * Questo metodo permette di ottenere la lista dei contatti ordinata per cognome e nome.
     * 
     * 
     * @return List una Collezione(Lista) di Contatti.
     */
    List<Contatto> getLista();

}
