package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import source.DepartementBuilder;

public class DepartementBuilderTest {
	
	DepartementBuilder dinfo ;
	
	@Before
	public void instancier()  {
	 dinfo = new DepartementBuilder("informatique");
	}
	
	
	@Test
	public void test_Nom_Departement_Est_informatique() {
		
		assertEquals ("informatique",dinfo.getDepartement().getNom());
		
	}
	
	@Test
	public void test_ajouterEmploye_YVES_Au_Departement_Informatique() {
		dinfo.employe()
						  .nom("YVES")
						  .prenom("LIONEL")
						  .adresse("MONTRÉAL")
						  .grade("ÉTUDIANT");
		
		String s=dinfo.getDepartement().toString();
		
		assertEquals ("YVES LIONEL MONTRÉAL ÉTUDIANT\n",s);
		
	}
	
	@Test
	public void test_Effectif_Departement_Informatique_retourne_1_Apres_Avoir_Ajouter_Un_Seul_Employe() {
		
		dinfo.employe()
						  .nom("BOUKHICH")
						  .prenom("MOHAMED_YAZID")
						  .adresse("MONTRÉAL")
						  .grade("ÉTUDIANT");

		assertEquals (1,dinfo.getDepartement().effectif());
		

	}
	
	@Test
	public void test_nom_Retourne_YVES_Et_null_Pour_Les_Autres_Attributs() {
		
		dinfo.employe()
						  .nom("YVES");
						
						  		String s=dinfo.getDepartement().toString();
		assertEquals ("YVES "+null+" "+null+" "+null+"\n",s);
		
	}

}
