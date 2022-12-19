package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

public class GaCl {
	
	Trainee trai=new Trainee();
	int[] c = new int[4];
	int[] a = {1,2,3,4};  
	
	boolean s = true;
	public int[] calc() {
	c[0]=trai.getNo1();
	c[1]=trai.getNo2();
	c[2]=trai.getNo3();
	c[3]=trai.getNo4();
	int v = 0;
	
	int g = 0;
	//LOOP FOR REPET UNTILL FINISH
	for (g = 0; g<4; g++) {
		if(a[g]==c[g]) {
			v++;
		}}
		
		if (v == 4) {
			
		}  else {
			
			
		}
		return c;}}
	