/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addressbook;

public class Contatto{
    private String nome;
    private String cognome;
    private String[] tel;
    private String[] mail;
    
    public Contatto(String nome,String cognome,String tel1,String tel2,String tel3,String mail1,String mail2,String mail3){
        
    }

    
    /*      -----      */
    public String getNome() {

        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String[] getTel() {
        return tel;
    }
    public String[] getMail() {
        return mail;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setTel(String te1,String tel2,String tel3) {
        this.tel = new String[]{te1,tel2,tel3};
    }
    public void setMail(String mail1,String mail2,String mail3) {
        this.mail = new String[]{mail1,mail2,mail3};
    }
    
}
