package com.bridgelabz;

public class EmployeeWage {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME=2;
		int EMP_RATE_PER_HOUR = 20;
		//variables
		int empHrs = 0;
		int empWage = 0;
		//Computation
		int empCheck =(int) (Math.floor(Math.random()*10)%3);
		switch(empCheck)
		{
			case 1:
				empHrs=8;
				break;
			case 2:
				empHrs=4;
				break;
			case 3:
				empHrs=0;
				break;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("emp wage: "+empWage);
	}

}