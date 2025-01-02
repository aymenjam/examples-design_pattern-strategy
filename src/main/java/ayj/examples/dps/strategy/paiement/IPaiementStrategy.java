package ayj.examples.dps.strategy.paiement;

public interface IPaiementStrategy {

	boolean payer(Payable article);

	void saisiDetailPaiement();

}