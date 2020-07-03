package ayj.examples.dps.strategy.basic;

import ayj.examples.dps.strategy.basic.bc.ArticleService;
import ayj.examples.dps.strategy.dto.Article;
import ayj.examples.dps.strategy.paiement.CarteDeCreditStrategy;
import ayj.examples.dps.strategy.paiement.Payable;
import ayj.examples.dps.strategy.paiement.PaypalStrategy;

class Main0 {

		public static void main(String[] args) {
			
			
			Article ps4 = new Article("PS4",400);
			Article tabac = new Article("Tabac",10);
			
			ArticleService bc = new ArticleService();
			
			bc.payer(ps4, new PaypalStrategy("idExemple", "passwordExemple"));
			bc.payer(tabac, new CarteDeCreditStrategy( "1234567890123456", "786", "12/15"));
			
		}

}