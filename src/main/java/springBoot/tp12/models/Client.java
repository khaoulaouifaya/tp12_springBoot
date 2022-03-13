package springBoot.tp12.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity                    
public class Client {
	 @Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	 @SequenceGenerator(name = "SEQ", sequenceName = "client_seq",allocationSize = 1)

	private long  id;
	private String  nom;
	private String prenom;
	
	public Client() { }
	
	public Client(String nom,String prenom) { 
		this.nom=nom;
		this.setPrenom(prenom);
		
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
