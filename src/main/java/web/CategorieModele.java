package web;
import java.util.ArrayList;
import java.util.List;
import metier.entities.Categorie;

public class CategorieModele {
List<Categorie> categories = new ArrayList<>();
public List<Categorie> getCategories() {
return categories;
}
public void setCategories(List<Categorie> categories) {
this.categories = categories;
}
}
