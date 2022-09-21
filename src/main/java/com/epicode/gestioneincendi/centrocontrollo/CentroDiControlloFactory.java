package com.epicode.gestioneincendi.centrocontrollo;

public class CentroDiControlloFactory {

	public ICentroDiControllo creaCentroDiControllo() {
		return new CentroDiControlloConcreta();
	}
}
