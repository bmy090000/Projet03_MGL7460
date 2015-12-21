package source;


public class Main {
	
	public static void main(String[] args) {
		
	DepartementBuilder dinfo = new DepartementBuilder("informatique");
	
	 dinfo.employe()
	        .nom("Boukhich")
	        .prenom("Yazid")
	        .adresse("Montréal")
	        .grade("Étudiant")
	      .employe()
	        .nom("Yves")
	        .prenom("Lionel")
	        .adresse("Montréal")
	        .grade("Étudiant");
	    
	
	DepartementBuilder dscience = new DepartementBuilder("sciences");
	
	dscience.employe()
				.nom("acer")
				.prenom("laptop")
				.adresse("uqam")
				.grade("chef");
	
	
	System.out.println(dinfo.getDepartement().toString());
	//dscience.affichageDepartement();
		
	}

}
