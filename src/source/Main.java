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
