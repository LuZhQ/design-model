package com.lzq.dm.strategy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double price = 500;
		
		String customerA = "A";
		ChargeContext chargeContextA = new ChargeContext(customerA);
		double realCostA = chargeContextA.getResult(price);
		System.out.println("A类顾客需付费： "+realCostA);
		
		String customerB = "B";
		ChargeContext chargeContextB = new ChargeContext(customerB);
		double realCostB = chargeContextB.getResult(price);
		System.out.println("B类顾客需付费： "+realCostB);
		
		String customerC = "C";
		ChargeContext chargeContextC = new ChargeContext(customerC);
		double realCostC = chargeContextC.getResult(price);
		System.out.println("C类顾客需付费： "+realCostC);
	}

}
