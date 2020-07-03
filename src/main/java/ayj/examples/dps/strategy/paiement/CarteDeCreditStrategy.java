package ayj.examples.dps.strategy.paiement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarteDeCreditStrategy implements IPaiementStrategy {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	private String numeroCarte;
	private String cryptogramme;
	private String dateExpiration;

	public CarteDeCreditStrategy() {
	}

	public CarteDeCreditStrategy(String num, String crypto, String date) {
		this.numeroCarte = num;
		this.cryptogramme = crypto;
		this.dateExpiration = date;
	}

	@Override
	public boolean payer(Payable article) {
		if (verifierCarte()) {
			System.out.println(article + " payé par carte de crédit.");
			return true;
		}
		System.err.println("Echèc de paiement");
		return false;
	}

	private boolean verifierCarte() {
		if (numeroCarte != null && cryptogramme != null && dateExpiration != null) {
			System.out.println(String.format("validation des données bancaires : %s %s %s", numeroCarte, cryptogramme, dateExpiration));
			return true;
		}
		System.err.println(String.format("Echèc de validation des données bancaires : %s %s %s", numeroCarte, cryptogramme, dateExpiration));
		return false;
	}

	@Override
	public void saisiDetailPaiement() {
		try {
			System.out.print("numeroCarte: ");
			numeroCarte = reader.readLine();
			System.out.print("dateExpiration: ");
			dateExpiration = reader.readLine();
			System.out.print("cryptogramme: ");
			cryptogramme = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}