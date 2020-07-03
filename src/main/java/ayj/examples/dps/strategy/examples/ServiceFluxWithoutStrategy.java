package ayj.examples.dps.strategy.examples;

import ayj.examples.dps.strategy.dto.FluxIn;

public class ServiceFluxWithoutStrategy implements IServiceFlux {
	
	private FluxIn fluxIn;

	@Override
	public void setFluxIn(FluxIn fluxIn) {
		this.fluxIn = fluxIn;
	}

	@Override
	public boolean fluxValid() {
		if ("i".equals(fluxIn.getType())) {
			return fluxIn.getIntger()!=null;
		}else if ("s".equals(fluxIn.getType())) {
			return fluxIn.getValeur()!=null;
		}else if ("b".equals(fluxIn.getType())) {
			return fluxIn.getOk()!=null;
		}
		return false;
	}
	
	@Override
	public void afficherFlux() {
		if (fluxValid()) {
			if ("i".equals(fluxIn.getType())) {
				System.out.println("flux de type entié : "+fluxIn.getIntger());
			}else if ("s".equals(fluxIn.getType())) {
				System.out.println("flux de type chaine de caratère : "+fluxIn.getValeur());
			}else if ("b".equals(fluxIn.getType())) {
				System.out.println("flux de type boolean : "+fluxIn.getOk());
			}
		}

	}
	
	@Override
	public void traiterFlux() {
		if (fluxValid()) {
			if ("i".equals(fluxIn.getType())) {
				System.out.println("flux de type entié traité : "+fluxIn.getIntger());
			}else if ("s".equals(fluxIn.getType())) {
				System.out.println("flux de type chaine de caratère traité : "+fluxIn.getValeur());
			}else if ("b".equals(fluxIn.getType())) {
				System.out.println("flux de type boolean traité: "+fluxIn.getOk());
			}
		}

	}

}
