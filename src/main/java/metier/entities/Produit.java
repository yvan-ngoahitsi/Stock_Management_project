package metier.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUITS")
public class Produit implements Serializable{
	
	@Id
	@Column (name="ID_PRODUIT")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
		private Long idProduit;
	
	@Column (name="NOM_PRODUIT")
		private String nomProduit;
		private double prix;
		
		
		private Categorie categorie;
		public Produit(String nomProduit, double prix, Categorie cat) {
		super();
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.setCategorie(cat);
		}

		public Categorie getCategorie() {
		return categorie;
		}
		public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
		}
		
	public Produit() {
		super();
	}
	
	public Produit(String nomProduit, double prix) {
		super();
		this.nomProduit = nomProduit;
		this.prix = prix;
	}
	
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	
	public String getNomProduit() {
		return nomProduit;
	}
	
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prix=" + prix + "]";
	}
	
}
