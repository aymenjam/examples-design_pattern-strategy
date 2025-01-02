package ayj.examples.dps.strategy.examples;

import ayj.examples.dps.strategy.dto.FluxIn;

public interface ITraitementFluxStrategy {

	boolean isValid(FluxIn fluxIn);

	void afficher(FluxIn fluxIn);

	void traiter(FluxIn fluxIn);

}
