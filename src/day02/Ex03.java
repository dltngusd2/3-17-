package day02;

import java.util.Scanner;
//import 는 내가 쓰고싶은 기능을 끌어와 사용한다
public class Ex03 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		String name;
		System.out.println("이름 머에요?");
name = input.next();		
		System.out.println("당신의 이름은"+name+"이군요");
	//	입력받는 기능
	
 int age=0;
	System.out.print("나이 입력 :" +age+"살");
age = input.nextInt();	
	System.out.println(age);
int k=0, e=0;
char c=0;
double d=0;
float f=0;
//첫번째 글자가 소문자라면 0으로 설정 초기화 한다
String n = null;
//첫번째 글자가 대문자라면 n으로 설정 초기화한다 n=null
System.out.println(n);



	
	
}
}
