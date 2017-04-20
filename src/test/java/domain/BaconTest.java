package domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BaconTest {

	private Bacon bacon;
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void bacon_CooksBacon_WhenCookingMethodIsDefined() {
		bacon = new Bacon();
		bacon.setCookingMethod(new FryCookingMethod());
		bacon.cookFood();
		assertTrue(bacon.getIsCooked());
	}
	
	@Test
	public void bacon_DoesNotCook_WhenCookingMethodIsNotDefined() {
		bacon = new Bacon();
		bacon.cookFood();
		assertFalse(bacon.getIsCooked());
	}

}
