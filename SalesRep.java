package practice.polymorphism_inheritance;

public class SalesRep extends Employee {

	double salesMade;
	public double getSalesMade() {
		// TODO Auto-generated method stub
		return salesMade;
	}
	
	public void setSalesMade(double salesMade) {
		// TODO Auto-generated method stub
		this.salesMade = salesMade;
	}
	public double calculateComission(){
	      return 0.1 * salesMade;
	   }
	
	
}
