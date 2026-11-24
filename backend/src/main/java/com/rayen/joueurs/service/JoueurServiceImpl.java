package com.rayen.joueurs.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rayen.joueurs.entities.Joueur;
import com.rayen.joueurs.entities.Poste;
import com.rayen.joueurs.repos.JoueurRepository;

@Service
public class JoueurServiceImpl implements JoueurService {
    @Autowired
    JoueurRepository joueurRepository;

    @Override
    public Joueur saveJoueur(Joueur j) {
        return joueurRepository.save(j);
    }
    @Override
    public Joueur updateJoueur(Joueur j) {
        return joueurRepository.save(j);
    }
    @Override
    public void deleteJoueur(Joueur j) {
        joueurRepository.delete(j);
    }
    @Override
    public void deleteJoueurById(Long id) {
        joueurRepository.deleteById(id);
    }
    @Override
    public Joueur getJoueur(Long id) {
        return joueurRepository.findById(id).get();
    }
    @Override
    public List<Joueur> getAllJoueurs() {
        return joueurRepository.findAll();
    }
    @Override
    public List<Joueur> findByNomJoueur(String nom) {
        return joueurRepository.findByNomJoueur(nom);
    }
    @Override
    public List<Joueur> findByNomJoueurContains(String nom) {
        return joueurRepository.findByNomJoueurContains(nom);
    }
    @Override
    public List<Joueur> findByNomEquipe(String nom, String equipe) {
        return joueurRepository.findByNomEquipe(nom, equipe);
    }
    @Override
    public List<Joueur> findByPoste(Poste poste) {
        return joueurRepository.findByPoste(poste);
    }
    @Override
    public List<Joueur> findByPosteIdPoste(Long id) {
        return joueurRepository.findByPosteIdPoste(id);
    }
    @Override
    public List<Joueur> findByOrderByNomJoueurAsc() {
        return joueurRepository.findByOrderByNomJoueurAsc();
    }
    @Override
    public List<Joueur> trierJoueursNomsEquipes() {
        return joueurRepository.trierJoueursNomsEquipes();
    }
}
