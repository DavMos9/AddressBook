/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
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
public class ComparatoreTest {
    private Contatto c1;
    private Contatto c2;
    private Comparatore comparatore;
    public ComparatoreTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        comparatore = new Comparatore();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of compare method, of class Comparatore.
     */
    @Test
    public void testCompare1() {
        System.out.println("Test compare primo contatto minore del secondo");
        c1 = new Contatto("a","a","","","","","","");
        c2 = new Contatto("a","b","","","","","","");
        assertTrue(comparatore.compare(c1,c2)<0);
    }
    
    @Test
    public void testCompare2() {
        System.out.println("Test compare contatti con nome e cognome uguali");
        c2 = new Contatto("a","a","","","","","","");
        c1 = new Contatto("a","a","","","","","","");
        assertTrue(comparatore.compare(c1,c2)==0);
    }
    
    @Test
    public void testCompare3() {
        System.out.println("Test compare primo contatto maggiore del secondo");
        c2 = new Contatto("a","a","","","","","","");
        c1 = new Contatto("a","b","","","","","","");
        assertTrue(comparatore.compare(c1,c2)>0);
    }
}
