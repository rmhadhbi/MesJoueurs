package com.rayen.joueurs.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.rayen.joueurs.entities.Poste;

@RepositoryRestResource(path = "cat")
@CrossOrigin("http://localhost:4200/")
public interface PosteRepository extends JpaRepository<Poste, Long> {
}
