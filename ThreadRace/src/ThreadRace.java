import java.util.ArrayList;
import java.util.Random;

public class ThreadRace {
	
	private  ArrayList<Integer> mainList = new ArrayList<>();
	private  ArrayList<ArrayList<Integer>> simpleList = new ArrayList<>();
	private  ArrayList<Integer> oddNumberList = new ArrayList<>();
	private  ArrayList<Integer> evenNumberLİst = new ArrayList<>();
	
	private Random random= new Random();
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	private int count = 0;
	
	public void addMainArray() {
		
		for (int i = 0; i < 10000; i++) {
			mainList.add(random.nextInt(100));
		}
		System.out.println("\nBaşlangıç Listesi Eleman Sayısı : " + mainList.size() + "\n");
	}
	
	public void simpleList(int element) {
		for (int i = 0; i <element; i++) {
			simpleList.add(new ArrayList<>());
		}
	}
	
	public void increase(int id) {
		synchronized (lock2) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Integer integer : simpleList.get(id)) {
			if(integer%2==0) {
				evenNumberLİst.add(integer);
			}else
			 {
				oddNumberList.add(integer);
			}
		}
		}
		
	}
	public void info() {
		
		
		System.out.println("\n\nBaşlangıç Listesi " + mainList);
		for (int i = 0; i < simpleList.size(); i++) {
			System.out.println((i+1) + ".liste :  " + simpleList.get(i));
		}
		System.out.println("Çift Listesi : " + evenNumberLİst);
		System.out.println("Tek Listesi : " + oddNumberList);
	}
	
	public void threadRace(int id) {
		
		
		
			
		
		 System.out.println((id+1) + ".Thread Yarışa Başladı...");
			
		 synchronized (lock1) {
			for (int i = 0 ; i <mainList.size() ; i++ ) {
				if(i%4==id) {
					
					simpleList.get(id).add(mainList.get(i));
					
				}
			}
		 }
		increase(id);
			
			System.out.println("\n" + (id+1) + ".Thread Yarışı Bitirdi ");
			count++;
			System.out.println(count + ".Sırada Tamamladı\n");
			
			
			if(count==1) {
				System.out.println("\n\n****Yarışın Kazananı : " + (id+1) + " .Thread****\n\n");
			}
			
			
			System.out.println("--------------------------------------------------------");
			System.out.println((id+1) + ".Listenin eleman sayısı : " + simpleList.get(id).size());
			System.out.println("Çift Listesinin Sayısı : " + evenNumberLİst.size());
			System.out.println("Tek Listesinin eleman sayısı : " + oddNumberList.size());
			System.out.println("Tek Çift Toplam : " + (evenNumberLİst.size() + oddNumberList.size() ));
			System.out.println("--------------------------------------------------------");
			
		
	}

	
}
