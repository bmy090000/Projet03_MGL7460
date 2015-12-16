import java.util.ArrayList;


public class Departement {
	
	private String nom;
	private ArrayList<Employe> employe;
	
	
		
		  public Departement(String nom) {
		
		   this.nom=nom;
		   employe = new ArrayList<>();
		
		  }
		
		  public void addEmploye(Employe employe){
				    getEmploye().add(employe);
				  }
 
		  public ArrayList<Employe> getEmploye() {
		
		    return employe;
		
		  }
		
		  public String getNom() {
		
		    return nom;
		
		  }
		  public void setNom(String nom) {
				this.nom = nom;
			}
		
		  public static void print(Departement d){
			  
			  System.out.println("le département "+d.getNom()+ " a les employés suivants: ");
			 for (Employe e : d.getEmploye()) {
				        System.out.println("Nom= "+e.getNom()+" Prénom= "+e.getPrenom()+" Adresse= "+e.getAdresse()+" Grade= "+e.getAdresse());
				      }

		  
		
		  }
}
