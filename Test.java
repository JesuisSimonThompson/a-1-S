package gebaeudeVerwaltung;

public class Test {

	public static void main(String[] args) {
		
		AsamKirche g = new AsamKirche();
		PEP p; 
		Gasteig ga; 
		
		System.out.println("Mein Gebäude: " + g);
		
		
		Reinigungskosten[] ra = { g, p, ga, /* ... */ );
		for(Reinigungskosten r : ra) {
			System.out.println(r.getKosten());
		}
		
		
	}

}
