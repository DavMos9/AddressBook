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
 * @brief Classe per la gestione del file di salvataggio della rubrica.
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
     * @pre il file, da cui leggere, esiste.
     * 
     * @param nomefile Il nome del file da cui leggere i dati.
     * @return Un'istanza di `InterfacciaRubrica` contenente i dati letti.
     *         Se il file non esiste restituisce un errore.
     *
     */

    public static InterfacciaRubrica leggiFile(String nomefile){
         InterfacciaRubrica rubrica = new Rubrica();         
        
        try(Scanner s = new Scanner(new BufferedReader(new FileReader(nomefile)))){
            
            
            if(s.nextLine() == null){ 
                return rubrica;
            }
            
            s.useDelimiter("[;\n]"); 
            s.useLocale(Locale.US);
            
            
            while(s.hasNext()){ 
                
                String nome = s.next();
                String cognome = s.next();
                String tel1 = s.next();
		String tel2 = s.next();
		String tel3 = s.next();
                String mail1 = s.next();
                String mail2 = s.next();
                String mail3 = s.next();
                
                
                Contatto contatto = new Contatto(nome,cognome,tel1,tel2,tel3,mail1,mail2,mail3);
                rubrica.aggiungiContatto(contatto);
            }
        }catch(FileNotFoundException ex){
            assert false; 
            return rubrica;
        }
        
        return rubrica;
    }

    /**
     *
     * @brief Scrive i dati della rubrica in un file.
     *
     * Questo metodo salva i dati della rubrica corrente nel file specificato.
     * Se il file non esiste, viene creato.
     *
     * @pre la rubrica esiste
     * @param nomefile Il nome del file in cui scrivere i dati.
     */

    public void scriviFile(String nomefile,InterfacciaRubrica rubrica) throws IOException{
        assert rubrica!=null;
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(nomefile)))){
            
            pw.println("NOME;COGNOME;TEL1;TEL2;TEL3;MAIL1;MAIL2;MAIL3");             
            for(Contatto c : rubrica.getCollezione()){
                
                pw.append(c.getNome());
                pw.append(';');
                
		pw.append(c.getCognome());
                pw.append(';');
		
		String[] temp;
		temp = c.getTel();
		
                pw.append(temp[0]);
                pw.append(';');
                pw.append(temp[1]);
                pw.append(';');
		pw.append(temp[2]);
                pw.append(';');

		temp = c.getMail();
                
		pw.append(temp[0]);
                pw.append(';');
                pw.append(temp[1]);
                pw.append(';');
		pw.append(temp[2]);
                pw.append('\n');
                
            }
            
        }
    }
}
