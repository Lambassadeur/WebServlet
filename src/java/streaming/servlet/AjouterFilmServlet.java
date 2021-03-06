/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjouterFilmServlet", urlPatterns = {"/ajouter_film"})
public class AjouterFilmServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("ajouter_film.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Film f = new Film();

        f.setTitre( req.getParameter("titre") );
        f.setSynopsis( req.getParameter("synopsis") );
        f.setAnnee( Integer.valueOf(req.getParameter("annee")) );
        f.setDuree( Integer.valueOf(req.getParameter("duree")) );
        
        // Ajout en base
        new FilmService().ajouterFilm(f);
        
        // Forward vers liste : mais ne change pas l'URL
        // req.getRequestDispatcher("lister_films").forward(req, resp);
        
        //Redirect
        resp.sendRedirect("lister_films");
        
    }
    
    
}
