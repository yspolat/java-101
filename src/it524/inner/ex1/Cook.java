package it524.inner.ex1;

public class Cook {

	private Eatable eatble;
	
	
	
	public void setEatble(Eatable eatble) {
		this.eatble = eatble;
	}
	
	public Eatable getEatble() {
		return eatble;
	}
	public void cookFood(Eatable eatble) {
		eatble.howToCook();
	}
}
