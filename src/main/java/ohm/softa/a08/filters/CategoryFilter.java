package ohm.softa.a08.filters;

import ohm.softa.a08.model.Meal;

import java.util.List;

public class CategoryFilter extends FilterBase{

	public CategoryFilter(String fStr){
		super(fStr);
	}

	@Override
	public boolean include(Meal meal) {
		return !meal.getCategory().contains(super.filterStr);
	}

	@Override
	public List<Meal> filter(List<Meal> meals) {
		return super.filter(meals);
	}
}
