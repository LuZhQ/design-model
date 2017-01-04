package com.lzq.dm.strategy;

public class ChargeRebate implements Charge {

	@Override
	public double getRealCost(double price) {
		// TODO Auto-generated method stub
		return price * 0.5;
	}

}
