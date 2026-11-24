package com.rayen.joueurs.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cin;
    private String nomJoueur;
    private String prenomJoueur;
    private String equipeInstant;
    private Date dateMercato;
    
    @ManyToOne
    private Poste poste;

    public Joueur() {
        super();
    }

    public Joueur(Long cin, String nomJoueur, String prenomJoueur, String equipeInstant, Date dateMercato, Poste poste) {
        super();
        this.cin = cin;
        this.nomJoueur = nomJoueur;
        this.prenomJoueur = prenomJoueur;
        this.equipeInstant = equipeInstant;
        this.dateMercato = dateMercato;
        this.poste = poste;
    }

    public Long getCin() {
        return cin;
    }

    public void setCin(Long cin) {
        this.cin = cin;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public String getPrenomJoueur() {
        return prenomJoueur;
    }

    public void setPrenomJoueur(String prenomJoueur) {
        this.prenomJoueur = prenomJoueur;
    }

    public String getEquipeInstant() {
        return equipeInstant;
    }

    public void setEquipeInstant(String equipeInstant) {
        this.equipeInstant = equipeInstant;
    }

    public Date getDateMercato() {
        return dateMercato;
    }

    public void setDateMercato(Date dateMercato) {
        this.dateMercato = dateMercato;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    @Override
    public String toString() {
        return "Joueur [cin=" + cin + ", nomJoueur=" + nomJoueur + ", prenomJoueur=" + prenomJoueur
                + ", equipeInstant=" + equipeInstant + ", dateMercato=" + dateMercato + "]";
    }
}
