package encapulation;

public class Main {
	public static void main (String args[]){
		//Student obj = declare ;
		//new Student = create the new object
		Student obj = new Student();
		obj.setId(1);
		obj.getId();
		obj.setName("Pich");
		obj.getName();
		
		obj.display();
	}
}
