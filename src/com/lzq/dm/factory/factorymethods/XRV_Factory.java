package com.lzq.dm.factory.factorymethods;

public class XRV_Factory implements HondaCarFactory {

	@Override
	public HondaCar createCar() {
		// TODO Auto-generated method stub
		return new XRV();
	}

}
