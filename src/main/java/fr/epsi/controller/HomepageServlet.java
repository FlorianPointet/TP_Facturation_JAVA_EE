package fr.epsi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
	J'ai décidé de créer une page par fonction (client, article, facture, lignefacture, formulaires...).
	Petit problème, je n'ai pas réussi à connecter mon projet à ma base de données MySQL. Je n'ai pas réussi à corriger l'erreur "Failed to connect". 
	J'ai vérifié plusieurs fois mes identifiants, ainsi que l'url de ma base de données. Sans succès. 
	J'ai donc toutes les pages avec les connexions entre-elles mais sans la base de données...

*/
public class HomepageServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/homepage.jsp").forward(req, resp);
	}

}
