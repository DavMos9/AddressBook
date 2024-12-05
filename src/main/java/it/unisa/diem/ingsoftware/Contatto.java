/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.ingsoftware;

/**
 * @file Contatto.java
 * @brief Questo file crea un contatto
 * 
 * La classe contatto include nome,cognome,telefono e email.
 * Inoltre permette di inserire da 0 a 3 numeri di telefono e da 0 a 3 inidirizzi email
 * 
 * 
 * @author ronca
 * @date Dicembre 05, 2024
 */
public class Contatto {
    
    /**
     * @brief Stringa usata per indicare il nome del contatto
     */
    private String nome;
    
     /**
     * @brief Stringa usata per indicare il cognome del contatto
     */
    private String cognome;
    
     /**
     * @brief Array di stringhe usata per indicare i numeri di telefono del contatto
     */
    private String[] tel1;
    
     /**
     * @brief Array di stringhe usata per indicare gli indirizzi email del contatto
     */
    private String[] email1;

    
    /**
     * 
     * @brief Costruttore di default della classe contatto
     * 
     * @param[in] nome Il nome del contatto
     * @param[in] cognome Il cognome del contatto
     * @param[in] tel1 Il primo numero di telefono del contatto
     * @param[in] tel2 Il secondo numero di telefono del contatto
     * @param[in] tel3 Il terzo numero di telefono del contatto
     * @param[in] email1 Il primo indirizzo email del contatto
     * @param[in] email2 Il secondo indirizzo email del contatto
     * @param[in] email3 Il terzo indirizzo email del contatto
     * 
     * 
     */
    public Contatto(String nome, String cognome, String tel1,String tel2,String tel3, String email1,String email2,String email3) {
        this.nome = nome;
        this.cognome = cognome;
        this.tel1= new String[] {tel1,tel2,tel3};
        this.email1= new String[] {email1,email2,email3};
    }

    
    
    
    ///METODI GETTER
    
    /**
     * 
     * @brief Restituisce il nome del contatto
     * 
     * Questo metodo consente di ottenre il nome attuale
     * 
     * 
     * @return Una stringa rappresentate il nome del contatto
     */
     
    public String getNome() {
        return nome;
    }

     /**
     * 
     * @brief Restituisce il cognome del contatto
     * 
     * Questo metodo consente di ottenre il cognome attuale
     * 
     * 
     * @return Una stringa rappresentate il cognome del contatto
     */
    
    public String getCognome() {
        return cognome;
    }

    /**
     * 
     * @brief Restituisce i numeri di telefono del contatto
     * 
     * Questo metodo permette di ottere i numeri di telefono
     * 
     * @return Un array di stringhe rappresentate i numeri di telefono
     * 
     * 
     */
    public String[] getTel1() {
        return tel1;
    }
    
     /**
     * 
     * @brief Restituisce gli indirizzi email del contatto
     * 
     * Questo metodo permette di ottere gli indirizzi email
     * 
     * @return Un array di stringhe rappresentate gli indirizi email
     * 
     * 
     */

    public String[] getEmail1() {
        return email1;
    }
    
    
    
    ///METODI SETTER
    
    /**
     * 
     * 
     * @brief settiamo il nome del contatto
     * 
     * Questo metodo permette di settare il nome del contatto
     * 
     * @param[in] nome Una stringa che rappresenta il nome del contatto
     * 
     * 
     */

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * 
     * 
     * @brief settiamo il cognome del contatto
     * 
     * Questo metodo permette di settare il cognome del contatto
     * 
     * @param[in] cognome Una stringa che rappresenta il cognome del contatto 
     * 
     * 
     * */
    
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    /**
     * 
     * 
     * @brief settiamo i numeri di telefono del contatto
     * 
     * Questo metodo permette di settare i numeri di telefono del contatto
     * 
     * @param[in] tel1 Questa stringa che rappresenta il primo numero di telefono del contatto
     * @param[in] tel2 Questa stringa che rappresenta il secondo numero di telefono del contatto
     * @param [in] tel3 Questa stringa che rappresenta il terzo numero di telefono
     * 
     * 
     */

    public void setTel1(String tel1,String tel2,String tel3) {
       this.tel1= new String[]{tel1,tel2,tel3};
    }

    
    /**
     * 
     * @brief settiamo gli indirizzi email del contatto
     * 
     * Questo metodo permette di settare gli indirizzi email del contatto
     * 
     * @param[in] email1 Questa stringa rappresenta il primo indirizzo email del contatto 
     * @param[in] email2 Questa stringa rappresenta il secondo indirizzo email del contatto
     * @param[in] email3 Questa stringa rappresenta il terzo indirizzo email del contatto
     */
    public void setEmail1(String email1,String email2,String email3) {
        this.email1= new String[]{email1,email2,email3};
    }

   
    
    
}
