package com.lzq.dm.factory.abstractfactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HondaCarEmission2Factory hondaCarEmission2Factory = new HondaCarEmission2Factory();
		hondaCarEmission2Factory.createACCORD();
		hondaCarEmission2Factory.createVEZEL();
		hondaCarEmission2Factory.createXRV();
		
		HondaCarEmission3Factory hondaCarEmission3Factory = new HondaCarEmission3Factory();
		hondaCarEmission3Factory.createACCORD();
		hondaCarEmission3Factory.createVEZEL();
		hondaCarEmission3Factory.createXRV();
		
	}

}
