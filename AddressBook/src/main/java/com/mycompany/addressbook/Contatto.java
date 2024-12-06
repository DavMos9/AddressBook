package com.mycompany.addressbook;

/**
 * @file Contatto.java
 * @brief Questo file crea un contatto
 * 
 * La classe contatto include nome,cognome,telefono e mail.
 * Inoltre permette di inserire da 0 a 3 numeri di telefono e da 0 a 3 inidirizzi mail
 * 
 * 
 * @author ronca
 * 
 */

public class Contatto{
    
    
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
    private String[] tel;
    
    /**
     * @brief Array di stringhe usata per indicare gli indirizzi mail del contatto
     */
    private String[] mail;
    
    
    
    
    /**
     * 
     * @brief Costruttore di default della classe contatto
     * 
     * @param[in] nome Il nome del contatto
     * @param[in] cognome Il cognome del contatto
     * @param[in] tel1 Il primo numero di telefono del contatto
     * @param[in] tel2 Il secondo numero di telefono del contatto
     * @param[in] tel3 Il terzo numero di telefono del contatto
     * @param[in] mail1 Il primo indirizzo mail del contatto
     * @param[in] mail2 Il secondo indirizzo mail del contatto
     * @param[in] mail3 Il terzo indirizzo mail del contatto
     * 
     * 
     */
    
    public Contatto(String nome,String cognome,String tel1,String tel2,String tel3,String mail1,String mail2,String mail3){
        this.nome=nome;
        this.cognome=cognome;
        this.tel=new String[3];
        this.mail=new String[3];
        this.tel[0]=tel1;
        this.tel[1]=tel2;
        this.tel[2]=tel3;
        this.mail[0]=mail1;
        this.mail[1]=mail2;
        this.mail[2]=mail3;
    }

    
        ///METODI GETTER
    
    /**
     * 
     * @brief Restituisce il nome del contatto
     * 
     * Questo metodo consente di ottenere il nome attuale
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
     * Questo metodo consente di ottenere il cognome attuale
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
    public String[] getTel() {
        return tel;
    }
    
   /**
     * 
     * @brief Restituisce gli indirizzi mail del contatto
     * 
     * Questo metodo permette di ottere gli indirizzi mail
     * 
     * @return Un array di stringhe rappresentate gli indirizi mail
     * 
     * 
     */ 
    public String[] getMail() {
        return mail;
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
    
    public void setCognome(String cognome){
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
    public void setTel(String tel1,String tel2,String tel3){
        this.tel[0] = tel1;
        this.tel[1]=tel2;
        this.tel[2]=tel3;
    }
    
    /**
     * 
     * @brief settiamo gli indirizzi mail del contatto
     * 
     * Questo metodo permette di settare gli indirizzi mail del contatto
     * 
     * @param[in] mail1 Questa stringa rappresenta il primo indirizzo mail del contatto 
     * @param[in] mail2 Questa stringa rappresenta il secondo indirizzo mail del contatto
     * @param[in] mail3 Questa stringa rappresenta il terzo indirizzo mail del contatto
     */
    
    public void setMail(String mail1,String mail2,String mail3){
        mail[0]=mail1;
        mail[1]=mail2;
        mail[2]=mail3;
    }
    
}
