import dao.IProduitdao;
import dao.Produitdao;
import model.Produit;

public class MainClass {

	public static void main(String[] args) {

		Produit pr= new Produit(55, "Aspirateur", "Dyson");
		IProduitdao dao= new Produitdao();
		dao.createproduit(pr);
		dao.deleteproduit(3);

	}

}
