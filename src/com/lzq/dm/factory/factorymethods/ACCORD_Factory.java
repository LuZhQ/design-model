package com.lzq.dm.factory.factorymethods;

public class ACCORD_Factory implements HondaCarFactory {

	@Override
	public HondaCar createCar() {
		// TODO Auto-generated method stub
		return new ACCORD();
	}

}
