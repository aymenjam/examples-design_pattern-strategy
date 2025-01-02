package ayj.examples.dps.strategy.paiement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaypalStrategy implements IPaiementStrategy {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	private String email;
	private String password;

	public PaypalStrategy() {
	}

	@Override
	public boolean payer(Payable article) {
		if (seConnecter()) {
			System.out.println(article + " payé par par Paypal.");
			return true;
		}
		System.err.println("Echèc de paiement");
		return false;
	}

	private boolean seConnecter() {
		if (email != null && password != null) {
			System.out.println(String.format("utilisateur connecté email:%s password:%s ", email, password));
			return true;
		}
		System.err.println(String.format("Echèc : utilisateur non connecté email:%s password:%s ", email, password));
		return false;
	}

	@Override
	public void saisiDetailPaiement() {

		try {
			System.out.print("email: ");
			email = reader.readLine();
			System.out.print("password: ");
			password = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}