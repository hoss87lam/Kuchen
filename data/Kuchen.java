package data;

/**
 * Kuchen mit name, preis, und gewicht
 * Anzeige des Kuchen nur mit Namen und Preis
 * 
 * @author Holger L.
 *
 */
public class Kuchen {
	private String name;
	private double preis;
	private double gewicht;
	
	public Kuchen(String name, double preis, double gewicht) {
		this.name = name;
		this.preis = preis;
		this.gewicht = gewicht;
	}
}
