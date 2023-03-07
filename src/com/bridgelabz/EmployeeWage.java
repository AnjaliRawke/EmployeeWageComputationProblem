package com.bridgelabz;

public class EmployeeWage {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR= 20;
	public static final int NUM_OF_WORKING_DAYS =2;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static int computeEmpWage() {
		//variables
		int empHrs = 0;
		int TotalempWage = 0;
		int TotalempHrs=0;
		int TotalWorkingDays=0;
		//Computation
		while(TotalempHrs < MAX_HRS_IN_MONTH && TotalWorkingDays < NUM_OF_WORKING_DAYS) {
			TotalWorkingDays++;
			int empCheck =(int) (Math.floor(Math.random()*10)%3);
			switch(empCheck)
			{
				case 1:
					empHrs=8;
					break;
				case 2:
					empHrs=4;
					break;
				default:
					empHrs=0;
					break;
			}
			TotalempHrs=TotalempHrs+empHrs;
		}
		System.out.println("Total Employee Hrs: "+TotalempHrs);
		TotalempWage=TotalempHrs*EMP_RATE_PER_HOUR;
		System.out.println("Total employee Wage: "+TotalempWage);
		return TotalempWage;

	}
	public static void main(String[] args) {
		computeEmpWage();
	}

}
