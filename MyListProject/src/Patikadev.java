import java.lang.reflect.Array;
import java.rmi.Remote;
import java.util.ArrayList;

public class Patikadev {

	
	public static void main(String[] args) {
     
		
		MyList<Integer> test = new MyList<>();
		
		test.add(10);
		test.add(20);
		test.add(30);
		test.add(40);
		test.add(50);
		test.add(60);
		test.add(70);
		test.add(80);
		test.add(90);
		
		
		System.out.println("------------------------------------------------");
		System.out.println("Başlangıç Kapasitesi : " + test.getCapacity());
		test.size();
		
		//Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı 
		//ihtiyaç duydukça 2 katı şeklinde artmalı.
		//Başlangıç kapasite değeri 10 dur 10 ve 11 tene eleman eklenmiştir
		test.add(100);
		test.add(110);
		System.out.println("10 ve 11. eleman eklendikten sonra Kapasite : " + test.getCapacity() );
		test.size();
		System.out.println("--------------------------------------");
		
		System.out.print("2.Endekste bulunan eleman : " );
		System.out.println(test.get(2));
		System.out.println(test.get(30));
		
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		
		test.toString();
		
		System.out.println("---------------------------------------");
		
		test.remove(1);
		
		System.out.println("----------------------------------------");
		
		test.toString();
		
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		System.out.println("");
		System.out.println("----------------------------------------");
		
		test.set(1, 120);;
		test.set(40, 130);
		test.toString();
		test.size();
		
		System.out.println("");
		System.out.println("---------------------------------------");
		
		
		System.out.println("Liste başından 100 elemanının index : " + test.indexOf(100));
		System.out.println("Liste başından 150 elemanının index : " + test.indexOf(150));
		System.out.println("");
		
		System.out.println("----------------------------------------");
		
		System.out.println("Liste sonundan 100 elemanının index : " + test.lastIndexOf(100));
		System.out.println("Liste sonundan 150 elemanının index : " + test.lastIndexOf(150));
		System.out.println("Liste başından 40 elemanının index : " + test.indexOf(40));
		test.add(40);
		System.out.println("Liste sonundan 40 elemanının index : " + test.lastIndexOf(40));
		System.out.println("----------------------------------------");
		System.out.println("");
		
		
		System.out.println("-----------------------------------------");
		
		Object[] arrays = test.toArray();
		
		System.out.println("");
		System.out.println("----------------------------------------");
		
		MyList<Object> mylist = test.subList(3, 6);
		mylist.toString();
		mylist.size();
		
		System.out.println("----------------------------------------");
		
		System.out.println(test.constains(40));
		
		System.out.println("----------------------------------------");
		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("Dizinin elemanları siliniyor...");
		System.out.println("");
		test.clear();
		test.toString();
		System.out.println("Kapasite : "+ test.getCapacity());
		test.size();
		System.out.println("----------------------------------------");
		
		
	}
}
