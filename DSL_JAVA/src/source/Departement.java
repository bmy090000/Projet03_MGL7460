package source;
import java.util.ArrayList;


public class Departement {
	
	private String nom;
	private ArrayList<Employe> employe;
	
	
		
		  public Departement(String nom) {
		
		   this.nom=nom;
		   employe = new ArrayList<>();
		
		  }
 
		  public ArrayList<Employe> getEmploye() {
		
		    return employe;
		
		  }
		  
		  public void setEmploye(ArrayList<Employe> employe) {
			this.employe = employe;
		}

		  public String getNom() {
		
		    return nom;
		
		  }
		  public void setNom(String nom) {
				this.nom = nom;
			}
		  
		  public void ajouterEmploye(Employe employe){
			    getEmploye().add(employe);
			  }
	
		  public String toString() {
			        String concat = "";
			        for (int i = 0; i < employe.size(); i++) {
			            concat += employe.get(i).getNom()+" "+employe.get(i).getPrenom() +" "+ employe.get(i).getAdresse() +" "+ employe.get(i).getGrade()+'\n';
			        }
			        return concat;
			     }

		  public int effectif(){
			  return employe.size();
		  }
		
		  }

