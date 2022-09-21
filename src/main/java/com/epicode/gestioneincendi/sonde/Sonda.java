package com.epicode.gestioneincendi.sonde;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class Sonda extends Subject{

private Long id;
private String longitudine;
private String latitudine;
private int livelloDiFumo;

public void rilevaLivelloFumo() {
	if(livelloDiFumo>5) {
		 notifyAllObservers();
	}
	else {
		log.info("Tutto apposto");
	}
}

}
