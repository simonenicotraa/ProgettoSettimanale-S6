package com.epicode.gestioneincendi;

import com.epicode.gestioneincendi.centrocontrollo.CentroDiControlloConcreta;
import com.epicode.gestioneincendi.centrocontrollo.CentroDiControlloFactory;
import com.epicode.gestioneincendi.sonde.Observer;
import com.epicode.gestioneincendi.sonde.Sonda;

public class Main {

	public static void main(String[] args) {
		
		Observer observer1 = new CentroDiControlloConcreta();
		Observer observer2 = new CentroDiControlloConcreta();
		
		
		CentroDiControlloFactory factory = new CentroDiControlloFactory();
		
		
		Sonda sonda = new Sonda();
		sonda.setId((long) 1);
		sonda.setLatitudine("11,22,33");
		sonda.setLongitudine("11,22,33");
		sonda.setLivelloDiFumo(1);
		
		sonda.aggiungiObserver((Observer) factory.creaCentroDiControllo());
		sonda.aggiungiObserver(observer2);
		sonda.rilevaLivelloFumo();
		sonda.setLivelloDiFumo(6);
		sonda.rilevaLivelloFumo();

	}

}
