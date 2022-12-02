/**
 * Project 3 - Library
 * @author august bednar
 * @since 04/15/2020
 * */
public class Library {

	// member variables
	private int capacity; 	// the max number of books the library could has
	private int qty = 0; 	// the number of books the library has
	private Book[] booklist; // an array of book objects

	// constructor
	public Library(int capacity) {
		// TODO: initialize two member variables: capacity and booklist

		this.capacity = capacity;
		booklist = new Book[capacity];



	}

	// getters
	public int getCapacity() {
		return capacity;
	}

	public int getQty() {
		return qty;
	}

	// setters
	public void setCapacity(int n) {
		capacity = n;
	}


	/**
	 * add a new book to the library book collection
	 * @param book - a Book object
	 * */
	public void newbook(Book book) {
		// TODO: add the book object to the booklist and increse the quntity by 1
		// note that both booklist and qty are member variables

		booklist[qty] = book;
		qty++;




	}

	/**
	 * search a book by name
	 * @param title - (String) the book's title
	 * @return 	return null if book is not in the library collection,
	 * 			return the book object if it's in the library collection
	 * */
	public Book search(String title) {
		// TODO: complete the method body
		for(int i = 0; i<capacity; i++) {
			if(title.equals(booklist[i].getTitle())) {
				 
				return booklist[i] ;
			}
		}
		return null;		



	}

	/**
	 * borrow a book if it is available
	 * @param book - a Book object
	 * */
	public boolean borrow(Book book) {
		// TODO: complete the method body
		
		if(book.getStatus() == 'a') {
			book.setStatus('b');
			return true;
		}else {
			return false;
		}
	}

	/**
	 * return a book (update the book status to avaiable)
	 * @param book - a Book object
	 * */
	public void returnBook(Book book) {
		// TODO: complete the method body
		book.setStatus('a');


	}

	/**
	 * display the options menu
	 * */
	public static void displayOptions() {
		System.out.println("---------- Options Menu ----------");
		System.out.println("newbook -- add a new book to the library");
		System.out.println("search -- search for a book");
		System.out.println("borrow -- borrow a book");
		System.out.println("return -- return a book");
		System.out.println("exit -- exit the library system");
		System.out.println("-----------------------------------");
		System.out.println();
	}



}
