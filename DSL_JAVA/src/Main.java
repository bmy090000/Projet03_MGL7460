
public class Main {
	
	public static void main(String[] args) {
		
	DepartementBuilder.Departement("informatique")
	      .employe()
	        .nom("Boukhich")
	        .prenom("Yazid")
	        .adresse("Montr�al")
	        .grade("�tudiant")
	      .employe()
	        .nom("Yves")
	        .prenom("Lionel")
	        .adresse("Montr�al")
	        .grade("�tudiant")
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
