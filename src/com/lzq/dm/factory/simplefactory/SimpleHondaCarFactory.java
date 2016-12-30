package com.lzq.dm.factory.simplefactory;

public class SimpleHondaCarFactory {
	
	public static HondaCar createCar(String type){
		HondaCar car = null;
		switch (type) {
		case "XRV":
			car = new XRV();
			break;
		case "VEZEL":
			car = new VEZEL();
			break;
		case "ACCORD":
			car = new ACCORD();
			break;
		default:
			break;
		}
		return car;
	}

}
