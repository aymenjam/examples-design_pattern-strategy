package ayj.examples.dps.strategy.examples;

import ayj.examples.dps.strategy.dto.FluxIn;

public class ServiceFluxWithStrategy implements IServiceFlux {
	
	private FluxIn fluxIn;
	
	private ITraitementFluxStrategy strategy;

	@Override
	public void setFluxIn(FluxIn fluxIn) {
		this.fluxIn = fluxIn;
		this.strategy = TraitementFluxStrategyFactory.get(fluxIn.getType());
	}

	@Override
	public boolean fluxValid() {
		return strategy.isValid(fluxIn);
	}
	
	@Override
	public void afficherFlux() {
		if (fluxValid()) {
			strategy.afficher(fluxIn);
		}
	}
	
	@Override
	public void traiterFlux() {
		if (fluxValid()) {
			strategy.traiter(fluxIn);
		}
	}

}
