package com.mycompany.addressbook.gestionerubrica;

import com.mycompany.addressbook.rubrica.InterfacciaRubrica;
import com.mycompany.addressbook.rubrica.Rubrica;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 * @class GestoreFile
 * @brief Classe per la gestione dell' Input/Output della rubrica.
 *
 * Questa classe fornisce metodi per leggere e scrivere su un file, gestendo così il caricamento e il salvataggio della rubrica.
 * 
 * @author Moscariello Davide
 *
 */
public class GestoreFile {

    /**
     * @brief Legge i dati della rubrica da un file.
     *
     * Questo metodo accede al file specificato, legge i dati e li converte
     * in un'istanza di `InterfacciaRubrica`.
     *
     * @pre il file, da cui leggere, esiste ed è nel formato corretto.
     * 
     * @param[in] nomefile Il path del file da cui leggere i dati.
     * @return Un'istanza di `InterfacciaRubrica` contenente i dati letti.
     *         Se il file non esiste restituisce un errore.
     *
     */
    public static InterfacciaRubrica leggiFile(String nomefile) {
        InterfacciaRubrica rubrica = new Rubrica();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(nomefile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] dati = line.split(";");
                
                    // Crea un array di numeri di telefono e email
                    String[] numeriTelefono = new String[3];
                    String[] email = new String[3];
                    
                    // Assegna i numeri di telefono, separati dalla virgola
                    String[] telefoni = dati[2].split(",");
                    numeriTelefono[0] = telefoni.length > 0 ? telefoni[0] : "";
                    numeriTelefono[1] = telefoni.length > 1 ? telefoni[1] : "";
                    numeriTelefono[2] = telefoni.length > 2 ? telefoni[2] : "";
                    
                    // Assegna le email, separati dalla virgola
                    String[] emails = dati[3].split(",");
                    email[0] = emails.length > 0 ? emails[0] : "";
                    email[1] = emails.length > 1 ? emails[1] : "";
                    email[2] = emails.length > 2 ? emails[2] : "";
                    
                    // Crea un nuovo contatto e aggiungilo alla rubrica
                    Contatto contatto = new Contatto(dati[0], dati[1], numeriTelefono[0],numeriTelefono[1],numeriTelefono[2], email[0],email[1],email[2]);
                    rubrica.aggiungiContatto(contatto); // Aggiungi il contatto alla rubrica                
                }
            }catch(FileNotFoundException ex){
                assert false;
                return rubrica;
            }catch(IOException ex){
                return rubrica;
            }
        
        return rubrica;
    }

    /**
     * @brief Scrive i dati della rubrica in un file.
     *
     * Questo metodo salva i dati della rubrica nel file specificato.
     * Se il file non esiste, viene creato.
     *
     * @pre la rubrica esiste.
     * @param[in] nomefile Il path del file in cui scrivere i dati.
     * @param[in] rubrica il contenuto da scrivere nel file.
     */

    public void scriviFile(String nomefile,InterfacciaRubrica rubrica) throws IOException {
        
        assert(rubrica.getCollezione()!=null);
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(nomefile)))){


            for(Contatto c : rubrica.getCollezione() ){
                
                
                pw.print(c.getNome());
                
                pw.append(";");

                pw.print(c.getCognome());
                pw.append(";");

                pw.print(c.getTel()[0]);
                pw.append(",");

                pw.print(c.getTel()[1]);
                pw.append(",");

                pw.print(c.getTel()[2]);
                pw.append(";");

                pw.print(c.getMail()[0]);
                pw.append(",");

                pw.print(c.getMail()[1]);
                pw.append(",");

                pw.print(c.getMail()[2]);
                pw.append("\n");
            }


        }
        
    }
    
}