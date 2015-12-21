package source;

public class EmployeBuilder {

  Employe employe;
  DepartementBuilder dBuilder;
  
  public EmployeBuilder(DepartementBuilder dBuilder) {
    this.dBuilder = dBuilder;
    employe = new Employe();
  }
 
  public EmployeBuilder nom(String nom){
    
    employe.setNom(nom);
    return this;
  }
  
  public EmployeBuilder prenom(String prenom){
	    
	    employe.setPrenom(prenom);
	    return this;
	  }
  
  public EmployeBuilder adresse(String adresse){
	    
	    employe.setAdresse(adresse);
	    return this;
	  }
  public DepartementBuilder grade(String grade){
	    
	    employe.setGrade(grade);
	    return dBuilder;
	  }
  
}
