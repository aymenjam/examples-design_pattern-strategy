package ayj.examples.dps.strategy.examples;

import ayj.examples.dps.strategy.dto.FluxIn;

public interface IServiceFlux {

	void setFluxIn(FluxIn fluxIn);

	boolean fluxValid();

	void afficherFlux();

	void traiterFlux();

}