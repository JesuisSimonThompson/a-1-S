package gebaeudeVerwaltung;

public class AsamKirche extends Gebaeude implements Reinigungskosten {

	
	Raum hauptraum;
	Raum sakristei;
	Raum beichtstuhl;
	Raum vorraum;
	Raum empore;
	
	public AsamKirche(){
	
		super("Asamkirche", "Susanne", "Sendlinger Straße", "32", 80331, "Asam-Brüder", "+49 897564-0");  //super ruft Konstruktor der super class (Oberklasse) auf
		
		hauptraum = new Raum ("Kircheninneres", "Gottesdienst", 209.55, 18);
		sakristei = new Raum ("Sakristei", "Aufbewahrung der heiligen Gegenstände", 25, 1);
		beichtstuhl = new Raum ("Beichtstuhl", "Sündenbekenntnis der Gläubigen", 3.11, 0);
		vorraum = new Raum ("Vorraum", "Eingangsbereich der Kirche", 15.6, 0);
		empore = new Raum ("Empore", "Standort der Orgel", 12, 0);
	}
	
	
	double getAnzahlFenster(){
		
		return hauptraum.anzahlFenster + sakristei.anzahlFenster + beichtstuhl.anzahlFenster + vorraum.anzahlFenster + empore.anzahlFenster;
	}
	
	double getGesamtFlaeche() {
		
		return hauptraum.grundFlaeche + sakristei.grundFlaeche + beichtstuhl.grundFlaeche + vorraum.grundFlaeche + empore.grundFlaeche;
		
	}
	
	String getBesonderheiten(){
		return "Goldenes Skelett";
	}
	
	public double getKosten(){
		return getAnzahlFenster()*73.34 + getGesamtFlaeche()*9.99;
	}
	
	
	public String toString() {
		
		String b = this.getBesonderheiten();
		
		return super.toString() + "\n" +
				"Besonderheiten: " + b + "\n"+ 
				 hauptraum + "\n"+
				 sakristei +"\n"+
				 beichtstuhl + "\n"+
				 vorraum + "\n"+
				 empore + "\n" +"\n" +
				 "Reinigunskosten für das gesamte Gebäude: "+ getKosten() + " Euro";
				
		
	}

}
