package com.sangmin.survival.spending.vo;

import java.io.Serializable;

public class SpendingVO implements Serializable{
	
	private String category;	//분류
	private String operator;	//마이너스, 플러스 여부
	private String amount;		//액수
	private String date;		//발생일자
	private String memo;		//비고
}
