package practice.polymorphism_inheritance;

public class Employee {

	String firstName;
	String lastName;
	int registration;
	int age;
	int daysWorked;
	int vacationDaysTaken;
	double salary;
	int yearsWorked;
	
	   public int timeToRetirement(){
		      return Math.min(60 - age, 40 - yearsWorked);
		   }

		   public int vacationTimeLeft(){
		      return (daysWorked/360)*(30 - vacationDaysTaken);
		   }

		   public double calculateBonus(){
		       return 2.2* salary;
		   }
}
