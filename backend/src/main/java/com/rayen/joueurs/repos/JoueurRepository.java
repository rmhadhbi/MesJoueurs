package com.rayen.joueurs.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.rayen.joueurs.entities.Joueur;
import com.rayen.joueurs.entities.Poste;

@RepositoryRestResource(path = "rest")
@CrossOrigin("http://localhost:4200/")
public interface JoueurRepository extends JpaRepository<Joueur, Long> {
    List<Joueur> findByNomJoueur(String nom);
    List<Joueur> findByNomJoueurContains(String nom);
    @Query("select j from Joueur j where j.nomJoueur like %:nom and j.equipeInstant like %:equipe")
    List<Joueur> findByNomEquipe(@Param("nom") String nom, @Param("equipe") String equipe);
    @Query("select j from Joueur j where j.poste = ?1")
    List<Joueur> findByPoste(Poste poste);
    List<Joueur> findByPosteIdPoste(Long id);
    List<Joueur> findByOrderByNomJoueurAsc();
    @Query("select j from Joueur j order by j.nomJoueur ASC, j.equipeInstant DESC")
    List<Joueur> trierJoueursNomsEquipes();
}
