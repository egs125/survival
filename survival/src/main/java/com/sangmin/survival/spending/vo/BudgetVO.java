package com.sangmin.survival.spending.vo;

import java.io.Serializable;
import java.util.List;

public class BudgetVO implements Serializable{

	private String id;
	private int daily_budget;
	private int weekly_budget;
	private int monthly_budget;
	private int yearl_budget;
	private List<SpendingVO> spendingList;
	private int totalAmt;
		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getDailyBudget() {
		return daily_budget;
	}

	public void setDailyBudget(int dailyBudget) {
		this.daily_budget = dailyBudget;
	}

	public int getWeeklyBudget() {
		return weekly_budget;
	}

	public void setWeeklyBudget(int weeklyBudget) {
		this.weekly_budget = weeklyBudget;
	}

	public int getMonthlyBudget() {
		return monthly_budget;
	}

	public void setMonthlyBudget(int monthlyBudget) {
		this.monthly_budget = monthlyBudget;
	}

	public int getYearlyBudget() {
		return yearl_budget;
	}

	public void setYearlyBudget(int yearlyBudget) {
		this.yearl_budget = yearlyBudget;
	}	

	public List<SpendingVO> getSpendingList() {
		return spendingList;
	}

	public void setSpendingList(List<SpendingVO> spendingList) {
		this.spendingList = spendingList;
	}

	public int getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(int totalAmt) {
		this.totalAmt = totalAmt;
	}

	public BudgetVO () {}

	public BudgetVO(String id, int dailyBudget, int weeklyBudget, int monthlyBudget, int yearlyBudget,
			List<SpendingVO> spendingList, int totalAmt) {
		super();
		this.id = id;
		this.daily_budget = dailyBudget;
		this.weekly_budget = weeklyBudget;
		this.monthly_budget = monthlyBudget;
		this.yearl_budget = yearlyBudget;
		this.spendingList = spendingList;
		this.totalAmt = totalAmt;
	}

	@Override
	public String toString() {
		return "ID : " + getId() + "\ndaily : " + getDailyBudget() + "\nweekly : " + getWeeklyBudget() + "\nmonthly : "
				+ getMonthlyBudget() + "\nyealry : " + getYearlyBudget();
	}
	
}
