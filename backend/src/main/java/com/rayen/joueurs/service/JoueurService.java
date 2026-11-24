package com.rayen.joueurs.service;

import java.util.List;
import com.rayen.joueurs.entities.Joueur;
import com.rayen.joueurs.entities.Poste;

public interface JoueurService {
    Joueur saveJoueur(Joueur j);
    Joueur updateJoueur(Joueur j);
    void deleteJoueur(Joueur j);
    void deleteJoueurById(Long id);
    Joueur getJoueur(Long id);
    List<Joueur> getAllJoueurs();
    List<Joueur> findByNomJoueur(String nom);
    List<Joueur> findByNomJoueurContains(String nom);
    List<Joueur> findByNomEquipe(String nom, String equipe);
    List<Joueur> findByPoste(Poste poste);
    List<Joueur> findByPosteIdPoste(Long id);
    List<Joueur> findByOrderByNomJoueurAsc();
    List<Joueur> trierJoueursNomsEquipes();
}
