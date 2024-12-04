/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook;

import java.util.ArrayList;
import java.util.List;

public class Rubrica implements InterfacciaRubrica{
    private List<Contatto> lista;
    
    public Rubrica(){
        
    }

    @Override
    public List<Contatto> getLista() {

        return java.util.Collections.emptyList();
    }

    @Override
    public void aggiungiContatto(Contatto c) {
        
    }

    @Override
    public void modificaContatto(Contatto c) {
    }

    @Override
    public void eliminaContatto(Contatto c) {
    }

    @Override
    public Contatto ricercaContatto(Contatto c) {

        return c;
    }
    
    
}
