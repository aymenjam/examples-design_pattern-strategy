package ayj.examples.dps.strategy.examples;

import ayj.examples.dps.strategy.dto.FluxIn;

public class TraitementFluxStrategyFactory {

	public static ITraitementFluxStrategy get(String type) {
		if ("i".equals(type)) {
			return new IntTraitementFluxStrategy();
		}else if ("s".equals(type)) {
			return new StringTraitementFluxStrategy();
		}else if ("b".equals(type)) {
			return new BooleanTraitementFluxStrategy();
		}
		return null;
	}
	
	private static class IntTraitementFluxStrategy implements ITraitementFluxStrategy{

		@Override
		public boolean isValid(FluxIn fluxIn) {
			return fluxIn.getIntger()!=null;
		}

		@Override
		public void afficher(FluxIn fluxIn) {
			System.out.println("flux de type entié : "+fluxIn.getIntger());
			
		}

		@Override
		public void traiter(FluxIn fluxIn) {
			System.out.println("flux de type entié traité : "+fluxIn.getIntger());
		}
		
	}
	
	private static class StringTraitementFluxStrategy implements ITraitementFluxStrategy{

		@Override
		public boolean isValid(FluxIn fluxIn) {
			return fluxIn.getValeur()!=null;
		}

		@Override
		public void afficher(FluxIn fluxIn) {
			System.out.println("flux de type chaine de caratère : "+fluxIn.getValeur());
			
		}

		@Override
		public void traiter(FluxIn fluxIn) {
			System.out.println("flux de type chaine de caratère traité : "+fluxIn.getValeur());
		}
		
	}
	
	private static class BooleanTraitementFluxStrategy implements ITraitementFluxStrategy{

		@Override
		public boolean isValid(FluxIn fluxIn) {
			return fluxIn.getOk()!=null;
		}

		@Override
		public void afficher(FluxIn fluxIn) {
			System.out.println("flux de type boolean : "+fluxIn.getOk());
			
		}

		@Override
		public void traiter(FluxIn fluxIn) {
			System.out.println("flux de type boolean traité: "+fluxIn.getOk());
		}
		
	}

}
