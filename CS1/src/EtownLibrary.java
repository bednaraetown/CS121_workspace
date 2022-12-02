
import java.util.Objects;
import java.util.Scanner;

/**
 * Project 3 - EtownLibrary
 * @author august bednar
 * @since nov 26
 * */
public class EtownLibrary {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String option;

		System.out.println("**** Welcom to Etown library ****\n");

		// TODO: call the displayOptions() method from the Library class to
		// display the library options menu
		Library.displayOptions();


		// Create a library object in Library class with capacity 1000
		Library library = new Library(1000);

		do {
			System.out.print("Enter an option: ");
			option = in.next();
			in.nextLine(); // This line you have to add (It consumes the \n character)

			if(option.equals("newbook")) {
				System.out.print("Enter the book title: ");
				String title = in.nextLine();

				System.out.print("Enter the author name: ");
				String name = in.nextLine();

				System.out.print("Enter the book price: ");
				double price = in.nextDouble();
				in.nextLine(); // This line you have to add (It consumes the \n character)

				// TODO: create a book object in Book class
				Book book = new Book(title, name, price);


				// TODO: add the newly created book to the library's booklist
				// use the library object and its newbook() method
				library.newbook(book);



				System.out.printf("The library book collections size is %d.\n\n", library.getQty());
			}
			else if (option.equals("search")) {
				System.out.print("Enter the book title: ");
				String title = in.nextLine();

				// TODO: search for the book and print the corresponding message
				try {
					if(Objects.nonNull(library.search(title))) {
						System.out.print(library.search(title).toString());
						System.out.println();
						System.out.println();
						
					}else {
						System.out.println("Doesn't have this book.");
				        System.out.println();
						System.out.println();
					}
				}
				catch(NullPointerException e) {
					System.out.println("Doesn't have this book.");
					System.out.println();
				}
				
				


			}
			else if (option.equals("borrow")) {
				System.out.print("Enter the book title: ");
				String title = in.nextLine();

				// TODO: search for the book and borrow the book

				boolean stat = library.borrow(library.search(title));

				if(stat == false) {
					System.out.print("This book is unavailable.");
					System.out.println();
					System.out.println();
					
				}else if(stat == true ){
					System.out.print("Book status: b");
					System.out.println();
					System.out.println();
				}



			}
			else if (option.equals("return")) {
				System.out.print("Enter the book title: ");
				String title = in.nextLine();

				// TODO: search for the book and return the book
				library.returnBook(library.search(title));
				System.out.print("Book status: a");
				System.out.println();
				System.out.println();




			}
			else if (!option.equals("exit")) {
				System.out.println("Error: invalid option!\n");
			}

		} while ( ! option.equals("exit") );

		System.out.println("**** See you next time! ****");

	}


}
