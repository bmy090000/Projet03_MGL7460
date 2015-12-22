require 'minitest/autorun'
class Employe
  
  def initialize(&block)
     if block_given?
	 instance_eval &block
	 end
  end

  def nom(nom = nil)
    return @nom unless nom 
    @nom = nom
  end
  
  def prenom(prenom = nil)
    return @prenom unless prenom 
    @prenom = prenom
  end
  
  def adresse(adresse = nil)
    return @adresse unless adresse 
    @adresse = adresse
  end
  
  def grade(grade = nil)
    return @grade unless grade 
	@grade = grade
  end
  
   def to_s
		
		" #{@nom} #{@prenom} #{@adresse} #{@grade} "
		
end
  
end

class Departement
  attr_accessor :nom, :employes

  def initialize(nom,&block)
	@nom=nom
    @employes = []
    if block_given?
	instance_eval &block
	end
  end

  def employe(&block)
    @employes << Employe.new(&block)
  end
  
  def to_s
		puts @nom
		
		@employes.each do |emp|
		puts emp	
		end
		
end

#la présentation de notre DSL.  
#exemple d'un département composé de deux employes 

dinfo = Departement.new("Informatique") do
  employe do
  
    nom 	"Boukhich"
    prenom 	"Mohamed_Yazid"
	adresse "Montréal"
    grade 	"Étudiant"
	
  end

  employe do
  
    nom 	"Yves"
    prenom 	"Lionel"
	adresse "Montréal"
    grade 	"Étudiant"
	
  end
 
  end
  
 puts dinfo
end


