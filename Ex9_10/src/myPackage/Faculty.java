package myPackage;

public class Faculty extends Employee {
	private String facultymem;

	public String getFacultymem() {
		return facultymem;
	}

	public void setFacultymem(String newFacultymem) {
		facultymem = newFacultymem;
	}
	Faculty(){
		super();
		facultymem="";
	}
	Faculty(String name,int id,String department,String newFaculty){
		super(name,id,department);
		facultymem=newFaculty;
	}
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Faculty member:  "+facultymem);
	}
}
