package ohm.softa.a08.filters;

public abstract class MealsFilterFactory {


	public static MealsFilter getStrategy(String key){
		switch(key){
			case "NoPork":
				return new CategoryFilter("Schwein");
			case "NoSoy":
				return new NotesFilter("Soja");
			case "All":
				return new NoFilter();
			default:
				return null;
		}
	}
}
