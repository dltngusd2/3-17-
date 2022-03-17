package day02;

public class Ex01 {
	public static void main(String[] args) {
	/*
	 변수
	 - 데이터를 저장하기 위한 공간
	 - 저장하기 위한 공간이기에 언제든지 값의 변경이 가능
	 - 저장공간(변수)이름[한글XX]을 지울때 공백은 허용하지 않는다.
	  
	 자료형(type)
	 - int : 정수를 표현 : 4byte
	 - char : 문자 표현 : 1byte
	 - float : 실수 표현 : 4byte
	 - double : 실수 표현 : 8byte
	 */
//	int age = 30;
//	double weight = 55.0;
//	double height = 163.0;
//	System.out.println("나의 나이는 "+age);
//	System.out.println("나의 나이는 "+weight);
//	System.out.println("나의 나이는 "+height);
//	
	
	
	
	
	
	char ch = 'A';
//	int num = 5;
//	int ret;
	int num = 5, ret;
	ret = ch + num;	
	System.out.println("ret : "+ret);
	System.out.println("ch : "+ch);
	System.out.println("num : "+num);
//	이 연산에서 ret이 70인 이유는 아스키코드를 확인하면 되는데
//	A는 65로 컴퓨터가 인식하기 때문이다.
	
	ch = 'B';
//	위에서 char 로 ch를 만들었기때문에 생략해도 사용할수있다. 
//	num또한 마찬가지다
	num = 1;
	
	System.out.println("변경후");
	
	System.out.println("ret : "+ret);
	System.out.println("ch : "+ch);
	System.out.println("num : "+num);
	
	
	System.out.println("ret : "+(char)ret);
	System.out.println("ch : "+(int)ch);
//	형변환
//	- 자료형에 대하여 변화
//	- 형변환 ㅡ> type-casting
	}
}