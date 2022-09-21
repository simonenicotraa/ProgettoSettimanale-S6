package com.epicode.gestioneincendi.centrocontrollo;
import com.epicode.gestioneincendi.canalecomunicazione.ComunicazioneConcreta;
import com.epicode.gestioneincendi.sonde.Observer;
import com.epicode.gestioneincendi.sonde.Sonda;
import com.epicode.gestioneincendi.sonde.Subject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class CentroDiControlloConcreta implements ICentroDiControllo,Observer {

private Long id;
private ComunicazioneConcreta comunicazione = new ComunicazioneConcreta();

@Override
public void allarmeIncendio(Sonda sonda) {
	comunicazione.mandaComunicazione(sonda.getId(), sonda.getLatitudine(), sonda.getLongitudine(), sonda.getLivelloDiFumo());
	
}

@Override
public void update(Subject subject) {
	allarmeIncendio((Sonda) subject);
}


}
