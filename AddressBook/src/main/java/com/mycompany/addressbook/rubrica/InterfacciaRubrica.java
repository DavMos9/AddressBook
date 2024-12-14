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
 * aggiunta, modifica, eliminazione e ricerca di un Contatto ed ordinamento e restituzione della collezione di Contatti.
 *
 * @author Sessa Domenico
 */
public interface InterfacciaRubrica {

    /**
     * @brief Aggiunge un contatto alla rubrica.
     *
     * Tale metodo accetta in input un parametro di tipo Contatto e permette l'aggiunta di un nuovo contatto nella rubrica.
     *
     *@pre Per aggiungere un contatto è condizione necessaria che almeno uno dei due campi nome o cognome sia valorizzato (garantito dal Costruttore della Classe Contatto).
     *
     * @param c rappresenta il contatto da inserire.
     */
    void aggiungiContatto(Contatto c);

    /**
     * @brief Modifica un contatto all'interno della rubrica.
     *
     * Tale metodo accetta in input due parametri di tipo Contatto e permette la modifica dei valori dei campi del primo con quelli del secondo.
     *
     * @pre Per far si che la modifica vada a buon fine, e' condizione necessaria che almeno uno dei due campi nome o cognome sia valorizzato(garantito dal Costruttore della Classe Contatto).
     *
     * @param[in] before rappresenta il contatto, presente già in rubrica, su cui effettuare le modifiche.
     * @param[in] after rappresenta il contatto modificato, con il quale modifico il contenuto del primo. 
     */
    void modificaContatto(Contatto before,Contatto after);

    /**
     *@brief Elimina un contatto all'interno della rubrica.
     *
     * Tale metodo accetta in input un parametro di tipo Contatto e permette di eliminarlo della rubrica.
     *
     * @post il contatto non è più presente in rubrica
     * @param[in] c rappresenta il contatto da eliminare.
     */
    void eliminaContatto(Contatto c);


    /**
     *
     * @brief Restituisce la Collection di contatti.
     *
     * Questo metodo permette di ottenere la Collection intera di contatti.
     *
     *
     * @return una Collection di Contatti.
     */
    Collection<Contatto> getCollezione();

    /**
     * @brief Ricerca all'interno della rubrica.
     * 
     * Questo metodo permette di effettuare una ricerca sul cognome e nome dei contatti presenti all'interno della Rubrica, sulla base del valore di input.
     *
     * @post viene mostrato il risultato della ricerca.
     *
     * @param[in] text stringa sul quale viene effettuata la ricerca.
     * @return una Collection con all'interno i contatti affini alla ricerca effettuata.
     * 
     */
    Collection<Contatto> ricerca(String text);
    
    /**
     * @brief Ordinamento dei Contatti nella Rubrica.
     * 
     * Questo metodo permette di ordinare i Contatti, alfabeticamente per cognome e nome.
     */
    void ordina();
}
