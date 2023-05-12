package ohm.softa.a08.filters;

import ohm.softa.a08.model.Meal;

import java.util.ArrayList;
import java.util.List;

public abstract class FilterBase implements MealsFilter{
	public abstract boolean include(Meal meal);
	public String filterStr;

	public FilterBase(String fStr){
		filterStr = fStr;
	}
	@Override
	public List<Meal> filter(List<Meal> meals) {
		List<Meal> out = new ArrayList<>();
		for(Meal m :meals){
			if(include(m)){
				out.add(m);
			}
		}
		return out;
	}
}
