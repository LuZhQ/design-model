package com.lzq.dm.strategy;

public class ChargeContext {
	
	private Charge charge;
	
	//���жϷ��� ChargeContext ��Ĺ��췽������Կ��ɼ򵥹���ģʽ������Ҳ�ǲ���ģʽ��ȱ��֮һ
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
