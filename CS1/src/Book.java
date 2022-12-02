/**
 * Project 3 - Book
 * @author august bednar
 * */
public class Book {
	// TODO: member variables
	private String title;
	private String author;
	private double price;
	private char status = 'a';
	


	// constructor
	public Book( String title, String author, double price) {
		// TODO: complete the constructor's body
		this.title = title;
		this.author = author;
		this.price = price;

	}

	// getters
	public String getTitle() {
		// TODO: complete the getter's body
		return title;

	}

	// TODO: getAuthor()
	public String getAuthor() {
		// TODO: complete the getter's body
		return author;

	}


	// TODO: getPrice()

	public double getPrice() {
		// TODO: complete the getter's body
		return price;

	}

	// TODO: getStatus()
	public char getStatus() {
		// TODO: complete the getter's body
		return status;

	}


	// setter
	public void setStatus(char status) {
		// TODO: complete the setter's body
		this.status = status;

	}

	/**
	 * Convert the book info to a string
	 * @return a string describing the book
	 * */
	public String toString() {
		return "\"" + title + "\" by " + author;
	}
}
