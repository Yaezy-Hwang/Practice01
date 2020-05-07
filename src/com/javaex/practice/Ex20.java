package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 갯수: ");
		int w4 = sc.nextInt();
		
		System.out.print("100원 갯수: ");
		int w3 = sc.nextInt();
		
		System.out.print("50원 갯수: ");
		int w2 = sc.nextInt();
		
		System.out.print("10원 갯수: ");
		int w1 = sc.nextInt();
		
		System.out.println("동전의 총 합은 "+(w4*500+w3*100+w2*50+w1*10)+" 원 입니다.");
		
		sc.close();
		
	}

}
