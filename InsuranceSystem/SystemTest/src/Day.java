
public enum Day {

	
	MONDAY(1),
	THUESDAY(2),
	WENDESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6),
	SUNDAY(7);
	
	private int day;
	
	Day(int day){
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	
}
