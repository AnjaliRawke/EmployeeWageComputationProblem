package com.bridgelabz;

import java.util.ArrayList;

public class CompanyEmpWage {
	// instance constants
	final String COMPANY_NAME;
	final int WAGE_PER_HR;
	final int MAX_WORKING_DAYS;
	final int MAX_WORKING_HRS;
	private ArrayList<Integer> dailyWages;
	// instance variable
	int totalEmpWage;
	int dailyWage;

	CompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
	{
		this.COMPANY_NAME = companyName;
		this.WAGE_PER_HR = wagePerHr;
		this.MAX_WORKING_DAYS = maxWorkingDays;
		this.MAX_WORKING_HRS = maxWorkingHrs;
		totalEmpWage = 0;
		dailyWage = 0;
	}

	void setTotalEmployeeWage(int totalEmpWage)
	{
		this.totalEmpWage = totalEmpWage;
	}

	void setDailyWage(int dailyWage){
		this.dailyWage = dailyWage;
	}

	@Override
	public String toString()
	{
		System.out.println("Details of " + COMPANY_NAME + " employee");
		System.out.println("-----------------------------------------------------");
		System.out.println("Wage per hour:" + WAGE_PER_HR);
		System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
		System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
		System.out.println("Daily Wage : " + dailyWage);
		return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalEmpWage + "\n";
	}
}