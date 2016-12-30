package com.lzq.dm.factory.abstractfactory;

public class HondaCarEmission3Factory implements HondaCarFactory {

	@Override
	public ACCORD createACCORD() {
		// TODO Auto-generated method stub
		return new ACCORD_Emission3();
	}

	@Override
	public VEZEL createVEZEL() {
		// TODO Auto-generated method stub
		return new VEZEL_Emission3();
	}

	@Override
	public XRV createXRV() {
		// TODO Auto-generated method stub
		return new XRV_Emission3();
	}

}
