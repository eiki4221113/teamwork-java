package dto;

public class Book {
	int    id;
	String book_name;
	String creater_name;
	String publisher;
    int    isbn;
	public Book(int id, String book_name, String creater_name, String publisher, int isbn) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.creater_name = creater_name;
		this.publisher = publisher;
		this.isbn = isbn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getCreater_name() {
		return creater_name;
	}
	public void setCreater_name(String creater_name) {
		this.creater_name = creater_name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
    
    
}
