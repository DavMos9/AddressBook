package com.mycompany.addressbook.gestionerubrica;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author david
 */
public class ContattoTest {
    private Contatto c;
    public ContattoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        c = new Contatto("a","b","c","d","e","f","s","w");
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void testContatto(){ //non riesco a fare il test del costruttore dove passo un contatto senza nome e cognome
        System.out.println("Test Costruttore Contatto");
        
        assertNotNull(c);
    }
    
    /**
     * Test of getNome method, of class Contatto.
     */
    @Test
    public void testGetNome() {
        System.out.println("Test getNome");
        assertEquals("a",c.getNome());
        
    }

    /**
     * Test of getCognome method, of class Contatto.
     */
    @Test
    public void testGetCognome() {
        System.out.println("Test getCognome");
        assertEquals("b",c.getCognome());
    }

    /**
     * Test of getTel method, of class Contatto.
     */
    @Test
    public void testGetTel() {
        System.out.println("Test getTel");
        assertArrayEquals(new String[]{"c","d","e"},c.getTel());
    }

    /**
     * Test of getMail method, of class Contatto.
     */
    @Test
    public void testGetMail() {
        System.out.println("getMail");
        assertArrayEquals(new String[]{"f","s","w"},c.getMail());
    }

    /**
     * Test of setNome method, of class Contatto.
     */
    @Test
    public void testSetNome() {
        System.out.println("Test setNome");
        c.setNome("test");
        assertEquals("test",c.getNome());
    }

    /**
     * Test of setCognome method, of class Contatto.
     */
    @Test
    public void testSetCognome() {
        System.out.println("Test setCognome");
        c.setCognome("test");
        assertEquals("test",c.getCognome());
    }

    /**
     * Test of setTel method, of class Contatto.
     */
    @Test
    public void testSetTel() {
        System.out.println("Test setTel");
        c.setTel("1","2","3");
        assertArrayEquals(new String[]{"1","2","3"},c.getTel());
    }

    /**
     * Test of setMail method, of class Contatto.
     */
    @Test
    public void testSetMail() {
        System.out.println("Test setMail");
        c.setMail("1","2","3");
        assertArrayEquals(new String[]{"1","2","3"},c.getMail());
    }
    
}
