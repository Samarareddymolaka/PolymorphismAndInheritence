
In this exercise, we'll create the Human Resources Management System mentioned in the theory section
Create the following class

![ss](https://github.com/Samarareddymolaka/PolymorphismAndInheritence/assets/149567407/e0766328-586d-4cbf-bb19-84eaa719d700)

Implement the methods:

   public int timeToRetirement(){
      // time to retirement = min(60 - age, 40 - yearsWorked)
   }

   public int vacationTimeLeft(){
       // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
   }

   public int calculateBonus(){
       // bonus = 2.2*salary
   }
Now, create a sales rep class that inherits the original employee class
The arrow used means inheritance in class diagrams


   public int calculateComission(){
      // comission = 0.1 * salesMade
   }
Create a Java Class for sales manager:


   public void calculateComission(){
      // 0.03 * all sales made by team
   }
Run the main method and verify that your implementation works.
