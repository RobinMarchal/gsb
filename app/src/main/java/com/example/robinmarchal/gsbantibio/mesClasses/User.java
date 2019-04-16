package com.example.robinmarchal.gsbantibio.mesClasses;

public class User {
    private int idUser;
    private String nomUser;
    private String login;
    private String mdp;
    private String photoUser;

    public User(int idUser, String nomUser, String login, String mdp, String photoUser) {
        this.idUser = idUser;
        this.nomUser = nomUser;
        this.login = login;
        this.mdp = mdp;
        this.photoUser = photoUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    public String getPhotoUser() {
        return photoUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setPhotoUser(String photoUser) {
        this.photoUser = photoUser;
    }
}
