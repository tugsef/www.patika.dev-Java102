
public class TestGame {
	public static void main(String[] args) {
		boolean game = true;
		boolean goName=true;
		int count = 0;
		int goCount = 0;
		while(goName) {
			goCount++;
			System.out.println("-----------------------------------------");
		while(game) {
			count++;
			System.out.println(count);
			if(count==5) {
				game = false;
				goName = false;
			}
			
			
		}
		System.out.println("ilk While Bitti....");
		System.out.println("-----------------------------------------------");
			if(goCount==1) {
				goName = false;
				
			}
		}
		System.out.println("İ While Bitti....");
		
	
		
		
	}
}
