package com.rayen.joueurs.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.rayen.joueurs.entities.Joueur;
import com.rayen.joueurs.service.JoueurService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class JoueurRESTController {

    @Autowired
    JoueurService joueurService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Joueur> getAllJoueurs() {
        return joueurService.getAllJoueurs();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Joueur getJoueurById(@PathVariable("id") Long id) {
        return joueurService.getJoueur(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Joueur createJoueur(@RequestBody Joueur joueur) {
        return joueurService.saveJoueur(joueur);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Joueur updateJoueur(@RequestBody Joueur joueur) {
        return joueurService.updateJoueur(joueur);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteJoueur(@PathVariable("id") Long id) {
        joueurService.deleteJoueurById(id);
    }

    @RequestMapping(value = "/joueursposte/{idPoste}", method = RequestMethod.GET)
    public List<Joueur> getJoueursByPosteId(@PathVariable("idPoste") Long idPoste) {
        return joueurService.findByPosteIdPoste(idPoste);
    }
}
