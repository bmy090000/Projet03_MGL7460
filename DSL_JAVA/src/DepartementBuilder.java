public class DepartementBuilder {
	
  private Departement departement;
  
  public DepartementBuilder(String s) {
	  
   departement = new Departement(s);
   
  }
  
  public static DepartementBuilder Departement(String s){
	  
    return new DepartementBuilder(s);
    
  }
  public EmployeBuilder employe(){
	  
    EmployeBuilder builder = new EmployeBuilder(this);
    getDepartement().addEmploye(builder.employe);
    return builder;
    
  }
  public Departement getDepartement() {
	  
    return departement;
    
  }
  public void printDepartement(){
    Departement.print(departement);
  }

}
