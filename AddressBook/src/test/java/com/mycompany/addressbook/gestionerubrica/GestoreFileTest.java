package com.mycompany.addressbook.gestionerubrica;

import com.mycompany.addressbook.rubrica.InterfacciaRubrica;
import com.mycompany.addressbook.rubrica.Rubrica;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class GestoreFileTest {
    private GestoreFile gestoreFile;
    private InterfacciaRubrica rubrica;
    private Contatto c1;
    private Contatto c2;
    public GestoreFileTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        gestoreFile = new GestoreFile();
        c1 = new Contatto("nome1", "cognome1", "000", "111", "222", "a1@a", "b1@b", "c1@c");
        c2 = new Contatto("nome2", "cognome2", "001", "112", "223", "a2@a", "b2@b", "c2@c");

    }
    
    @AfterEach
    public void tearDown() {
    }

    /*
     * Test of leggiFile method, of class GestoreFile.
     */
    @Test
    public void testLeggiFile() {
        System.out.println("Test leggiFile");

        // Esegui il metodo da testare
        rubrica =(Rubrica) GestoreFile.leggiFile("testGestoreFile.csv");
        
        
        // Controlla che siano stati letti 2 contatti
        assertEquals(2, rubrica.getCollezione().size());

        // Contatti attesi

        // Verifica i contatti nella rubrica
        int i = 0;
        for (Contatto c : rubrica.getCollezione()) {
            if (i == 0) {
                verificaContatto(c1, c);
            } else if (i == 1) {
                verificaContatto(c2, c);
            }
            i++;
        }
        assertEquals(2, i); // Verifica che siano stati iterati solo 2 contatti
    }

    private void verificaContatto(Contatto atteso, Contatto reale) {
        assertEquals(atteso.getNome(), reale.getNome());
        assertEquals(atteso.getCognome(), reale.getCognome());
        assertArrayEquals(atteso.getTel(), reale.getTel());
        assertArrayEquals(atteso.getMail(), reale.getMail());
    }


    /**
     * Test of scriviFile method, of class GestoreFile.
     */
    @Test
    public void testScriviFile() throws Exception {
        System.out.println("Test scriviFile");
        
        //contatti da voler scrivere
        
        //aggiungo i contatti alla rubrica
        rubrica = new Rubrica();
        rubrica.aggiungiContatto(c1);
        rubrica.aggiungiContatto(c2);
        
        //scrivo sul file
        gestoreFile.scriviFile("testGestoreFile.csv", rubrica);
        
        //leggo sul file per controllare che siano stati scritti correttamente
        InterfacciaRubrica rubrica2 = (Rubrica) gestoreFile.leggiFile("testGestoreFile.csv");
        
        
        //verifico il numero di contatti scritti
        assertEquals(rubrica.getCollezione().size(),rubrica2.getCollezione().size());
        
        int i = 0;
        
        //verifico i contatti
        for (Contatto c : rubrica2.getCollezione()) {
            if (i == 0) {
                verificaContatto(c1, c);
            } else if (i == 1) {
                verificaContatto(c2, c);
            }
            i++;
        }
        
        //verifico il numero di iterazioni
        assertEquals(2, i);
    }
    
}