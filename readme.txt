
SONDA
id
latitudine
longitudine
livello di fumo > 5		(allarme - segnale incendio)

centro di controllo
id
lista di sonde
lista di personale

informazioni per personale 
coordinate geografiche (latitudine e longitudine)
livello fumo percepita
===========================================================


segnalazione incendi un centro di assistenza.
abbiamo delle sonde che rilevano le presenze degli incendi e notificano il caso in cui sia scoppiato un incendio.

esiste un processo che è in ascolto nel caso in cui si verificasse l'incendio


centro di controllo allerta il personale competente

ogni alert deve comunicare

1) coordinate geografiche longitudine latitudine
2) quantità di fumo

qualora la quantità sia > 5 scatta l'allarme


allerta del personale avviene tramite url
http://host/alarm?=idsonda=[idSonda]&lat=[latitude]&lon=[longitude]&smokelevel=[smokeLevel].

canale di comunicazione tra sonda e centro di controllo potrebbe essere modificato

1) sonda: id, lat,long (sono con virgola), livello di fumo
2) centro di controllo 
	Factory singleton
		la teoria dice che produce oggetti con la stessa 3) interfaccia (centro di controllo)
			un metodo per rilevare l'incendio che passa i dati delle sonde.
			esiste una classe concreta che è un 4) centro di controllo http
		
Invece di usare un centro di controllo si può utilizzare un proxy
i proxy sono delle classi che hanno la stessa interfaccia della classe principale
e al loro interno hanno un istanza dell'oggetto principale che solo 
nel momento in cui l'oggetto serve viene istanziato. (si istanzia il centro di controllo 
proxy tramite factory  solo quando si comunica l'incedio )

Observer.

nel pattern un oggetto si mette in ascolto per ricevere le notifiche.
bisogno però che gli oggeti si iscrivano "al canale"

Subject
	contiene una array list degli oggetti che devono comunicare l'informazione
	metodo per inserire un elemento
	metodo per togliere un elemento dalla lista
	
	quando avviene un incendio cicla tutto l'array list (contenete i centri di controllo)
	comunicando a ciascuno di loro l'incendio.
	
	5 comunicazione http dell'incendio tramite url