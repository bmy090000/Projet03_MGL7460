
public class Employe {

	private String nom;
	private String prenom;
	private String adresse;
	private String grade;
	
	
	public Employe(){
		
	}
	
	public Employe(String nom,String prenom,String adresse,String grade){
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		this.grade=grade;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	

}
