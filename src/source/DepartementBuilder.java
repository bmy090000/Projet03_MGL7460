package source;

public class DepartementBuilder {
	
  private Departement departement;
  
  public DepartementBuilder(String s) {
	  
   departement = new Departement(s);
   
  }
  
  public EmployeBuilder employe(){
	  
    EmployeBuilder ebuilder = new EmployeBuilder(this);
    getDepartement().ajouterEmploye(ebuilder.employe);
    return ebuilder;
    
  }
  
  public void setDepartement(Departement departement) {
	this.departement = departement;
}

public Departement getDepartement() {
	  
    return departement;
    
  }


}
