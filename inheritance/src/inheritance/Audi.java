package inheritance;
//sup class 
public class Audi extends Car{
	int led;
	Engine engine;//Audi has engine
	@Override
	public String toString(){
		return"Audi: "+"["+ " led =" + led + " Engine= " + engine +" id=" + id +" Brand =" + brand +" Color=" + color+"]";
	}
}
