package dao;

import java.util.List;
import metier.entities.Categorie;
public interface ICategorieDao {
public Categorie save(Categorie cat);
public Categorie getCategorie(Long id);
public Categorie updateCategorie(Categorie cat);
public void deleteCategorie(Long id);
public List<Categorie> getAllCategories();
}
