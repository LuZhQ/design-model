package com.lzq.dm.strategy;

public class ChargeContext {
	
	private Charge charge;
	
	//把判断放在 ChargeContext 类的构造方法里（可以看成简单工厂模式），这也是策略模式的缺点之一
	public ChargeContext(String customerType) {
		
		switch (customerType) {
		case "A":
			this.charge = new ChargeNormal();
			break;
		case "B":
			this.charge = new ChargeReturn();
			break;
		case "C":
			this.charge = new ChargeRebate();
			break;
		default:
			break;
		}
	}
	
	public double getResult(double price){
		return this.charge.getRealCost(price);
	}
}
