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
	public void test_liste_employes_initialement_vide() {
		
		assertEquals ( 0 ,dinfo.getDepartement().getEmploye().size());
		
	}
	
	
	
	@Test
	public void test_ajouterEmploye_YVES_Au_Departement_Informatique() {
		dinfo.employe()
						  .nom("YVES")
						  .prenom("LIONEL")
						  .adresse("MONTR�AL")
						  .grade("�TUDIANT");
		
		String s=dinfo.getDepartement().toString();
		
		assertEquals ("YVES LIONEL MONTR�AL �TUDIANT\n",s);
		
	}
	
	@Test
	public void test_Effectif_Departement_Informatique_retourne_1_Apres_Avoir_Ajouter_Un_Seul_Employe() {
		
		dinfo.employe()
						  .nom("BOUKHICH")
						  .prenom("MOHAMED_YAZID")
						  .adresse("MONTR�AL")
						  .grade("�TUDIANT");

		assertEquals (1,dinfo.getDepartement().effectif());
		

	}
	
	@Test
	public void test_employe_invalide_si_nom_n_est_pas_definie() {
		dinfo.employe()
			  .prenom("LIONEL")
			  .adresse("MONTR�AL")
			  .grade("�TUDIANT");
		
		assertNull (dinfo.getDepartement().getEmploye().get(0).getNom());
		
	}
	
	@Test
	public void test_nom_Retourne_BOUKHICH_Et_null_Pour_Les_Autres_Attributs() {
		
		dinfo.employe()
					   .nom("BOUKHICH");
						
						  		String s=dinfo.getDepartement().toString();
		assertEquals ("BOUKHICH "+null+" "+null+" "+null+"\n",s);
		
	}
	
	@Test
	public void test_prenom_Retourne_MOHAMED_YAZID_Et_null_Pour_Les_Autres_Attributs() {
		
		dinfo.employe()
					  .prenom("MOHAMED_YAZID");
						
						  		String s=dinfo.getDepartement().toString();
		assertEquals (null+" MOHAMED_YAZID "+null+" "+null+"\n",s);
		
	}
	@Test
	public void test_adresse_Retourne_MONTR�AL_Et_null_Pour_Les_Autres_Attributs() {
		
		dinfo.employe()
					   .adresse("MONTR�AL");
						
						  		String s=dinfo.getDepartement().toString();
		assertEquals (null+" "+null+" MONTR�AL "+null+"\n",s);
		
	}
	@Test
	public void test_grade_Retourne_�TUDIANT_Et_null_Pour_Les_Autres_Attributs() {
		
		dinfo.employe()
					  .grade("�TUDIANT");
						
						  		String s=dinfo.getDepartement().toString();
		assertEquals (null+" "+null+" "+null+" �TUDIANT"+"\n",s);
		
	}

}
