package jana60;

public class Indirizzo {

	private String via;
	private int numeroCivico;
	private String citta;
	
	public Indirizzo(String via, int numeroCivico, String citta) {
		this.via = via;
		this.numeroCivico = numeroCivico;
		this.citta = citta;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(int numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}
	
	public String indirizzoCompleto() {
		return "Via " + via + " " + numeroCivico + ", " + citta;
	}
	
	
}
