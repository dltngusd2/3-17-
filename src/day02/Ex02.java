package day02;

public class Ex02 {
public static void main(String[] args) {
//	상수화 (100 이렇듯 변하지않는 고정된값을 상수라고 한다.)
	final String KOREA = "대한민국";
//	final 은 더이상 변경되지 않게 만든다.
	System.out.println("KOREA:"+KOREA);
	String name = "김말이";
int age = 20;
double height = 173.3;
double IQ = 120;
char grade = 'B';

System.out.println("이름:" +name);
System.out.println("나이:" +age);
System.out.println("키:" +height);
System.out.println("아이큐:" +IQ);
System.out.println("등급:" +grade);



}
}