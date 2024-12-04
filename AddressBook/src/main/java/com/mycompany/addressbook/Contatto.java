package com.mycompany.addressbook;

public class Contatto{
    private String nome;
    private String cognome;
    private String[] tel;
    private String[] mail;
    
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
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public void setTel(String tel1,String tel2,String tel3){
        this.tel[0] = tel1;
        this.tel[1]=tel2;
        this.tel[2]=tel3;
    }
    
    public void setMail(String mail1,String mail2,String mail3){
        mail[0]=mail1;
        mail[1]=mail2;
        mail[2]=mail3;
    }
    
}
