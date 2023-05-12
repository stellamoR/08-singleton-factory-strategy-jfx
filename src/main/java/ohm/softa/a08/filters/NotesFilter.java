package ohm.softa.a08.filters;

import ohm.softa.a08.model.Meal;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

public class NotesFilter extends FilterBase{

	private String filterStr;
	public NotesFilter(String fStr) {
		super(fStr);
	}

	@Override
	public boolean include(Meal meal) {
		for(String note : meal.getNotes()){
			if(note.contains(super.filterStr))
				return false;
		}
		return true;
	}

	@Override
	public List<Meal> filter(List<Meal> meals) {
		return super.filter(meals);
	}
}
