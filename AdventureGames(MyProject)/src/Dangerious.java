
abstract class Dangerious implements OnLocation{
	Awards awards = new Awards(false, false, false,false);
	
	
	public abstract void war(Character character , Monsters[] monsters, Awards awards) ;
	
	
	
}
