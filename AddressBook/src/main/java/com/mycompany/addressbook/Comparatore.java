/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook;

import java.util.Comparator;


/**
 * @class Comparatore
 *
 * @brief Classe di riferimento per l'ordinamento della rubrica telefonica.
 *
 * La classe Comparatore permette di confrontare due contatti in modo tale che si
 * possano ordinare in base al cognome e nome.
 *
 *  @author Domenico
 */
public class Comparatore implements Comparator<Contatto>{ //rispetto il principio di buona progettazione

    /**
     * @brief Connfronto dei contatti
     *
     * Questo Metodo riceve in input due parametri che corrispondono ai dati di due contatti
     * i contatti in ingresso sono di tipo Contatto e sono idenfificati come c1 e c2
     * e restituisce un valore numerico (0 oppure 1) rispettivamente se il primo contatto risulta
     * essere minore o maggiore del secondo contatto
     *
     *
     * @param c1 rappresenta il primo contatto da confrontare
     * @param c2 rappresenta il secondo contatto da confrontare
     * @return restituisce il valore che indica l'ordine dei contatti inseriti
     */

    @Override
    public int compare(Contatto c1, Contatto c2) {

        return 0;
    }

    
}
