package day02;

import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String name;
	System.out.println("이름이 뭡니까?");
	name = input.next();
	System.out.println("국어점수는?");
	double k;
	k = input.nextDouble();
	System.out.println("영어점수는?");
	double e;
	e = input.nextDouble();
	System.out.println("수학점수는?");
	double m;
	m = input.nextDouble();
	

	double total;
	total = k+e+m;
	double t;
	t = total/3;
	System.out.println(name);
	System.out.println(k);
	System.out.println(e);
	System.out.println(m);
	System.out.println("합계는?"+total);
	System.out.println("평균은?"+t);
			
}
}
