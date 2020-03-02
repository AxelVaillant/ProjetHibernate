package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="produits")
public class Produit {
@Id
@GeneratedValue
private int idProduit;
@Column(name="n_produit")
private String nomProduit;
@Transient
private String descProduit;
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public Produit(int idProduit, String nomProduit, String descProduit) {
	super();
	this.idProduit = idProduit;
	this.nomProduit = nomProduit;
	this.descProduit = descProduit;
}
public int getIdProduit() {
	return idProduit;
}
public void setIdProduit(int idProduit) {
	this.idProduit = idProduit;
}
public String getNomProduit() {
	return nomProduit;
}
public void setNomProduit(String nomProduit) {
	this.nomProduit = nomProduit;
}
public String getDescProduit() {
	return descProduit;
}
public void setDescProduit(String descProduit) {
	this.descProduit = descProduit;
}
@Override
public String toString() {
	return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", descProduit=" + descProduit + "]";
}


	
}
