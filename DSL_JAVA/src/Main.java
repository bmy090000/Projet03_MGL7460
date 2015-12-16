
public class Main {
	
	public static void main(String[] args) {
		
	DepartementBuilder.Departement("informatique")
	      .employe()
	        .nom("Boukhich")
	        .prenom("Yazid")
	        .adresse("Montréal")
	        .grade("Étudiant")
	      .employe()
	        .nom("Yves")
	        .prenom("Lionel")
	        .adresse("Montréal")
	        .grade("Étudiant")
	      .printDepartement();
	
	DepartementBuilder.Departement("sciences")
		.employe()
			.nom("acer")
			.prenom("laptop")
			.adresse("uqam")
			.grade("chef")
		.printDepartement();
	}

}
