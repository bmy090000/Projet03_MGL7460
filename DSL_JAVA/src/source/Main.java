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
	    
	
	DepartementBuilder dchimie = new DepartementBuilder("chimie");
	
	dchimie.employe()
				.nom("Raouf")
				.prenom("Yazid")
				.adresse("Montréal")
				.grade("Étudiant");
	
	
	System.out.println(dinfo.getDepartement().toString());
	
		
	}

}
