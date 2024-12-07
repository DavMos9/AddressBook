/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook.gestionerubrica;

import com.mycompany.addressbook.rubrica.InterfacciaRubrica;

/**
 * @class GestoreFile
 * @brief Classe per la gestione del file di salvataggio della rubrica.
 *
 * Questa classe fornisce metodi per leggere i dati da un file e scriverli
 * in un file,gestendo così il caricamento e il salvataggio della rubrica.
 *
 * @author Moscariello
 *
 */
public class GestoreFile {

    /**
     * @brief Legge i dati della rubrica da un file.
     *
     * Questo metodo apre il file specificato, legge i dati e li converte
     * in un'istanza di `InterfacciaRubrica`.
     *
     * @param nomefile Il nome del file da cui leggere i dati.
     * @return Un'istanza di `InterfacciaRubrica` contenente i dati letti.
     *         Se il file non esiste restituisce un errore.
     *
     */

    public static InterfacciaRubrica leggiFile(String nomefile){
        return null;
    }

    /**
     *
     * @brief Scrive i dati della rubrica in un file.
     *
     * Questo metodo salva i dati della rubrica corrente nel file specificato.
     * Se il file non esiste, viene creato.
     *
     * @param nomefile Il nome del file in cui scrivere i dati.
     */

    public void scriviFile(String nomefile){
        
    }
}
