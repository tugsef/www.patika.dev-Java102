import java.util.ArrayList;
import java.util.Random;

public class ThreadRace implements Runnable{
	
	
	
	private static ArrayList<Integer> mainList = new ArrayList<>();
	private static ArrayList<ArrayList<Integer>> simpleList = new ArrayList<>();
	private static ArrayList<Integer> oddNumberList = new ArrayList<>();
	private static ArrayList<Integer> evenNumberLİst = new ArrayList<>();
	
	
	private int threadselect;
	
	public static synchronized void incerease(int threadselect) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Integer integer : simpleList.get(threadselect)) {
			if(integer%2==0) {
				evenNumberLİst.add(integer);
			}else
			 {
				oddNumberList.add(integer);
			}
		}
		
		
	}
	
	public ThreadRace() {
		super();
	}

	ThreadRace(int threadselecet){
		this.threadselect = threadselecet;
	}
	
	
	Random random = new Random();
	
	public void addMainArray() {
		
		for (int i = 0; i < 10000; i++) {
			mainList.add(random.nextInt(100));
		}
		
	}
	
	public void simpleList(int element) {
		for (int i = 0; i <element; i++) {
			simpleList.add(new ArrayList<>());
		}
	}

	public synchronized  void threadRace() {
		
				
		
 System.out.println((this.threadselect+1) + ".Thread işe başladı...");
		
	
		for (int i = 0 ; i <mainList.size() ; i++ ) {
			if(i%4==this.threadselect) {
				
				simpleList.get(threadselect).add(mainList.get(i));
				
			}
		}
		
	incerease(threadselect);
		
		System.out.println((this.threadselect+1) + ".Thread işini bitirdi");
		
		System.out.println("--------------------------------------------------------");
		System.out.println((this.threadselect+1) + ".Listenin eleman sayısı : " + simpleList.get(threadselect).size());
		System.out.println("Çift Listesinin Sayısı : " + evenNumberLİst.size());
		System.out.println("Tek Listesinin eleman sayısı : " + oddNumberList.size());
		System.out.println("Tek Çift Toplam : " + (evenNumberLİst.size() + oddNumberList.size() ));
		System.out.println("--------------------------------------------------------");
		
		

	}
	
	
	@Override
	public void run() {
	
			threadRace();
			
	
	}

	public static ArrayList<Integer> getMainList() {
		return mainList;
	}

	public static void setMainList(ArrayList<Integer> mainList) {
		ThreadRace.mainList = mainList;
	}

	public static ArrayList<Integer> getOddNumberList() {
		return oddNumberList;
	}

	public static void setOddNumberList(ArrayList<Integer> oddNumberList) {
		ThreadRace.oddNumberList = oddNumberList;
	}

	public static ArrayList<Integer> getEvenNumberLİst() {
		return evenNumberLİst;
	}

	public static void setEvenNumberLİst(ArrayList<Integer> evenNumberLİst) {
		ThreadRace.evenNumberLİst = evenNumberLİst;
	}

	public int getThreadselect() {
		return threadselect;
	}

	public void setThreadselect(int threadselect) {
		this.threadselect = threadselect;
	}

	
 

	
	
	
	
	
}
