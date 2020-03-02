package dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Produit;

public class Produitdao implements IProduitdao {

	@Override
	public int createproduit(Produit pr) {
		try {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session= factory.openSession();
			session.beginTransaction();
			session.save(pr);
			session.getTransaction().commit();
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int deleteproduit(int id) {
		Produit pr=new Produit();
		pr.setIdProduit(id);
		try {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session= factory.openSession();
			session.beginTransaction();

			session.delete(pr);
			session.getTransaction().commit();

			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			return 0;
		}


	}

	@Override
	public ArrayList<Produit> listeproduit() {
		try {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session= factory.openSession();
			session.beginTransaction();

			session.getTransaction().commit();
			return liste;
		} catch (HibernateException e) {
			e.printStackTrace();
			return 0;
		}
		return null;
	}

}
