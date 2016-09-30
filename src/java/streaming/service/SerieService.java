/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streamin.dao.SerieDAO;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieService {
    public void ajouterSerie(Serie s) {
        new SerieDAO().ajouterSerie(s);
    }

    public Serie rechercheParId(long id) {
        return new SerieDAO().rechercheParId(id);
    }
    
    public List<Serie> lister (){
        
        SerieDAO dao = new SerieDAO();
        return dao.listerSeries();
    }
    
    public void modifierSerie(Serie s) {
        new SerieDAO().modifierSerie(s);
    }

    public void supprimerSerie(long id) {
        new SerieDAO().supprimerSerie(id);
    }

}
