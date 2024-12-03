/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.mycompany.addressbook;

import java.util.List;

/**
 *
 * @author david
 */
public interface InterfacciaRubrica {
    void aggiungiContatto(Contatto c);
    void modificaContatto(Contatto c);
    void eliminaContatto(Contatto c);
    Contatto ricercaContatto(Contatto c);
    List<Contatto> getLista();

}
