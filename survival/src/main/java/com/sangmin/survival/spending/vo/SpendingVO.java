package com.sangmin.survival.spending.vo;

import java.io.Serializable;

public class SpendingVO implements Serializable{
	
	private String id;
	private String category;	//분류
	private String operator;	//마이너스, 플러스 여부
	private int amount;		//액수
	private String date;		//발생일자
	private String memo;		//비고
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public SpendingVO() {}
	
	public SpendingVO(String id, String category, String operator, int amount, String date, String memo) {
		super();
		this.id = id;
		this.category = category;
		this.operator = operator;
		this.amount = amount;
		this.date = date;
		this.memo = memo;
	}
	
}
