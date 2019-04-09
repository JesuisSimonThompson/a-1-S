
package gebaeudeVerwaltung;

public abstract class Gebaeude {
	
	String gebaeudeName;       //Holiday Inn
	String verantwortlicherProgrammierer;  //Benedikt, Dennis, Susanne,...
	
	String strasse;          //Stahlgrubering
	String hausnummer;       //12
	int plz;                //60963
	
	int anzahlRaeume;
	int anzahlStockwerke;
	
	int anzahlEingaenge;
	
	String kontakt;      //Herr Müller
	String telNummer;    //+4998-173876-246

	/*Der Konstruktor dient dazu ein Objekt zu erzeugen*/
	public Gebaeude(String _gebaeudeName, String _verantworlicherProgrammierer, String _strasse, String _hausnummer, int _plz, String _kontakt, String _telNummer){
		
		gebaeudeName =_gebaeudeName;
		verantwortlicherProgrammierer = _verantworlicherProgrammierer;
		strasse = _strasse;
		hausnummer = _hausnummer;
		plz = _plz;
		kontakt = _kontakt;
		telNummer = _telNummer;
		
	}
	
	abstract double getGesamtFlaeche();
	
	abstract double getAnzahlFenster();
	
	public String toString(){
		
		return "\n" + "Gebäude: " +this.gebaeudeName +"\n" +
				"Adresse: " +this.strasse +" " +this.hausnummer +"\n" +
				"Kontakt: " +this.kontakt + "\n" +
				"Telefonnummer: " + this.telNummer + "\n" + "\n" + 
				"Gesamtgrundfläche: "+ getGesamtFlaeche() + "qm" +"\n" +
				"Fensteranzahl: " + getAnzahlFenster();
 	}
	
	
	
}
