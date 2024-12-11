package com.mycompany.addressbook.rubrica;

import com.mycompany.addressbook.gestionerubrica.Contatto;
import java.util.Collection;

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
     * Tale metodo accetta in input un parametro di tipo Contatto e permette l'aggiunta di un nuovo contatto nella rubrica.
     *
     *@pre Per aggiungere un contatto è condizione necessaria che almeno uno dei due campi nome o cognome sia valorizzato.
     *
     * @param c rappresenta il contatto da inserire
     */
    void aggiungiContatto(Contatto c);

    /**
     * @brief Modifica un contatto all'interno della rubrica.
     *
     * Tale metodo accetta in input un parametro di tipo Contatto e permette la modifica dei valori dei campi di un contatto presente nella rubrica.
     *
     * @pre Per far si che la modifica vada a buon fine, e' condizione necessaria che almeno uno dei due campi nome o cognome sia valorizzato.
     *
     * @param c rappresenta il contatto su cui effettuare le modifiche.
     */
    void modificaContatto(Contatto before,Contatto after);

    /**
     *@brief Elimina un contatto all'interno della rubrica.
     *
     * Tale metodo accetta in input un parametro di tipo Contatto e permette di eliminare (rimozione fisica) un contatto presente nella rubrica.
     *
     * @param c rappresenta il contatto da eliminare
     */
    void eliminaContatto(Contatto c);




    /**
     *
     * @brief Restituisce la lista dei contatti.
     *
     * Questo metodo permette di ottenere la Collezione dei contatti.
     *
     *
     * @return Collection una Collezione di Contatti.
     */
    Collection<Contatto> getCollezione();

    void ordina();
}
