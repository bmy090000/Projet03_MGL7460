package source;


public class Main {
	
	public static void main(String[] args) {
		
	DepartementBuilder dinfo = new DepartementBuilder("informatique");
	
	 dinfo.employe()
	        .nom("Boukhich")
	        .prenom("Yazid")
	        .adresse("Montr�al")
	        .grade("�tudiant")
	      .employe()
	        .nom("Yves")
	        .prenom("Lionel")
	        .adresse("Montr�al")
	        .grade("�tudiant");
	    
	
	DepartementBuilder dchimie = new DepartementBuilder("chimie");
	
	dchimie.employe()
				.nom("Raouf")
				.prenom("Yazid")
				.adresse("Montr�al")
				.grade("�tudiant");
	
	
	System.out.println(dinfo.getDepartement().toString());
	
		
	}

}
