package com.epicode.gestioneincendi.canalecomunicazione;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class ComunicazioneConcreta extends CanaleComunicazione{
 String url = "http://host/alarm";

public void mandaComunicazione(Long idSonda, String latitudine, String longitudine,int livelloFumo) {
	log.info("ID-SONDA= "+idSonda+" LATITUDINE= "+latitudine+" LONGITUDINE= "+longitudine+" LIVELLO-DI-FUMO= "+livelloFumo);
	log.info("Incendio: " + url + "?=idsonda="+idSonda+"&lat"+latitudine+"&lon"+longitudine+"&smokeLevel"+livelloFumo);
}
}
