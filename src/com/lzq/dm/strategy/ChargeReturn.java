package com.lzq.dm.strategy;

public class ChargeReturn implements Charge {

	@Override
	public double getRealCost(double price) {
		// TODO Auto-generated method stub
		double realPrice = 0;
		if(price >= 200){
			realPrice = price - 40;
		}
		return realPrice;
	}

}
