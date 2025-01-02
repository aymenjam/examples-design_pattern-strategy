package ayj.examples.dps.strategy.paiement;

public class PaiementStrategyFactory {

	static CarteDeCreditStrategy carteDeCreditStrategy = new CarteDeCreditStrategy();

	static PaypalStrategy paypalStrategy = new PaypalStrategy();

	public static IPaiementStrategy getStrategy(int i) {
		IPaiementStrategy strategy = i == 1 ? paypalStrategy : carteDeCreditStrategy;
		strategy.saisiDetailPaiement();
		return strategy;
	}

}
