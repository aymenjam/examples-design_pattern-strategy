package ayj.examples.dps.strategy.dto;

public class FluxIn {
	
	private String type;
	private Integer intger;
	private String valeur;
	private Boolean ok;
	
	
	
	public FluxIn(Boolean ok) {
		this.type = "b";
		this.ok = ok;
	}
	public FluxIn(String valeur) {
		this.type = "s";
		this.valeur = valeur;
	}
	public FluxIn(Integer intger) {
		this.type = "i";
		this.intger = intger;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getIntger() {
		return intger;
	}
	public void setIntger(Integer intger) {
		this.intger = intger;
	}
	public String getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	public Boolean getOk() {
		return ok;
	}
	public void setOk(Boolean ok) {
		this.ok = ok;
	}
	
	

}
