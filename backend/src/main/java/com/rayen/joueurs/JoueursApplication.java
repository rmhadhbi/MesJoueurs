package com.rayen.joueurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import com.rayen.joueurs.entities.Joueur;
import com.rayen.joueurs.entities.Poste;

@SpringBootApplication
public class JoueursApplication implements CommandLineRunner {

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        System.setProperty("server.port", "8082");
        SpringApplication.run(JoueursApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Joueur.class, Poste.class);
    }
}
