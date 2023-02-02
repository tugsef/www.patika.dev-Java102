import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PatikaDev {

	public static void main(String[] args) {
//		List<Book> books = new LinkedList<>();
//		
//		books.add(new Book("Alis Harikalar Diyarında", 96, "Levis Corrol", "12.10.2023"));
//		books.add(new Book("Tiryaki Sözleri", 86, "Cenap Şehabettin", "12.10.1991"));
//		books.add(new Book("Vatan Yahut Silistre", 80, "Namık Kemal", "12.10.23"));
//		books.add(new Book("Yaşlı Adam ve Deniz", 115, "Ernest Hemingway", "12.10.23"));
//		books.add(new Book("Pinokyoe", 142, "C.Collodi", "12.10.23"));
//		books.add(new Book("Keloğlan Masalları", 400, "Derleme", "12.10.23"));
//		books.add(new Book("Surname - Bir Osmanlı Macerası", 128, " İskender Pala", "12.10.23"));
//		books.add(new Book("Zamanın Kısa Tarihi", 200,  "Stephen Hawking", "12.10.23"));
//		books.add(new Book("Insanlığın Yeme Tarihi", 110,  "Tom Standage", "12.10.23"));
//		books.add(new Book("Elementler", 176,  "Anja Royne", "12.10.23"));
//		
//		Collections.sort(books);
//		
//		for (Book book : books) {
//			System.out.println("*********************");
//			System.out.println(book);
//			System.out.println("*********************");
//		}
		TreeSet<Book> treeSet = new TreeSet(new SorterNumber());
		
		treeSet.add(new Book("Alis Harikalar Diyarında", 96, "Levis Corrol", "12.10.2023"));
		treeSet.add(new Book("Tiryaki Sözleri", 86, "Cenap Şehabettin", "12.10.1991"));
		treeSet.add(new Book("Vatan Yahut Silistre", 80, "Namık Kemal", "12.10.23"));
		treeSet.add(new Book("Yaşlı Adam ve Deniz", 115, "Ernest Hemingway", "12.10.23"));
		treeSet.add(new Book("Pinokyoe", 142, "C.Collodi", "12.10.23"));
		
		
		
		for (Book book : treeSet) {
			System.out.println("*********************");
			System.out.println(book);
			System.out.println("*********************");
		}
	}

}
