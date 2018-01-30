package com.sangmin.survival.spending.vo;

import java.io.Serializable;
import java.util.List;

public class BudgetVO implements Serializable{

	private String id;
	private String dailyBudget;
	private String weeklyBudget;
	private String monthlyBudget;
	private String yearlyBudget;
	private List<SpendingVO> spendingList;
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDailyBudget() {
		return dailyBudget;
	}

	public void setDailyBudget(String dailyBudget) {
		this.dailyBudget = dailyBudget;
	}

	public String getWeeklyBudget() {
		return weeklyBudget;
	}

	public void setWeeklyBudget(String weeklyBudget) {
		this.weeklyBudget = weeklyBudget;
	}

	public String getMonthlyBudget() {
		return monthlyBudget;
	}

	public void setMonthlyBudget(String monthlyBudget) {
		this.monthlyBudget = monthlyBudget;
	}

	public String getYearlyBudget() {
		return yearlyBudget;
	}

	public void setYearlyBudget(String yearlyBudget) {
		this.yearlyBudget = yearlyBudget;
	}	

	public List<SpendingVO> getSpendingList() {
		return spendingList;
	}

	public void setSpendingList(List<SpendingVO> spendingList) {
		this.spendingList = spendingList;
	}

	public BudgetVO () {}
	
	public BudgetVO(String id, String dailyBudget, String weeklyBudget, String monthlyBudget, String yearlyBudget,
			List<SpendingVO> spendingList) {
		super();
		this.id = id;
		this.dailyBudget = dailyBudget;
		this.weeklyBudget = weeklyBudget;
		this.monthlyBudget = monthlyBudget;
		this.yearlyBudget = yearlyBudget;
		this.spendingList = spendingList;
	}

	@Override
	public String toString() {
		return "ID : " + getId() + "\ndaily : " + getDailyBudget() + "\nweekly : " + getWeeklyBudget() + "\nmonthly : "
				+ getMonthlyBudget() + "\nyealry : " + getYearlyBudget();
	}
	
}
