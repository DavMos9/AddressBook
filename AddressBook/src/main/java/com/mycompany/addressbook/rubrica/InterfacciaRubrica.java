/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook.rubrica;

import com.mycompany.addressbook.gestionerubrica.Contatto;
import java.util.List;

/**
 *
 * @interface InterfacciaRubrica
 *
 * @brief Classe di front-end per la gestione delle principali funzionalità della rubrica.
 *
 *
 * La classe InterfacciaRubrica definisce le seguenti operazioni sulla rubrica telefonica:
 * aggiungiContatto, modificaContatto, eliminaContatto, ricercaContatto.
 *
 * @author Domenico
 */
public interface InterfacciaRubrica {

    /**
     * @brief
     *
     * aggiungiContatto: accetta in input un parametro di tipo Contatto
     *       Permette l'aggiunta di un nuovo contatto nella rubrica
     *
     *
     * @param c c rappresenta il contatto da inserire
     */
    void aggiungiContatto(Contatto c);

    /**
     * @brief
     * modificaContatto: accetta in input un parametro di tipo Contatto
     *       Permette la modifica dei valori dei campi di un contatto presente nella rubrica
     *
     * @param c c rappresenta il contatto su cui effettuare le modifiche
     */
    void modificaContatto(Contatto c);

    /**
     *
     * eliminaContatto: accetta in input un parametro di tipo Contatto
     *       Permette di eliminare (rimozione fisica) un contatto presente mella rubrica
     *
     * @param c c rappresenta il contatto da eliminare
     */
    void eliminaContatto(Contatto c);


    /**
     * @brief
     *
     * ricercaContatto: accetta in input un parametro di tipo Contatto e restituisce una lista
     *      Permette di ricercare nella rubrica tutti i contatti il cui nome o cognome
     *      inizia con la stringa inserita nella ricerca.
     *      L’operazione di ricerca restituisce l'elenco dei contatti che soddisfa il criterio
     *      di ricerca.
     *
     *
     *
     * @param c c rappresenta il contatto da ricercare in rubrica
     * @return  viene restituita una lista contenente tutti i contatti che soddisfano i criteri di ricerca
     */
    Contatto ricercaContatto(Contatto c);
    List<Contatto> getLista();

}
