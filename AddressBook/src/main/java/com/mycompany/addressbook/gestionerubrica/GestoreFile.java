package com.mycompany.addressbook.gestionerubrica;

import com.mycompany.addressbook.rubrica.InterfacciaRubrica;
import com.mycompany.addressbook.rubrica.Rubrica;
import java.io.BufferedReader;
import java.io.BufferedWriter;
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
     * @param nomefile Il nome del file da cui leggere i dati.
     * @return Un'istanza di `InterfacciaRubrica` contenente i dati letti.
     *         Se il file non esiste restituisce un errore.
     *
     */

    public static InterfacciaRubrica leggiFile(String nomefile){
         InterfacciaRubrica a = new Rubrica();         
        
        try(Scanner s = new Scanner(new BufferedReader(new FileReader(nomefile)))){
            
            
            if(s.nextLine() == null){ 
                return a;
            }
            
            s.useDelimiter("[;\n]"); 
            s.useLocale(Locale.US);
            
            
            while(s.hasNext()){ 
                
                String nome = s.next();
                String cognome = s.next();
                String num1 = s.next();
		String num2 = s.next();
		String num3 = s.next();
                String mail1 = s.next();
                String mail2 = s.next();
                String mail3 = s.next();
                
                
                Contatto st = new Contatto(nome,cognome,num1,num2,num3,mail1,mail2,mail3);
                a.aggiungiContatto(st);
            }
        }
        
        return a;
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

    public void scriviFile(String nomefile,InterfacciaRubrica rubrica) throws IOException{
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(nomefile)))){
            
            pw.println("NOME;COGNOME;CODICE FISCALE;MATRICOLA;VOTO MEDIO");             
            for(Contatto c : rubrica.getLista()){
                
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
