package practice.polymorphism_inheritance;

import java.util.HashMap;



public class SalesManager extends Employee {

    HashMap<Integer, SalesRep> salesTeam = new HashMap<>();

    public double calculateCommission() {
        double teamSales = calculateTotalTeamSales();
        return 0.03 * teamSales;
    }

    private double calculateTotalTeamSales() {
        double totalSales = 0.0;
        for (SalesRep salesRep : salesTeam.values()) {
            totalSales += salesRep.getSalesMade();
        }
        return totalSales;
    }


	   public static void main(String[] args) {
		   SalesRep salesRep = new SalesRep();
	        salesRep.setSalesMade(5000); // Example: Set sales made by a SalesRep

	        SalesManager manager = new SalesManager();
	        manager.salesTeam.put(1, salesRep); // Example: Add SalesRep to SalesManager's team

	        double commission = manager.calculateCommission();
	        System.out.println("Manager's commission: " + commission);
	    }

	}
