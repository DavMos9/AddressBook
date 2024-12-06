/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @file Rubrica.java
 * @brief Questo file gestisce una rubrica
 * 
 * La classe rubrica permette di aggiungere,modificare,eliminare e ricercare
 * un contatto nella rubrica
 * 
 * @author ronca
 * 
 * 
 */
public class Rubrica implements InterfacciaRubrica{
    
    /**
     * @brief Lista usata per permettere di gestire i tutti i contatti
     */
    private List<Contatto> lista;
    
    
    /**
     * 
     * @brief Costruttore di dafault della classe contatto
     * 
     */
    public Rubrica(){
        
    }

    /**
     * 
     * @brief Restituisce la lista dei contatti
     * 
     * Questo metodo permette di ottenere una lista dei contatti
     * ordinata per cognome
     * 
     * @return null
     */
    
    @Override
    public List<Contatto> getLista() {

        return null;
    }

    
    /**
     * 
     * @brief  Aggiunge un contatto alla rubrica
     * 
     * @param [in] c Contatto da aggiungere alla rubrica
     * 
     * @pre
     * Per aggiungere un contatto e' condizione necessaria che almeno uno 
     * dei due campi nome o cognome sia valorizzato
     * 
     * 
     */
    @Override
    public void aggiungiContatto(Contatto c) {
        
    }
    
    /**
     * 
     * @brief Modifica un contatto all'interno della rubrica
     * 
     * @param [in] c Contatto da modificare all'interno della rubrica
     * 
     * @pre
     * Per avere un modfica con successo, e' condizione necessaria che almeno uno dei
     * due campi nome o cognome sia avvolorato
     * 
     * 
     */

    @Override
    public void modificaContatto(Contatto c) {
    }

    
    /**
     * 
     * @brief Elimina un contatto all'interno della rubrica
     * 
     * @param [in] c Contatto da eliminare all'interno della rubrica
     * 
     * 
     */
    @Override
    public void eliminaContatto(Contatto c) {
    }
    
    
    /**
     * 
     * @brief Ricerca un contatto all'interno della rubrica
     * 
     * E' possibile ricercare un contatto inserendo il cognome, il nome o entrambi.
     * Inoltre viene fatta una ricerca inserendo la sottostringa iniziale del cognome o del nome
     * 
     * @param [in] c Contatto da ricercare all'interno della rubrica
     * 
     * @return c Viene restituito il contatto ricercato
     */

    @Override
    public Contatto ricercaContatto(Contatto c) {

        return c;
    }
    
    
}
