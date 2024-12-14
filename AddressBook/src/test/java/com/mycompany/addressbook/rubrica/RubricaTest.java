package com.mycompany.addressbook.rubrica;

import com.mycompany.addressbook.gestionerubrica.Contatto;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RubricaTest {
    private Rubrica rubrica;
    private Contatto c;
    public RubricaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        rubrica = new Rubrica();
        c = new Contatto("a","b","","","","","","");
    }
    
    @AfterEach
    public void tearDown() {
    }

    /*
     * Test of getCollezione method, of class Rubrica.
     */
    @Test
    public void testCostruttore(){
        System.out.println("Test Costruttore");
        
        assertNotNull(rubrica.getCollezione());
    }
    
    @Test
    public void testGetCollezione() {
        System.out.println("Test getCollezione");
        List<Contatto> lista = null;
        lista = rubrica.getCollezione();
        
        assertNotNull(lista);
    }

    /*
     * Test of aggiungiContatto method, of class Rubrica.
     */
    @Test
    public void testAggiungiContatto() {
        System.out.println("Test aggiungiContatto");
        rubrica.aggiungiContatto(c);
        
        //qui basta la contains perchè tu controlli il riferimento del contatto
        assertTrue(rubrica.getCollezione().contains(c));
    }

    /*
     * Test of modificaContatto method, of class Rubrica.
     */
    @Test
    public void testModificaContatto() {
        System.out.println("Test modificaContatto");
        Contatto c2 = new Contatto("b","a","1","2","3","4","5","6");
        
        rubrica.aggiungiContatto(c);
        
        
        rubrica.modificaContatto(c, c2);
        //qui non basta la contains perchè il riferimento è sempre quello di c però il contenuto cambia
        assertEquals(1,rubrica.getCollezione().size());
        
        for(Contatto temp : rubrica.getCollezione()){
            verificaContatto(c2,temp);
        }
    }
    
    private void verificaContatto(Contatto atteso, Contatto reale) {
        assertEquals(atteso.getNome(), reale.getNome());
        assertEquals(atteso.getCognome(), reale.getCognome());
        assertArrayEquals(atteso.getTel(), reale.getTel());
        assertArrayEquals(atteso.getMail(), reale.getMail());
    }
    /*
     * Test of eliminaContatto method, of class Rubrica.
     */
    @Test
    public void testEliminaContatto() {
        System.out.println("Test eliminaContatto");
        rubrica.aggiungiContatto(c);
       
        rubrica.eliminaContatto(c);
        
        assertTrue(rubrica.getCollezione().isEmpty());
    }

    /*
     * Test of ordina method, of class Rubrica.
     */
    @Test
    public void testOrdina(){
        System.out.println("Test ordina");
        Contatto c2 = new Contatto("a","a","","","","","","");
        rubrica.aggiungiContatto(c);
        rubrica.aggiungiContatto(c2);
        rubrica.ordina();
        
        assertEquals(2,rubrica.getCollezione().size());
        
        int i=0;
        for(Contatto temp : rubrica.getCollezione()){
            if(i == 0){
                verificaContatto(c2,temp);
            }
            if(i == 1){
                verificaContatto(c,temp);
            }
            i++;
        }
    }
    
    @Test
    public void testRicerca(){
        System.out.println("Test Ricerca per Stringa Completa");
        
        rubrica.aggiungiContatto(c);
        
        String temp = "a";
        
        List<Contatto> lista = rubrica.ricerca(temp);
        
        assertNotNull(lista);
        
        assertTrue(!lista.isEmpty());
        assertEquals(1,lista.size());
        for(Contatto x : lista){
            verificaContatto(c,x);
        }
    }
    
    @Test
    public void testRicercaParziale(){System.out.println("Test Ricerca per stringa parziale");
        Contatto c2 = new Contatto("","ciao","","","","","","");
        rubrica.aggiungiContatto(c2);
        
        String temp = "ci";
        
        List<Contatto> lista = rubrica.ricerca(temp);
        
        assertNotNull(lista);
        
        assertTrue(!lista.isEmpty());
        assertEquals(1,lista.size());
        for(Contatto x : lista){
            verificaContatto(c2,x);
        }
    }
    
    
}