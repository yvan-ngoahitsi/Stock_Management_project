package dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import metier.entities.Categorie;
import util.JPAutil;
public class CategorieDaoImpl implements ICategorieDao {
	 // TP6_JEE à replacer par votre persistence unit, consultez votre
	//fichier persistence.xml <persistence-unit name="TP6_JEE">
	private EntityManager entityManager=JPAutil.getEntityManager("TP5_JEE");
	@Override
	public Categorie save(Categorie cat ) {
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	entityManager.persist(cat);
	tx.commit();
	return cat;
	}
	
	@Override
	public Categorie getCategorie(Long id) {
	return entityManager.find(Categorie.class, id);
	
	}@Override
	public Categorie updateCategorie(Categorie cat) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.merge(cat);
		tx.commit();
		return cat;
		}
		@Override
		public void deleteCategorie(Long id) {
		Categorie categorie = entityManager.find(Categorie.class, id);
		entityManager.getTransaction().begin();
		entityManager.remove(categorie);
		entityManager.getTransaction().commit();
		}
		@Override
		public List<Categorie> getAllCategories() {
		List<Categorie> cats = entityManager.createQuery("select c from Categorie c").getResultList();
		return cats;
		}
}
