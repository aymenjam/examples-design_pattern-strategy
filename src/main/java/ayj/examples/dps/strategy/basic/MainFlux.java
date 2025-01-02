package ayj.examples.dps.strategy.basic;

import ayj.examples.dps.strategy.dto.FluxIn;
import ayj.examples.dps.strategy.examples.IServiceFlux;
import ayj.examples.dps.strategy.examples.ServiceFluxWithStrategy;
import ayj.examples.dps.strategy.examples.ServiceFluxWithoutStrategy;

public class MainFlux {
	
	static ServiceFluxWithoutStrategy serviceFluxWithoutStrategy = new ServiceFluxWithoutStrategy();
	
	static ServiceFluxWithStrategy serviceFluxWithStrategy = new ServiceFluxWithStrategy();
	
	public static void main(String[] args) {
		IServiceFlux service = serviceFluxWithoutStrategy;
		//IServiceFlux service = serviceFluxWithStrategy;
		
		service.setFluxIn(new FluxIn(5));
		service.afficherFlux();
		service.traiterFlux();
		
		service.setFluxIn(new FluxIn("blabla"));
		service.afficherFlux();
		service.traiterFlux();
		
		service.setFluxIn(new FluxIn(true));
		service.afficherFlux();
		service.traiterFlux();
		
		
	}

}
