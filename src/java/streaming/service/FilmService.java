/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streamin.dao.FilmDAO;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmService {
    
    public void ajouterFilm(Film f) {
        new FilmDAO().ajouterFilm(f);
    }

    public Film rechercheParId(long id) {
        return new FilmDAO().rechercheParId(id);
    }
    
    public List<Film> lister (){
        
        FilmDAO dao = new FilmDAO();
        return dao.listerFilms();
    }
    
    public void modifierFilm(Film f) {
        new FilmDAO().modifierFilm(f);
    }

    public void supprimerFilm(long id) {
        new FilmDAO().supprimerFilm(id);
    }
    
}
