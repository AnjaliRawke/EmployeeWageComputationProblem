package com.bridgelabz;

public class EmployeeWage {
	public static void calculateTotalWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {

		final int IS_PART_TIME=1;
		final int IS_FULL_TIME=2;
		int TotalempWage = 0;
		int TotalWorkingDays=0;
		int TotalempHrs=0;
		int empHrs;
		System.out.println("Details of " + companyName + " employee");
		System.out.println("-----------------------------------------------------");
		System.out.println("Wage per hour:" + wagePerHr);
		System.out.println("Maximum working days:" + maxWorkingDays);
		System.out.println("Maximum working hours:" + maxWorkingHrs);
		//Computation
		while(TotalempHrs < maxWorkingHrs && TotalWorkingDays < maxWorkingDays) {
			TotalWorkingDays++;
			int empCheck =(int) (Math.floor(Math.random()*10)%3);
			switch(empCheck)
			{
				case IS_PART_TIME:
					empHrs=8;
					break;
				case IS_FULL_TIME:
					empHrs=4;
					break;
				default:
					empHrs=0;
					break;
			}
			TotalempHrs=TotalempHrs+empHrs;
		}
		System.out.println("Total Employee Hrs: "+TotalempHrs);
		TotalempWage=TotalempHrs*wagePerHr;
		System.out.println("Total employee Wage: "+TotalempWage);
		System.out.println();

	}
	public static void main(String[] args) {
		calculateTotalWage("Amazon", 40, 15, 200);
		calculateTotalWage("BigBazar", 20, 20, 100);
		calculateTotalWage("Infosys", 30, 15, 200);
		calculateTotalWage("Tata", 20, 20, 100);
	}

}



