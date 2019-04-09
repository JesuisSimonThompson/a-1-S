package gebaeudeVerwaltung;

public class Raum {
	
	String raumName;
	String nutzungsZweck;
	
	double  grundFlaeche;
	int anzahlFenster;
	
	public Raum(String _raumName){
		this.raumName= _raumName;
		//weiterer Code
		
	}
	
	public Raum(String _raumName, String _nutzungsZweck){
		
		this(_raumName);
		this.nutzungsZweck = _nutzungsZweck;
		
	}
	
	public Raum(String _raumName, String _nutzungsZweck, double _grundFlaeche, int _anzahlFenster){
		
		this(_raumName);
		
		this.nutzungsZweck = _nutzungsZweck;
		this.grundFlaeche = _grundFlaeche;
		this.anzahlFenster = _anzahlFenster;
		
	}
	
	public String toString(){
		
		String r = super.toString();
		return  "\n" +"Raum: " +this.raumName + "\n" +
				"Nutzungszweck: " +this.nutzungsZweck  + "\n" +
				"Grundfläche: " +this.grundFlaeche +" qm" + "\n" +
				"Festeranzahl: " +this.anzahlFenster;
	}
}



