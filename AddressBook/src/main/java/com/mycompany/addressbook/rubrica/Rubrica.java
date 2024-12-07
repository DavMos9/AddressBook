package com.mycompany.addressbook.rubrica;

import com.mycompany.addressbook.rubrica.InterfacciaRubrica;
import com.mycompany.addressbook.gestionerubrica.Contatto;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @file Rubrica.java
 * @class Rubrica
 * @brief Classe che implementa e gestisce una Rubrica di contatti.
 * 
 * La classe rubrica, implementa l'interfaccia InterfacciaRubrica che permette di aggiungere,modificare,eliminare e ricercare
 * un contatto nella rubrica.
 * Per la Documentazione di tutti i metodi vedere l'interfaccia @ref InterfacciaRubrica
 * 
 * @author Ronca Ciro
 * 
 * 
 */
public class Rubrica implements InterfacciaRubrica{
    
    /**
     * @brief Lista usata per permettere di gestire tutti i contatti.
     */
    private List<Contatto> lista;
    
    
    /**
     * 
     * @brief Costruttore della classe Rubrica.
     * 
     * permette di istanziare una Lista di contatti.
     * 
     */
    public Rubrica(){
        
    }
    /**
     * @brief vedere documentazione in InterfacciaRubrica \ref InterfacciaRubrica::getLista() "getLista".
     * 
     */
    @Override
    public List<Contatto> getLista() {

        return null;
    }
    /**
     * 
     * @brief vedere documentazione in InterfacciaRubrica \ref InterfacciaRubrica::aggiungiContatto(Contatto c) "aggiungiContatto".
     */
    @Override
    public void aggiungiContatto(Contatto c) {
        
    }
    
    /**
     * @brief vedere documentazione in InterfacciaRubrica \ref InterfacciaRubrica::modificaContatto(Contatto c) "modificaContatto".
     *  
     */
    @Override
    public void modificaContatto(Contatto c){
    }
    /**
     * @brief vedere documentazione in InterfacciaRubrica \ref InterfacciaRubrica::eliminaContatto(Contatto c) "eliminaContatto".
     * 
     */
    @Override
    public void eliminaContatto(Contatto c) {
    }
    /**
     * 
     * @brief vedere documentazione in InterfacciaRubrica \ref InterfacciaRubrica::ricercaContatto(Contatto c) "ricercaContatto".
     *  
     */
    @Override
    public Contatto ricercaContatto(Contatto c) {

        return c;
    }
    
    
}
