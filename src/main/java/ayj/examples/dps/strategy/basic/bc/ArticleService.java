package ayj.examples.dps.strategy.basic.bc;

import ayj.examples.dps.strategy.dto.Article;
import ayj.examples.dps.strategy.paiement.IPaiementStrategy;

public class ArticleService {

	public void payer(Article article, IPaiementStrategy strategy) {
		strategy.payer(article);
	}

}
