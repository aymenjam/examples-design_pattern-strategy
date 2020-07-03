package ayj.examples.dps.strategy.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import ayj.examples.dps.strategy.basic.bc.ArticleService;
import ayj.examples.dps.strategy.dto.Article;
import ayj.examples.dps.strategy.paiement.CarteDeCreditStrategy;
import ayj.examples.dps.strategy.paiement.IPaiementStrategy;
import ayj.examples.dps.strategy.paiement.PaiementStrategyFactory;
import ayj.examples.dps.strategy.paiement.Payable;
import ayj.examples.dps.strategy.paiement.PaypalStrategy;

class Main1 {
	
	private static Map<Integer, Article> articles = new HashMap<>();
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
    static {
        articles.put(1, new Article("PS4",400));
        articles.put(2, new Article("Tabac",10));

    }

		public static void main(String[] args) throws NumberFormatException, IOException {
			
            System.out.println(String.format("choisi un article: \n1 - %s \n2 - %s",articles.get(1),articles.get(2)));
			
            Article article = articles.get(Integer.parseInt(reader.readLine()));
			
			System.out.println("Choisi la methode de paiement:\n1 - PalPay\n2 - carte de crédit.");
			
			IPaiementStrategy paiementStrategy = PaiementStrategyFactory.getStrategy(Integer.parseInt(reader.readLine()));
			
			ArticleService bc = new ArticleService();
			
			bc.payer(article, paiementStrategy);
			
		}

}