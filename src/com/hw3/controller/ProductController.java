package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {

	private Product[] pro = new Product[10]; ;
	public static int count;
	
	
	Scanner sc = new Scanner(System.in);
	
	
	
	
	public void mainMenu() {
	int menuNum = 0;
		
		do {
			System.out.println("==제품 관리 메뉴==");
			System.out.println("1제품 정보 추가");
			System.out.println("2제품 전체 조회");
			System.out.println("0프로그램 종료");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			
		switch(menuNum ) {
		case 1 : 
			productInput();
			break;
		case 2 :
			productPrint();
			break;
		case 0 :System.out.println("종료");  
		break;
	

		default : System.out.println("\n잘못 입력 하셨습니다");
		}
		
		
		}while(menuNum !=0);
			
	}
	
	
	
	public void productInput() {
		String bk = "";
		System.out.println("==제품 관리 메뉴==");
		bk = sc.next();
		sc.nextLine();
		
		//키보드로 도서 정보를 입력 받아 객체 생성
		//-> Product 생성자 내부에서 Product
		for(int i= 0; i<pro.length;i++) {
			if(pro[i]==null) {
				pro[i]=
				
			}
			
		}
		
	}
	
	
	public void productPrint() {
		
	}
	
	
	
	
	
	
	
}
