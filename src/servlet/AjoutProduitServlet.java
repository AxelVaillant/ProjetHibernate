package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IProduitdao;
import dao.Produitdao;
import model.Produit;

/**
 * Servlet implementation class AjoutProduitServlet
 */
@WebServlet("/add")
public class AjoutProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/formulaire.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produit pr=new Produit();
		pr.setNomProduit(request.getParameter("name"));
		pr.setDescProduit(request.getParameter("description"));
		IProduitdao dao= new Produitdao();
		int i=dao.createproduit(pr);
		if (i==1) {
			request.setAttribute("message","Product successfully created");
		}
		else request.setAttribute("message","Product creation failed");
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/produit.jsp").forward(request, response);
	}

}
