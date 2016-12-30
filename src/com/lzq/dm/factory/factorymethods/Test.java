package com.lzq.dm.factory.factorymethods;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VEZEL_Factory vf = new VEZEL_Factory();
		vf.createCar();
		
		XRV_Factory xf = new XRV_Factory();
		xf.createCar();
		
		ACCORD_Factory af = new ACCORD_Factory();
		af.createCar();
	}

}
