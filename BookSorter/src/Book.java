

public class Book implements Comparable<Book> {
	
	private String bookName;
	private int page;
	private String author;
	private String publishDate;
	
	public Book(String bookName, int page, String author, String publishDate) {
		super();
		this.bookName = bookName;
		this.page = page;
		this.author = author;
		this.publishDate = publishDate;
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
	public String getPublishDate() {
		return publishDate;
	}
	
	@Override
	public int compareTo(Book o) {
		
		return (this.bookName).compareTo(o.getBookName());
	}
	
	@Override
	public String toString() {
		String message = "Kitabın Adı          : " + this.bookName + "\n"
				        +"Kitabın Yazarı       : " + this.author + "\n"
				        +"Kitabın Sayfa Sayısı : " + this.page + "\n"
				        +"Kitabın Basım Yılı   : " + this.publishDate;
		return message;
	}
	
	
	
}
