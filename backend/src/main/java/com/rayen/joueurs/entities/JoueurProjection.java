package com.rayen.joueurs.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomJ", types = { Joueur.class })
public interface JoueurProjection {
    public String getNomJoueur();
}
