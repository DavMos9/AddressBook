package com.mycompany.addressbook.gestionerubrica;

import java.util.Comparator;


/**
 * @class Comparatore
 *
 * @brief Classe di riferimento per l'ordinamento della rubrica telefonica.
 *
 * La classe Comparatore permette di confrontare due contatti in modo tale che si
 * possano ordinare in base al cognome e nome.
 *
 *  @author Sessa Domenico
 */
public class Comparatore implements Comparator<Contatto>{ 

    /**
     * @brief Confronto dei contatti
     *
     * Questo Metodo riceve in input due parametri che corrispondono a due oggetti Contatto,
     * sulla base dei quali viene valutato il loro ordinamento tramite i campi cognome e nome.
     *
     * @param c1 rappresenta il primo contatto da confrontare.
     * @param c2 rappresenta il secondo contatto da confrontare.
     * @return restituisce un valore numerico che definisce l'ordine dei contatti inseriti.
     */
    @Override
    public int compare(Contatto c1, Contatto c2) {

        return 0;
    }

    
}
