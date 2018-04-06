package it.polito.ooprog.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Book[] books = new Book[3];

		// Create and initialize object using the constructor
		Book book = new Book("The sleeping dool", "Deaver", 12.3);
		System.out.println(book);
		// Add the book to the books array
		books[0] = book;

		// Create the object using the empty constructor
		book = new Book();
		// Initialize the object using setters
		book.setAuthor("Deaver");
		book.setTitle("The October List");
		book.setPrice(15);
		System.out.println(book);
		// Add the book to the books array
		books[1] = book;

		SpecialEdition se = new SpecialEdition("The sleeping dool", "Deaver", 12.3);
		System.out.println(se);
		System.out.println("\nBook author: " + se.getAuthor());

		// The following instruction is not possible if the variable reference "se" is
		// defined of type Book
		System.out.println("Is it a special edition? " + se.isSpecialEdition());

		// Add the book to the books array
		System.out.println("Price of the book: " + se.getPrice());
		books[2] = se;

		System.out.println(String.format("\n%-20s %-40s %-10s", "Author", "Title", "Price"));
		for (int i = 0; i < 3; i++) {
			System.out.println(String.format("%-20s %-40s %-10f", books[i].getAuthor(), books[i].getTitle(), books[i].getPrice()));
		}

		System.out.println("\n\n");

		// Get input from the user

		// Define two arrays where to save books and special editions
		Book[] bookList = new Book[3];
		Book[] specialEditionList = new Book[3];

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {

			System.out.println("Insert a title");
			String title = scanner.nextLine();

			System.out.println("Insert a author");
			String author = scanner.nextLine();

			System.out.println("Insert a price");
			double price = Double.parseDouble(scanner.nextLine());

			bookList[i] = new Book(title, author, price);
			specialEditionList[i] = new SpecialEdition(title, author, price);
		}
		scanner.close();

		// Print books
		System.out.println("\nBooks:");
		System.out.println(String.format("%-20s %-40s %-10s", "Author", "Title", "Price"));
		for (Book b : bookList) {
			if (b != null) {
				System.out.println(String.format("%-20s %-40s %-10f", b.getAuthor(), b.getTitle(), b.getPrice()));
			}
		}

		// Print special Editions
		System.out.println("\nSpecial Editions:");
		for (Book b : specialEditionList) {
			if (b != null) {
				System.out.println(String.format("%-20s %-40s %-10f", b.getAuthor(), b.getTitle(), b.getPrice()));
			}
		}

	}

}
