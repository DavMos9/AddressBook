package com.mycompany.addressbook.rubrica;

import com.mycompany.addressbook.gestionerubrica.Comparatore;
import com.mycompany.addressbook.gestionerubrica.Contatto;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @file Rubrica.java
 * @class Rubrica
 * @brief Classe che implementa e gestisce una Rubrica di contatti.
 * 
 * La classe rubrica, implementa l'interfaccia InterfacciaRubrica.
 * Per la Documentazione di tutti i metodi vedere l'interfaccia @ref InterfacciaRubrica
 * 
 * @author Ronca Ciro
 * 
 * 
 */
public class Rubrica implements InterfacciaRubrica{
    
    /**
     * @brief Lista usata per gestire tutti i contatti.
     */
    private List<Contatto> listaContatti;
    
    
    /**
     * 
     * @brief Costruttore della classe Rubrica.
     * 
     * Permette di istanziare una Lista di contatti.
     * 
     */
    public Rubrica(){
        listaContatti = new ArrayList<>();
    }
    /**
     * @brief vedere documentazione in InterfacciaRubrica \ref InterfacciaRubrica::getCollezione() "getCollezione".
     * 
     */
    @Override
    public List<Contatto> getCollezione() {
        return listaContatti;
    }
    /**
     * 
     * @brief vedere documentazione in InterfacciaRubrica \ref InterfacciaRubrica::aggiungiContatto(Contatto c) "aggiungiContatto".
     * 
     */
    @Override
    public void aggiungiContatto(Contatto c) {
        listaContatti.add(c);
    }
    
    /**
     * @brief vedere documentazione in InterfacciaRubrica \ref InterfacciaRubrica::modificaContatto(Contatto c) "modificaContatto".
     * 
     */
    @Override
    public void modificaContatto(Contatto before,Contatto after){
        before.setNome(after.getNome());
        before.setCognome(after.getCognome());
        before.setTel(after.getTel()[0], after.getTel()[1], after.getTel()[2]);
        before.setMail(after.getMail()[0], after.getMail()[1], after.getMail()[2]);
    }
    /**
     * @brief vedere documentazione in InterfacciaRubrica \ref InterfacciaRubrica::eliminaContatto(Contatto c) "eliminaContatto".
     * 
     * 
     */
    @Override
    public void eliminaContatto(Contatto c) {
        listaContatti.remove(c);
        
        assert !listaContatti.contains(c);
    }

    /** 
     *
     *
     *@brief vedere documentazione in InterfacciaRubrica \ref InterfacciaRubrica::ricerca(String text) "ricerca".
     *  
     *
     */
    @Override
    public List<Contatto> ricerca(String query){
        List<Contatto> result = new ArrayList<>();

        for(Contatto contatto : this.getCollezione()){
            if (contatto.getCognome().toLowerCase().contains(query.toLowerCase())){
                result.add(contatto);
            }else if (contatto.getNome().toLowerCase().contains(query.toLowerCase())){
                result.add(contatto);
            }
        }
        return result;
    }

    /** 
     *
     *@brief vedere documentazione in InterfacciaRubrica \ref InterfacciaRubrica::ordina() "ordina".
     *  
     *
     */
    @Override
    public void ordina(){
        listaContatti.sort(new Comparatore());
    }
}
