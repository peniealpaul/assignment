package com.example.demo;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
String sr;
public int co;

	public int[] a = new int[4];
	@RequestMapping("home")
	public ModelAndView index1() // Model
	
	{co=0;
		mav.setViewName("in1.jsp");
	return mav;
}
		ModelAndView mav = new ModelAndView();
	@RequestMapping("homem")
	public ModelAndView index(Trainee trai) // Model
	{
		ModelAndView mav = new ModelAndView();
		int[] a = { -1, -1, -1, -1 };
		Random rand = new Random();
		// TO CREAT UNREAPETED RANDOM NUMBER
		boolean ky = true;
		
		while (ky) {
			for (int i = 0; i < a.length; i++) {
				a[i] = rand.nextInt(10);
			}
			int count1 = 0;
			for (int k = 0; k < a.length; k++) {
				for (int z = 0; z < a.length; z++) {
					if (a[k] == a[z]) {
						count1++;
					}
				}
			}
			if (count1 == 4) {
				ky = false;
			}
		}
		this.a[0] = a[0];
		this.a[1] = a[1];
		this.a[2] = a[2];
		this.a[3] = a[3];
		this.sr=trai.getName();
		mav.addObject("inf4", this.sr);
		mav.addObject("inf0", this.a[0]);
		mav.addObject("inf1", this.a[1]);
		mav.addObject("inf2", this.a[2]);
		mav.addObject("inf3", this.a[3]);
		mav.setViewName("index.jsp");
		return mav;
	}

	@RequestMapping("check")
	public ModelAndView add(Trainee trai) // Model
	{
		ModelAndView mav = new ModelAndView();
		int[] a = new int[4];
		int[] b = new int[4];
		String[] st = new String[4];
		String[] sk = new String[4];
		a[0] = this.a[0];
		a[1] = this.a[1];
		a[2] = this.a[2];
		a[3] = this.a[3];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
    co++;
		b[0] = trai.getNo1();
		b[1] = trai.getNo2();
		b[2] = trai.getNo3();
		b[3] = trai.getNo4();
String sr=this.sr;
System.out.println(sr);
		int v = 0;
		boolean s = true;

		for (int c = 0; c < b.length; c++) {
			s = true;
			if (a[c] == b[c]) {
				st[c] = "GREEN";
				sk[c] = 
					  "CORRECT";
				System.out.println(b[c] + "  CORRECT ");
				System.out.println();
				v++;
				s = false;
			} else if (a[c] != b[c]) {
				int count = 0;
				for (int z = 0; z < a.length; z++) {
					if (a[z] == b[c]) {
						count++;
					}
				}
				if (count == 1) {
					System.out.println(b[c] + "  WRONG POSITION");
					System.out.println();
					st[c] = "yellow";
					sk[c] = "POSITION "
						  + "  WRONG  ";
					s = false;
				}
			}
			if (s) {
				System.out.println(b[c] + "  WRONG NUMBER");
				System.out.println();
				st[c] = "red";
				sk[c] = "TOTALLY"
					  + " WRONG";
			}
		}
		if (v == 4) {
			mav.addObject("count", co);
			mav.addObject("inf0", st[0]);
			mav.addObject("inf1", st[1]);
			mav.addObject("inf2", st[2]);
			mav.addObject("inf3", st[3]);
			mav.addObject("in0", sk[0]);
			mav.addObject("in1", sk[1]);
			mav.addObject("in2", sk[2]);
			mav.addObject("in3", sk[3]);
			mav.addObject("A", a[0]);
			mav.addObject("B", a[1]);
			mav.addObject("C", a[2]);
			mav.addObject("D", a[3]);
			mav.addObject("inf4", sr);
			mav.setViewName("game4.jsp");
		} else if (v == 3) {
			mav.addObject("A", b[0]);
			mav.addObject("B", b[1]);
			mav.addObject("C", b[2]);
			mav.addObject("D", b[3]);
			mav.addObject("in0", sk[0]);
			mav.addObject("in1", sk[1]);
			mav.addObject("in2", sk[2]);
			mav.addObject("in3", sk[3]);
			mav.addObject("inf0", st[0]);
			mav.addObject("inf1", st[1]);
			mav.addObject("inf2", st[2]);
			mav.addObject("inf3", st[3]);
			mav.addObject("inf4", sr);
			mav.setViewName("game2.jsp");

		} else {
			mav.addObject("A", b[0]);
			mav.addObject("B", b[1]);
			mav.addObject("C", b[2]);
			mav.addObject("D", b[3]);
			mav.addObject("in0", sk[0]);
			mav.addObject("in1", sk[1]);
			mav.addObject("in2", sk[2]);
			mav.addObject("in3", sk[3]);
			mav.addObject("inf0", st[0]);
			mav.addObject("inf1", st[1]);
			mav.addObject("inf2", st[2]);
			mav.addObject("inf3", st[3]);
			mav.addObject("inf4", sr);
			mav.setViewName("game3.jsp");

		}

		return mav;
	}

@RequestMapping("homee")
public ModelAndView exit() // Model

{
	mav.setViewName("EXIT.jsp");
return mav;
}}
