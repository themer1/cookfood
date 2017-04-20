package domain;


public abstract class Food {
	protected boolean isCooked;
	CookingMethod cookingMethod;
	
	public void cookFood() {
		if (cookingMethod == null) {
			return;
		}
		cookingMethod.cook();
		isCooked = true;
	}
	

	public CookingMethod getCookingMethod() {
		return cookingMethod;
	}

	public void setCookingMethod(CookingMethod cookingMethod) {
		this.cookingMethod = cookingMethod;
	}
	
	public boolean getIsCooked() {		
		return isCooked;
	}


}
