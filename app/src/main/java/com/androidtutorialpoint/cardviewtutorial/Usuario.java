package com.androidtutorialpoint.cardviewtutorial;

/**
 * Created by renat on 21/05/2016.
 */
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private long id;

    public Usuario(){

    }
    public Usuario(int id, String nome, String email,String senha){
        super();
        this.id =id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return nome +" "+ email +" "+ senha +" ";
    }

}
