package net.code.java.spring;

public class SpringAdded {

	private Integer bookid;
	private String title;
	private String author;
	private float price;

	public SpringAdded(Integer bookid, String title, String author, float price) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SpringAdded [bookid=" + bookid + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

}
