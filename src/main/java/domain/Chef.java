package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Chef {

	public Chef() {
	}

	public List<Food> cookBreakfast(Map<Food, CookingMethod> order) {
		List<Food> breakFastItemsListWithAssignedMethods;
		List<Food> cookedBreakfast = new ArrayList<Food>();
		if (null != order && !order.isEmpty()) {
			breakFastItemsListWithAssignedMethods = assignCookingMethod(order);

			for (Food foodItem : breakFastItemsListWithAssignedMethods) {
				foodItem.cookFood();
				cookedBreakfast.add(foodItem);
			}
		}

		return cookedBreakfast;
	}

	private List<Food> assignCookingMethod(Map<Food, CookingMethod> breakfastItems) {
		List<Food> breakFastItemsListWithAssignedMethods = new ArrayList<Food>();

		for (Entry<Food, CookingMethod> entry : breakfastItems.entrySet()) {
			Food item = entry.getKey();
			item.setCookingMethod(entry.getValue());
			breakFastItemsListWithAssignedMethods.add(item);
		}

		return breakFastItemsListWithAssignedMethods;
	}

}
