package com.rayen.joueurs.entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Poste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPoste;
    private String nomPoste;

    @JsonIgnore
    @OneToMany(mappedBy = "poste")
    private List<Joueur> joueurs;

    public Poste() {
        super();
    }

    public Poste(Long idPoste, String nomPoste, List<Joueur> joueurs) {
        super();
        this.idPoste = idPoste;
        this.nomPoste = nomPoste;
        this.joueurs = joueurs;
    }

    public Long getIdPoste() {
        return idPoste;
    }

    public void setIdPoste(Long idPoste) {
        this.idPoste = idPoste;
    }

    public String getNomPoste() {
        return nomPoste;
    }

    public void setNomPoste(String nomPoste) {
        this.nomPoste = nomPoste;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    @Override
    public String toString() {
        return "Poste [idPoste=" + idPoste + ", nomPoste=" + nomPoste + "]";
    }
}
