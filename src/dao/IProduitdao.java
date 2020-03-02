package dao;
import java.util.ArrayList;

import model.Produit;
public interface IProduitdao {
public int createproduit( Produit pr);
public int deleteproduit(int id);
public ArrayList<Produit> listeproduit();
}
