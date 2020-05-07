package com.javaex.practice;

public class Ex09 {
	public static void main(String[] args) {
		
		double f = 80.0;
//		System.out.println(5/9*(f-32.0));  -> 5/9의 몫은 0
		System.out.println((f-32.0)*5/9);
		/*곱셈으로 연결되어 있을 경우, 순서가 바뀌어도 값이 변하지 않음.
		연산 순서를 바꾸어 나눗셈이 뒤로가게 만들었음.
		*/
		
	}
}
