package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int EBOB,EKOK,smallest,theBiggest,n1,n2,increasingNumber=1,tempNumber;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("n1 sayisini giriniz: ");
		n1 = scan.nextInt();
		
		System.out.println("n2 sayisini giriniz: ");
		n2 = scan.nextInt();
		
		smallest = Math.min(n1, n2);
		theBiggest = Math.max(n1, n2);
		tempNumber=smallest;
		
		
		while(tempNumber>=1) {
			
			if(smallest%tempNumber==0 && theBiggest%tempNumber==0) {
				EBOB = tempNumber;
				System.out.println(EBOB);
				break;
			}
			tempNumber--;
		}
		
		while(increasingNumber<=(smallest*theBiggest)) {
			
			if(increasingNumber%smallest==0 && increasingNumber%theBiggest==0) {
				EKOK = increasingNumber;
				System.out.println(EKOK);
				break;
			}
			increasingNumber++;
		}
		

	}

}
