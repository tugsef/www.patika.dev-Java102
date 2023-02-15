import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadRace implements Runnable{
	
	
	
	private static ArrayList<Integer> mainList = new ArrayList<>();
	private static ArrayList<ArrayList<Integer>> simpleList = new ArrayList<>();
	private static ArrayList<Integer> oddNumberList = new ArrayList<>();
	private static ArrayList<Integer> evenNumberLİst = new ArrayList<>();
	
	
	private int threadselect;
	
	
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

	public  void threadRace() {
		
				
		System.out.println("******************************************************\n");
 System.out.println((this.threadselect+1) + ".Thread işe başladı...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		for (int i = 0 ; i <mainList.size() ; i++ ) {
			if(i%4==this.threadselect) {
				
				simpleList.get(threadselect).add(mainList.get(i));
				
			}
		}
		
		for (Integer integer : simpleList.get(threadselect)) {
			if(integer%2==0) {
				evenNumberLİst.add(integer);
			}
			if(integer%2==1) {
				oddNumberList.add(integer);
			}
		}
		
		System.out.println((this.threadselect+1) + ".Thread işini bitirdi");
		
		System.out.println("--------------------------------------------------------");
		System.out.println((this.threadselect+1) + ".Listenin eleman sayısı : " + simpleList.get(threadselect).size());
		System.out.println("Çift Listesinin Sayısı : " + evenNumberLİst.size());
		System.out.println("Tek Listesinin eleman sayısı : " + oddNumberList.size());
		System.out.println("Tek Çift Toplam : " + (evenNumberLİst.size() + oddNumberList.size() ));
		System.out.println("--------------------------------------------------------");
		
		System.out.println("\n******************************************************");

	}
	
	
	@Override
	public void run() {
	lock.lock();
			threadRace();
		
	lock.unlock();	
	}

	
 

	
	
	
	
	
}
