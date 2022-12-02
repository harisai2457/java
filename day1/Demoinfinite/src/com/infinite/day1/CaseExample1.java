package com.infinite.day1;

public class CaseExample1 {
	public void show(int n){
		switch(n){
		case 1:
			System.out.println("Hi i am hari..");
			break;
		case 2:
			System.out.println("Hi i am sai..");
			break;
		case 3:
			System.out.println("Hi i am ram..");
			break;
		case 4:
			System.out.println("Hi i am sita");
			break;
		default :
			System.out.println("Invalid choice...");
		}
	}

	public static void main(String[] args) {
		int n=1+2;
		CaseExample1 obj = new CaseExample1();
		obj.show(n);
		
		// TODO Auto-generated method stub

	}

}
