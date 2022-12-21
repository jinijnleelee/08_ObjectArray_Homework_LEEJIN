package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {

	private Product[] pro = new Product[10]; ;
	public static int count;
	
	
	Scanner sc = new Scanner(System.in);
	
	
	
	
	public void mainMenu() {
		int inNum= 0;
		do {
			System.out.println("=======제품 관리 메뉴======");			
			System.out.println( "제품 정보 추가");
			System.out.println("제품 정보 추가");
			System.out.println("프로그램 종료");
			
			System.out.println("메뉴 입력>>>");
			inNum = sc.nextInt();
			sc.nextLine();
		
		
		while(inNum) {
			case 1: 
				break;
			case 2: 
				break;
			case 3: 
				break;
	
		}
		
		
		
	}
	
	}
	public void productInput() {
		
	}
	
	
	public void productPrint() {
		
	}
	
	
	
	
	
	
	
}
