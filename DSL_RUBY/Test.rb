require 'minitest/autorun'
require './Version_ruby.rb'

class Test < Minitest::Test

  def setup
    @dchi = Departement.new("chimie")
	
	@dmec = Departement.new("mecanique") do
											employe do
										  
											nom 	"Y"
											prenom 	"L"
											adresse "Montréal"
											grade 	"Étudiant"
											
										  end
  end
  
  end

  def test_nom_de_departement_est_egale_a_chimie
    assert_equal "chimie", @dchi.nom
  end
  
  def test_employes_initialement_vide
    assert_equal [], @dchi.employes
  end
  
  def test_employe_retourne_Etudiant_BBB_est_un_etudiant_Au_Departement_chimie
  
		  @dchi.employe do
		  
			nom 	"BBB"
			prenom 	"M"
			adresse "Montréal"
			grade 	"Étudiant"
			
		  end
  
    assert_equal " BBB M Montréal Étudiant ", @dchi.employes[0].to_s
  end
  
  def test_employe_retourne_Etudiant_Y_N_est_Pas_un_etudiant_Au_Departement_chimie
  
		  @dchi.employe do
		  
			nom 	"BBB"
			prenom 	"M"
			adresse "Montréal"
			grade 	"Étudiant"
			
		  end
 
    refute_equal " Y L Montréal Étudiant ", @dchi.employes[0].to_s
	
	
  end
  
   def test_employe_retourne_Etudiant_Y_est_un_etudiant_Au_Departement_Mecanique
  
    assert_equal " Y L Montréal Étudiant ", @dmec.employes[0].to_s
	
  end
  
  def test_employes_retourne_Taille_Egale_1_Lorsque_on_Ajoute_Un_Seul_Employe
  
    assert_equal 1, @dmec.employes.size
	
  end
  
  def test_employe_invalide_si_nom_n_est_pas_definie
  
		 @dchi.employe do
		    
			prenom 	"M"
			adresse "Montréal"
			grade 	"Étudiant"
			
		  end

    refute_equal true,@dchi.valid?
	
  end
  
  def test_retourne_le_bon_nom_employe_du_departement_mecanique
  
    assert_equal "Y",@dmec.employes[0].nom
	
  end
  
  def test_retourne_le_bon_prenom_employe_du_departement_mecanique
  
    assert_equal "L",@dmec.employes[0].prenom
	
  end
 
  def test_retourne_la_bonne_adresse_employe_du_departement_mecanique
  
    assert_equal "Montréal",@dmec.employes[0].adresse
	
  end
  
  def test_retourne_le_bon_grade_employe_du_departement_mecanique
  
    assert_equal "Étudiant",@dmec.employes[0].grade
	
  end
  
end