package domain;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class ChefTest {

	private Chef chef;
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void checkWhenOrderIsCookedAsRequestedByCustomer() {
		
		chef = new Chef();
		
		Map<Food, CookingMethod> order = new HashMap<Food, CookingMethod>();
		order.put(new Bacon(), new FryCookingMethod());
		order.put(new Bacon(), new FryCookingMethod());
		order.put(new Egg(), new FryCookingMethod());
		order.put(new Toast(), new GrillCookingMethod());
		order.put(new Coffee(), new BoilingCookingMethod());
		
		List<Food> result = chef.cookBreakfast(order);
		assertEquals(result.size() , 5);
	}
	
	@Test
	public void checkWhenOrderIsEmpty_ResultIsEmpty() {
		
		chef = new Chef();
		List<Food> result = chef.cookBreakfast(new HashMap<Food, CookingMethod>());
		assertEquals(result.size() , 0);
	}

	
	@Test
	public void checkWhenOrderIsNull_ResultIsEmpty() {
		
		chef = new Chef();
		List<Food> result = chef.cookBreakfast(null);
		assertEquals(result.size() , 0);
	}

}
