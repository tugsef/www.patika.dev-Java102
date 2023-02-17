


import java.util.ArrayList;


class Book{
	private String bookName;
	private int page;
	private String author;
	private String releaseDate;
	
	
	public Book() {}
	
	public Book(String bookName , int page , String author , String releaseDate) {
		this.bookName = bookName;
		this.page = page;
		this.author = author;
		this.releaseDate = releaseDate;
		
		
	}

	public String getBookName() {
		return bookName;
	}

	public int getPage() {
		return page;
	}

	public String getAuthor() {
		return author;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	@Override
	public String toString() {
		return "\nKitap Adı : " + this.bookName 
				+ "\nKitap Yazarı : " + this.author
				+ "\nKitap Sayfa Sayısı : " + this.page
				+ "\nKitap Basım Yılı : " + this.releaseDate;
	}
	

	
	
}
public class BookListMain {

public static void main(String[] args) {

		
		ArrayList<Book> bookList =new ArrayList<>();
		
		bookList.add(new Book("An American Tail: The Mystery of the Night Monster", 304, "Jayson Oldroyd", "2013-08-04"));
		bookList.add(new Book("Dillinger Is Dead (Dillinger è morto", 282, "Umeko Dellenty", "1991-12-18"));
		bookList.add(new Book("Shed No Tears (Känn ingen sorg)", 205, "Gilburt Mackett", "2001-04-30"));
		bookList.add(new Book("War on Democracy, The", 330, "Marla 	Rushbrooke", "1995-06-07"));
		bookList.add(new Book("Stille Nacht I: Dramolet", 254, "Brynne Hollyard", "1993-01-22"));
		bookList.add(new Book("Get Crazy", 427, "Cairistiona Caple", "2018-07-06"));
		bookList.add(new Book("Justice League: Doom ", 503, "Constanta Brayn", "2021-01-25"));
		bookList.add(new Book("Batch '81", 242, "Nikkie Aimer", "2019-06-08"));
		bookList.add(new Book("Holes", 191, "Doug Hawksworth", "2000-01-10"));
		bookList.add(new Book("Garden Lovers (Eedenistä pohjoiseen)", 436, "Lexis Skeel", "2015-03-22"));
		
		
		bookList.stream().map(bk -> bk.getBookName()+ " - " +bk.getAuthor()).forEach(bk -> System.out.println(bk));
		System.out.println("\n***********************************************************************************");
		bookList.stream().filter(bk -> bk.getPage() > 100).forEach(bk -> System.out.println(bk));
		
	}

}
