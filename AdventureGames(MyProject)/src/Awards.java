
public class Awards {
	private boolean food;
	private boolean fireFood;
	private boolean water;
	private boolean main;
	
	
	
	public Awards(boolean food, boolean fireFood, boolean water, boolean main) {
		super();
		this.food = food;
		this.fireFood = fireFood;
		this.water = water;
		this.main = main;
	}
	
	public boolean isMain() {
		return main;
	}

	public void setMain(boolean main) {
		this.main = main;
	}

	public boolean isFood() {
		return food;
	}
	public void setFood(boolean food) {
		this.food = food;
	}
	public boolean isFireFood() {
		return fireFood;
	}
	public void setFireFood(boolean fireFood) {
		this.fireFood = fireFood;
	}
	public boolean isWater() {
		return water;
	}
	public void setWater(boolean water) {
		this.water = water;
	}
	
	
	
}
