package com.example.demo;

public class Trainee {
	IndexController v=new IndexController();
	private int no1;
	private int no2;
	private int no3;
	private int no4;
	private  String name;
	
	
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo1() {
		return no1;
	}

	public void setNo1(int no1) {
		this.no1 = no1;
	}

	public int getNo2() {
		return no2;
	}

	public void setNo2(int no2) {
		this.no2 = no2;
	}

	public int getNo3() {
		return no3;
	}

	public void setNo3(int no3) {
		this.no3 = no3;
	}

	public int getNo4() {
		return no4;
	}

	public void setNo4(int no4) {
		
		this.no4 = no4;
	}

	public String toString()
	{
		return this.no1+" "+no2+" "+no3+" "+no4;
	}
}
